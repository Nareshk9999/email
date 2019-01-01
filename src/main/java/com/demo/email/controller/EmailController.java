package com.demo.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.email.dto.RequestEmailDto;
import com.demo.email.dto.ResponseEmailDto;
import com.demo.email.service.SendEmailService;

//import com.pfp.firstproject.dto.email.RequestEmailDto;
//import com.pfp.firstproject.dto.email.ResponseEmailDto;
//import com.pfp.firstproject.service.email.SendEmailService;

@RestController
public class EmailController {

	@Autowired
	SendEmailService sendEmailService;
	
	@RequestMapping (value="/sendEmail",method= RequestMethod.POST)
	@ResponseBody
	
	public ResponseEmailDto sendMail (@RequestBody RequestEmailDto requestEmailDto)
	{
		System.out.println("email recieved in controller ");
		
		ResponseEmailDto responseEmailDto = sendEmailService.sendMail(requestEmailDto);
		
		
		return responseEmailDto;
	}
	
	
	
}
