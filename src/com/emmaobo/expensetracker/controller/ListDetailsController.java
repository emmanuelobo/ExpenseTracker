package com.emmaobo.expensetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListDetailsController {
	
	@RequestMapping("/list-details")
	public String gotoListDetailsView()
	{
		return "list-details";
	}

}