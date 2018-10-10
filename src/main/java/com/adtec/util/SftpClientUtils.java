package com.adtec.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class SftpClientUtils {

	/**
	 * 初始化日志引擎
	 */


	/** Sftp */
	ChannelSftp sftp = null;
	/** 主机 */
	private String host = "";
	/** 端口 */
	private int port = 0;
	/** 用户名 */
	private String username = "";
	/** 密码 */
	private String password = "";

	public SftpClientUtils() {
		// TODO Auto-generated constructor stub
	}

	public ChannelSftp getSftp() {
		return sftp;
	}

	public void setSftp(ChannelSftp sftp) {
		this.sftp = sftp;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 构造函数
	 * 
	 * @param host
	 *            主机
	 * @param port
	 *            端口
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 * @return
	 * 
	 */
	public  SftpClientUtils(String host, int port, String username, String password) {

		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	/**
	 * 连接sftp服务器
	 * 
	 * @throws Exception
	 */
	public void connect() throws Exception {

		JSch jsch = new JSch();
		Session sshSession = jsch.getSession(this.username, this.host, this.port);
//		System.out.println(this.username+this.host+this.port + this.password);
//		TrcLog.log("sftp.log", "方法：connect==>	username：[%s]",this.username);
//		TrcLog.log("sftp.log", "方法：connect==>	host：[%s]",this.host);
//		TrcLog.log("sftp.log", "方法：connect==>	port：[%s]",this.port);
//		TrcLog.log("sftp.log", "方法：connect==>	password：[%s]",this.password);

		sshSession.setPassword(password);
		Properties sshConfig = new Properties();
		sshConfig.put("StrictHostKeyChecking", "no");
		sshSession.setConfig(sshConfig);
		sshSession.connect(20000);
		//TrcLog.log("sftp.log", " Session connected.");

		//TrcLog.log("sftp.log", " Opening Channel.");
		Channel channel = sshSession.openChannel("sftp");
		channel.connect();
		this.sftp = (ChannelSftp) channel;
		//TrcLog.log("sftp.log", " Connected to " + this.host + ".");
	}

	/**
	 * Disconnect with server
	 * 
	 * @throws Exception
	 */
	public void disconnect() throws Exception {
		if (this.sftp != null) {
			if (this.sftp.isConnected()) {
				this.sftp.getSession().disconnect();
			} else if (this.sftp.isClosed()) {
				System.out.println( " sftp is closed already");
			}
		}
	}

	/**
	 * 上传单个文件
	 * 
	 * @param directory
	 *            上传的目录
	 * @param uploadFile
	 *            要上传的文件
	 * 
	 * @throws Exception
	 */
	public void upload(String directory, String uploadFile) throws Exception {
		this.sftp.cd(directory);
		File file = new File(uploadFile);
		this.sftp.put(new FileInputStream(file), file.getName());
	}

	/**
	 * 上传目录下全部文件
	 * 
	 * @param directory
	 *            上传的目录
	 * 
	 * @throws Exception
	 */
	public void uploadByDirectory(String directory) throws Exception {

		String uploadFile = "";
		List<String> uploadFileList = this.listFiles(directory);
		Iterator<String> it = uploadFileList.iterator();

		while (it.hasNext()) {
			uploadFile = it.next().toString();
			this.upload(directory, uploadFile);
		}
	}

	/**
	 * 下载单个文件
	 * 
	 * @param directory
	 *            下载目录
	 * @param downloadFile
	 *            下载的文件
	 * @param saveDirectory
	 *            存在本地的路径
	 * 
	 * @throws Exception
	 */
	public void download(String directory, String downloadFile, String saveDirectory) throws Exception {
		String saveFile = saveDirectory + File.separator+ downloadFile;
		
		FileOutputStream fos = null;
		try {
			this.sftp.cd(directory);
			File file = new File(saveFile);
			
			FileUtil.mkDir(saveDirectory);
			fos = new FileOutputStream(file);
			this.sftp.get(downloadFile, fos);
			
		} finally {
			if(fos!= null) {
				fos.close();
			}
		}
//		System.out.println("1:"+directory);
//		System.out.println("2:"+downloadFile);
//		System.out.println("3:"+saveDirectory);
	}

	/**
	 * 下载目录下全部文件
	 * 
	 * @param directory
	 *            下载目录
	 * 
	 * @param saveDirectory
	 *            存在本地的路径
	 * 
	 * @throws Exception
	 */
	public void downloadByDirectory(String directory, String saveDirectory) throws Exception {
		String downloadFile = "";
		List<String> downloadFileList = this.listFiles(directory);
		Iterator<String> it = downloadFileList.iterator();

		while (it.hasNext()) {
			downloadFile = it.next().toString();
			if (downloadFile.toString().indexOf(".") < 0) {
				downloadByDirectory(directory + "/" + downloadFile, saveDirectory+ "/" + downloadFile);
//				continue;
			}else {
				this.download(directory, downloadFile, saveDirectory);
			}
		}
	}

	/**
	 * 删除文件
	 * 
	 * @param directory
	 *            要删除文件所在目录
	 * @param deleteFile
	 *            要删除的文件
	 * 
	 * @throws Exception
	 */
	public void delete(String directory, String deleteFile) throws Exception {
		this.sftp.cd(directory);
		this.sftp.rm(deleteFile);
	}

	/**
	 * 列出目录下的文件
	 * 
	 * @param directory
	 *            要列出的目录
	 * 
	 * @return list 文件名列表
	 * 
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public List<String> listFiles(String directory) throws Exception {

		Vector fileList;
		List<String> fileNameList = new ArrayList<String>();

		fileList = this.sftp.ls(directory);
		Iterator it = fileList.iterator();

		while (it.hasNext()) {
			String fileName = ((LsEntry) it.next()).getFilename();
			if (".".equals(fileName) || "..".equals(fileName)) {
				continue;
			}
			fileNameList.add(fileName);

		}

		return fileNameList;
	}

	/**
	 * 更改文件名
	 * 
	 * @param directory
	 *            文件所在目录
	 * @param oldFileNm
	 *            原文件名
	 * @param newFileNm
	 *            新文件名
	 * 
	 * @throws Exception
	 */
	public void rename(String directory, String oldFileNm, String newFileNm) throws Exception {
		this.sftp.cd(directory);
		this.sftp.rename(oldFileNm, newFileNm);
	}

	public void cd(String directory) throws Exception {
		this.sftp.cd(directory);
	}

	public InputStream get(String directory) throws Exception {
		InputStream streatm = this.sftp.get(directory);
		return streatm;
	}
	

	public boolean isExist(String filePath) {
//		System.out.println("f:"+filePath);
       try {
            Vector<?> vector = sftp.ls(filePath);
            if (null == vector)
                return false;
            else
                return true;
        } catch (SftpException e) {
            return false;
        }

	}

	public static void main(String[] args) {  
		System.out.println("begin");
		SftpClientUtils sftp = new SftpClientUtils();
//		sftp.host="160.161.12.107";
//		sftp.port=22;
//		sftp.username="esb";
//		sftp.password="sieabewe29";
		sftp.host="160.161.12.106";
		sftp.port=22;
		sftp.username="esb";
		sftp.password="esb";
		
		
		try {
			sftp.connect();
//			sftp.download("/home/esb/etc/", "Bean.xml", "c:\\test2");
			sftp.downloadByDirectory("/home/esb/versionTest/etc/", "c://test");
//			System.out.println(sftp.isExist("/home/esb/log/json.log1"));
//			sftp.listFiles("/home/esb/log/json.log");
			sftp.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		try {
//			sftp.getSftp().getSession().disconnect();
//		} catch (JSchException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(sftp.getSftp().isConnected());
//		System.out.println(sftp.getSftp().isClosed());
		
		sftp = null;
		System.out.println("finish");
	}

}