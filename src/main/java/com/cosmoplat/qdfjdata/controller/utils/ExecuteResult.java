package com.cosmoplat.qdfjdata.controller.utils;

import java.io.Serializable;

/**
 * * @ClassName: ExecuteResult
* @author siufung.chen
* @date 2017年9月20日 下午1:13:24
*
* @param <T>
 */
public class ExecuteResult<T> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * success 
	 */
	private boolean success;
	
	/**
	 * T <>
	 */
	private T data;
	
	/**
	 * message 返回信息
	 */
	private String message;
	
	/**
	 * code 错误码
	 */
	private String code;
	
	/**
	 * url 请求路径
	 */
	private String url;
	
	/**
	 * errorStackTrack 返回错误信息堆栈
	 */
	private String errorStackTrack;

	private String status;

	private String flag;

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getErrorStackTrack() {
		return errorStackTrack;
	}
	public void setErrorStackTrack(String errorStackTrack) {
		this.errorStackTrack = errorStackTrack;
	}
	/**
	 * 
	* @Title: ok
	* @param @param data
	* @param @return   
	* @return ExecuteResult<T>   
	* @throws
	 */
	public static <T> ExecuteResult<T> ok(T data) {
		ExecuteResult<T> result = new ExecuteResult<T>();
		result.setData(data);
		result.setSuccess(true);
	    return result;
	}
	/**
	 * 添加返回信息
	 * @param message
	 * @return
	 */
	public static <T> ExecuteResult<T> okm(String message) {
		ExecuteResult<T> result = new ExecuteResult<T>();

	    return result;
	}
	
	/**
	 * 
	* @Title: ok
	* @param @param data
	* @param @param message
	* @param @return   
	* @return ExecuteResult<T>   
	* @throws
	 */
	public static <T> ExecuteResult<T> ok(T data,String message) {
		ExecuteResult<T> result = new ExecuteResult<T>();
		result.setData(data);
		result.setSuccess(true);
		result.setMessage(message);
	    return result;
	}
	/**
	 * 
	* @Title: ok
	* @param @return   
	* @return ExecuteResult<T>   
	* @throws
	 */
	public static <T> ExecuteResult<T> ok() {
	    return ok(null);
	}
	
	/**
	 * 
	* @Title: failure
	* @param @param data
	* @param @return   
	* @return ExecuteResult<T>   
	* @throws
	 */
	public static <T> ExecuteResult<T> fail(T data) {
		ExecuteResult<T> result = new ExecuteResult<T>();
        result.setData(data);
        result.setSuccess(false);
        return result;
    }
	
	/**
	 * @Title: failure
	 * @param @return  
	 * @param message
	 * @return
	 */
	public static <T> ExecuteResult<T> fail(String message) {
		ExecuteResult<T> result = new ExecuteResult<T>();
        result.setMessage(message);
        result.setCode(null);
        result.setSuccess(false);
        return result;
    }
	
	/**
	 * 
	* @Title: failure
	* @param @return   
	* @return ExecuteResult<T>   
	* @throws
	 */
	public static <T> ExecuteResult<T> fail() {
		return fail(null);
	}
	
	/**
	 * 
	* @Title: failure
	* @param @param message
	* @param @param data
	* @param @return   
	* @return ExecuteResult<T>   
	* @throws
	 */
	public static <T> ExecuteResult<T> fail(String message, String errorcode) {
		ExecuteResult<T> result = new ExecuteResult<T>();
        result.setMessage(message);
        result.setCode(errorcode);
        result.setSuccess(false);
        return result;
    }
	
	/**
	 * 
	* @Title: failure
	* @param @param errorCode
	* @param @param message
	* @param @param data
	* @param @return   
	* @return ExecuteResult<T>   
	* @throws
	 */
	public static <T> ExecuteResult<T> fail(String errorCode, String message, T data) {
		ExecuteResult<T> result = new ExecuteResult<T>();
        result.setCode(errorCode);
        result.setMessage(message);
        result.setData(data);
        result.setSuccess(false);
        return result;
    }
	
	public static <T> ExecuteResult<T> fail(String errorcode, String message,Exception e) {
		ExecuteResult<T> result = new ExecuteResult<T>();
        result.setMessage(message);
		result.setSuccess(false);
		result.setCode(errorcode);
		result.setData(null);
		result.setErrorStackTrack(Exceptions.getStackTraceAsString(e));
        return result;
    }
	
	  
	
	
}

