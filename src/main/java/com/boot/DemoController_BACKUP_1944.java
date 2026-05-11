package com.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//@ResponseBody
public class DemoController {
	@ResponseBody
	@RequestMapping("/")
	public String name() {
		log.info("Boot Gradle!");
		
		return "gradle";
	}
	
	@RequestMapping("/hello.do")
	public String hello(Model model) {
<<<<<<< HEAD
		log.info("hello! 111 222 333 2");
=======
		log.info("hello! 111 222 333 1");
>>>>>>> 4ecd28b9a601e0e46e3b6bc0ee7ec55c970fd3b4
		
		model.addAttribute("message","hello.jsp 입니다!");
		
		return "hello";
	}
}
