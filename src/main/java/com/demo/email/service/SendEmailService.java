package com.demo.email.service;

import com.demo.email.dto.RequestEmailDto;
import com.demo.email.dto.ResponseEmailDto;

//import com.pfp.firstproject.dto.email.RequestEmailDto;
//import com.pfp.firstproject.dto.email.ResponseEmailDto;

public interface SendEmailService  {

	ResponseEmailDto sendMail (RequestEmailDto requestEmailDto) ;
}
