package com.adtec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adtec.entity.DTO.JsonResult;
import com.adtec.exception.BusinessException;

@ControllerAdvice
public class BaseController{

	@ExceptionHandler(BusinessException.class)
	@ResponseBody
    public JsonResult handleBusinessException(BusinessException e) {
        e.printStackTrace();
        return new JsonResult(e.getErrorCode(), e.getErrorMsg(), null);
    }
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public JsonResult handleException(Exception e) {
		e.printStackTrace();
		return new JsonResult("9999", "系统异常："+e.getMessage(), null);
	}


}
