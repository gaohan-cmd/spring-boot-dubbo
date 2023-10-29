package com.ghan.dubbo.facade;

import com.ghan.dubbo.facade.domain.BaseResponse;

/**
 * 提供查询 Api
 *
 * @author ghan
 */
public interface ApiServiceFacade {

	/**
	 * 查询
	 */
	BaseResponse<Object> queryDataList();

}
