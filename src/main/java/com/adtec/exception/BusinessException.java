package com.adtec.exception;


/**
 * 交易业务错误
 * @author dengp_w
 * @date 2018年3月28日 下午2:07:32
 */
public class BusinessException extends RuntimeException {
	
	private String errorCode;
	private String errorMsg;
	
	public BusinessException(String errorCode, String errorMsg) {
		super("["+errorCode+"]"+"errorMsg");
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public BusinessException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BusinessException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BusinessException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@Override
	public String toString() {
		return "BusinessException [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}
	
}
