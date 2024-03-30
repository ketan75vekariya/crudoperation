package com.basiccrud.crudoperation.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	@RequestMapping("say-hello")
	@ResponseBody
	public String hello() {
		return "Hello this is from helloController";
	}

}