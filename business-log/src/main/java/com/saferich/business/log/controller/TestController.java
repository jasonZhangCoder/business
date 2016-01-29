package com.saferich.business.log.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
    public String account(HttpServletRequest request, HttpServletResponse response, Model model) {
        System.out.println("aaaa");
        return "true";
    }
}
