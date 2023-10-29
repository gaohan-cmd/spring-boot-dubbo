package com.ghan.dubbo.facade.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 通用返回对象
 * Created by ghan on 2023/10/29.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse<T> implements Serializable {

	private static final long serialVersionUID = 3259456853523192205L;

	/**
	 * 状态码
	 */
	private Integer code = RestfulCode.SUCCESS.getCode();

	/**
	 * 描述信息
	 */
	private String msg = RestfulCode.SUCCESS.getMsg();

	/**
	 * 返回数据
	 */
	private T data;

	/**
	 * 响应成功/失败
	 *
	 * @param code
	 * @param msg
	 * @return
	 */
	private static <T> BaseResponse<T> base(Integer code, String msg, T data) {
		return BaseResponse.<T>builder()
				.code(code)
				.msg(msg)
				.data(data)
				.build();
	}

	/**
	 * 响应成功
	 *
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> success() {
		return base(RestfulCode.SUCCESS.getCode(), RestfulCode.SUCCESS.getMsg(), null);
	}

	/**
	 * 响应成功-带data
	 *
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> success(T data) {
		return base(RestfulCode.SUCCESS.getCode(), RestfulCode.SUCCESS.getMsg(), data);
	}

	/**
	 * 响应失败
	 *
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> fail() {
		return fail(RestfulCode.FAILED, null);
	}

	/**
	 * 响应失败-带data
	 *
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> fail(T data) {
		return fail(RestfulCode.FAILED, data);
	}

	/**
	 * 响应失败-带code
	 *
	 * @param restfulCode
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> fail(RestfulCode restfulCode) {
		return fail(restfulCode, null);
	}

	/**
	 * 响应失败-带data
	 *
	 * @param restfulCode
	 * @param data
	 * @param <T>
	 * @return
	 */
	public static <T> BaseResponse<T> fail(RestfulCode restfulCode, T data) {
		return base(restfulCode.getCode(), restfulCode.getMsg(), data);
	}

	/**
	 * 响应失败
	 *
	 * @param code
	 * @param msg
	 * @return
	 */
	public static <T> BaseResponse<T> fail(Integer code, String msg) {
		return base(code, msg, null);
	}

	/**
	 * 更新/删除等有返回值的操作-响应
	 *
	 * @param result
	 * @return
	 */
	public static <T> BaseResponse<T> result(int result) {
		if (result > 0) {
			return success();
		} else {
			return fail();
		}
	}

}
