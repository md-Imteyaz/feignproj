package com.Feign.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class FeingnController {

	@GetMapping("/name")
	public String getName() {
		return "play java";
	}

	@GetMapping("/address")
	public String getAddress() {
		return "India";
	}

	@GetMapping("/status")
	public String getStatus() {
		return "Active";
	}

}
