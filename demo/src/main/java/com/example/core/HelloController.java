package com.example.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

	@RequestMapping("/helllo")
	public String helllo()
	{
		return "/resources/templates/views/helllo.html";
	}
}
