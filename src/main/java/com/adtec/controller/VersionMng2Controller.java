package com.adtec.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tools.ant.types.FileList.FileName;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.adtec.VersionMng.VersionMng2;
import com.adtec.entity.DTO.JsonResult;
import com.adtec.exception.BusinessException;

@Controller
public class VersionMng2Controller extends BaseController{

	@RequestMapping("/index")
	public String toIndex() {
		return "index";
	}
	@RequestMapping("/versionMng_create")
	public String toCreateVersion2() {
		return "versionMng_create.html";
	}
	@RequestMapping("/versionMng_conf")
	public String toConf() {
		return "versionMng_create.html";
	}
	
	@RequestMapping("/createVersion.do")
	@ResponseBody
	public JsonResult createVersion(String versionListPath, String toEnvironment, String fromEnvironment,
			String serverType, String resultType) {
		
		return JsonResult.ok(VersionMng2.createNewVersion(versionListPath, toEnvironment, fromEnvironment, serverType, resultType));
	}
	
	//接收上传文件
	@RequestMapping(value="/uploadFile.do", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult uploadFile(@RequestParam("uploadFileName") MultipartFile file,
                                           HttpServletRequest request) {
//        String contentType = file.getContentType();
        Map<String,String> map=new HashMap<>();
        String fileName = file.getOriginalFilename();
        String filePath=VersionMng2.createVersionPath+File.separator + "versionList" + File.separator;
        String now = null;
        try {
        	String fmt = "yyyyMMdd_HHmmss_SSS";
    		Date date = new Date();
    		SimpleDateFormat simpledateformat = new SimpleDateFormat(fmt);
    		now = simpledateformat.format(date);
    		
            uploadFile(file.getBytes(), filePath, now);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        if(file==null){
            map.put("error","false");
        }

        map.put("success","true");
        return JsonResult.ok(filePath+File.separator+now);
    }

	@RequestMapping(value="/downFile.do", method = RequestMethod.GET)
	public String downloadFile(HttpServletRequest request, HttpServletResponse response , String filePathName) {
	        if (filePathName != null) {
	            File file = new File(filePathName);
	            if (file.exists()) {
	                response.setContentType("application/force-download");// 设置强制下载不打开
	                response.addHeader("Content-Disposition", "attachment;fileName=" + file.getName());// 设置文件名
	                byte[] buffer = new byte[1024];
	                FileInputStream fis = null;
	                BufferedInputStream bis = null;
	                try {
	                    fis = new FileInputStream(file);
	                    bis = new BufferedInputStream(fis);
	                    OutputStream os = response.getOutputStream();
	                    int i = bis.read(buffer);
	                    while (i != -1) {
	                        os.write(buffer, 0, i);
	                        i = bis.read(buffer);
	                    }
	                } catch (Exception e) {
	                    e.printStackTrace();
	                } finally {
	                    if (bis != null) {
	                        try {
	                            bis.close();
	                        } catch (IOException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                    if (fis != null) {
	                        try {
	                            fis.close();
	                        } catch (IOException e) {
	                            e.printStackTrace();
	                        }
	                    }
	                }
	            }
	        }
//	        return JsonResult.ok();
	        return null;
	}




    
    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+File.separator+fileName);
        out.write(file);
        out.flush();
        out.close();
    }



}
