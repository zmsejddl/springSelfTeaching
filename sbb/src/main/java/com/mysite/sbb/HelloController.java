package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	//컨트롤러 만들기
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello Spring Boot Board";
	}
	//엔티티 -> 리포지토리 -> 컨트롤러 -> 서비스

}
