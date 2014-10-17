package com.testSpring.test.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testSpring.test.dto.TestDto;
import com.testSpring.test.service.TestService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		List<TestDto> list = testService.selectTestAll();
		
		model.addAttribute("test1", (list.get(0)).getTEST1());
		
		return "test";
	}
	
	
}
