package com.ghan.dubbo.impl;

import com.ghan.dubbo.facade.ApiServiceFacade;
import com.ghan.dubbo.facade.domain.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * 实现类
 *
 * @author ghan
 */
@Slf4j
@Service
@DubboService(version = "1.0.0", timeout = 6000)
public class ApiServiceFacadeImpl implements ApiServiceFacade {

	@Override
	public BaseResponse<Object> queryDataList() {
		return BaseResponse.success();
	}

}
