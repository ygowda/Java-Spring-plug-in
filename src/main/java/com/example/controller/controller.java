package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo")
public class controller {

	@RequestMapping(method= RequestMethod.GET)
	public String index(){
		return "demo/index";
	}
}
