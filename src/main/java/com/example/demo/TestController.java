package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {
	
	@GetMapping("/test")
	public String testApi() {
		return "success";
	}
	
	@GetMapping(value="/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloGFG()
    {
        return "Hello";
    }
	
	
}
