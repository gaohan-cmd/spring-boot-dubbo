package com.ghan.dubbo.facade.domain;

/**
 * 响应CODE码
 *
 * @author ghan
 */
public enum RestfulCode {

	SUCCESS(0, "成功"),
	FAILED(1, "失败"),
	VALIDATE_FAILED(2, "参数检验失败"),
	UNAUTHORIZED(3, "暂未登录或token已经过期"),
	FORBIDDEN(4, "没有相关权限"),
	SERVER_ERROR(5, "处理失败，请稍候重试"),
	ADMIN_ERROR(6, "系统异常，请联系统管理员"),
	ENCRYPT_ERROR(7, "加密异常"),
	DECRYPT_FAILED(7, "解密异常"),
	;

	private Integer code;
	private String msg;

	RestfulCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
