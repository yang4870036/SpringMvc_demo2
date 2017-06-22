package com.neuedu.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorld {
@RequestMapping("/helloSpring")
public String helloworld(){
	System.out.println("helloworld");
	return "success";
}
}
