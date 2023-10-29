package com.ghan.dubbo.client.controller;

import com.ghan.dubbo.facade.ApiServiceFacade;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试-API
 *
 * @author ghan
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

	@DubboReference(version = "1.0.0")
	private ApiServiceFacade apiServiceFacade;

	/**
	 * http://127.0.0.1:9091/test/list
	 */
	@GetMapping("list")
	public Object list() {
		return apiServiceFacade.queryDataList();
	}

}
