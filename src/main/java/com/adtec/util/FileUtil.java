package com.adtec.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {

	public static void main(String[] args) {
		String regex = ".*\\..*";
		String s = "ataElement.xml";
		System.out.println(s.matches(regex));
	}

	/**
	 * 复制文件
	 * @time 2018年9月28日 上午9:07:05
	 * @author dengp_w
	 * @param source
	 * @param dest
	 * @return
	 * @throws IOException
	 */
	public static boolean copyFile(File source , File dest) throws IOException {
		InputStream input = null;
		OutputStream output = null;
		if(!source.exists()) {
			return false;
		}
		try {
			input = new FileInputStream(source);
			output = new FileOutputStream(dest);
			byte[] buf = new byte[1024]; 
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
		} finally {
			input.close();
			output.close();
		}
		return true;
	}
	/**
	 * 复制文件
	 * @time 2018年9月28日 上午9:07:05
	 * @author dengp_w
	 * @param source
	 * @param dest
	 * @return
	 * @throws IOException
	 */
	public static boolean copyFile(String source , String dest) throws IOException {
		File sourceFile = new File(source);
		File destFile = new File(dest);
		InputStream input = null;
		OutputStream output = null;
		if(!sourceFile.exists()) {
			return false;
		}
		File parentFile = destFile.getParentFile();
		if(!parentFile.exists()) {
			parentFile.mkdirs();
		}
		try {
			input = new FileInputStream(sourceFile);
			output = new FileOutputStream(destFile);
			byte[] buf = new byte[1024]; 
			int bytesRead;
			while ((bytesRead = input.read(buf)) > 0) {
				output.write(buf, 0, bytesRead);
			}
		} finally {
			if(input != null) {
				input.close();
			}
			if(output != null) {
				output.close();
			}
		}
		return true;
	}

	
	
	/**
	 * 通过绝对路径获取文件路径，文件名
	 * @param fileNamePath
	 * @return
	 * 		fileAtt[0]:文件路径
	 * 		fileAtt[0]:文件名
	 */
	public static String[] getFileNameAndPath(String filePathName) {
		String[] fileAtt = new String[2] ;
		fileAtt[0] = filePathName.substring(0,filePathName.lastIndexOf("/"));
		fileAtt[1] = filePathName.substring(filePathName.lastIndexOf("/")+1);
		return fileAtt ;
	}
	
	/**
	 * 递归生成文件夹
	 * @time 2018年9月21日 上午10:34:24
	 * @author dengp_w
	 * @param file
	 */
	public static void mkDir(File file) {  
        if (file.getParentFile().exists()) {  
            file.mkdir();  
        } else {  
            mkDir(file.getParentFile());  
            file.mkdir();    
        }  
    }  
	/**
	 * 递归生成文件夹
	 * @time 2018年9月21日 上午10:34:24
	 * @author dengp_w
	 * @param file
	 */
	public static void mkDir(String filePath) {  
		File file = new File(filePath);
		if(file.exists()) {
			return ;
		}
		if (file.getParentFile().exists()) {  
			file.mkdir();  
		} else {  
			mkDir(file.getParentFile());  
			file.mkdir();    
		}  
	}  
	
	  /**
		 * 删除文件夹下所用文件
		 * @time 2018年9月21日 上午10:27:08
		 * @author dengp_w
		 * @param path
		 * @return
		 */
		public static boolean deleteDir(String path)
		  {
		    String[] arrayOfString1;
		    File file = new File(path);
		    if (!(file.exists())) {
		      System.err.println("The dir are not exists!");
		      return false;
		    }

		    String[] content = file.list();
		    int j = (arrayOfString1 = content).length; for (int i = 0; i < j; ++i) { String name = arrayOfString1[i];
		      File temp = new File(path, name);
		      if (temp.isDirectory()) {
		        deleteDir(temp.getAbsolutePath());
		        temp.delete();
		      }
		      else if (!(temp.delete())) {
		        System.err.println("Failed to delete " + name);
		      }
		    }

		    file.delete();
//		    System.out.println("删除 文件夹："+ path + "完成");
		    return true;
		  }
  
}
