package com.cdac.springboothelloapp.cntr;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value = "/hello")
	public String sayHello(@RequestParam String userName) {
		return "hello "+userName;
	}
	

}
