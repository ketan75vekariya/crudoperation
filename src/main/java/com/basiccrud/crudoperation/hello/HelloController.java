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
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String helloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<!DOCTYPE html>");
		sb.append("<html lang=\"en\">");
		sb.append("<head>");
		sb.append("<meta charset=\"UTF-8\">");
		sb.append("<title>My First Webpage</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Hello World! from html</h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

}
