package com.FeignC.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feign", url = "http://localhost:8383/user")
public interface FeignServiceUtil {

	@GetMapping("/name")
	public String getName();

	@GetMapping("/address")
	public String getAddress();

	@GetMapping("/status")
	public String getStatus();

}