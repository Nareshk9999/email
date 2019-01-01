package com.demo.email.serviceimpl;

import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.demo.email.dto.RequestEmailDto;
import com.demo.email.dto.ResponseEmailDto;
import com.demo.email.service.SendEmailService;

//import com.pfp.firstproject.dto.email.RequestEmailDto;
//import com.pfp.firstproject.dto.email.ResponseEmailDto;
//import com.pfp.firstproject.service.email.SendEmailService;
//import com.pfp.firstproject.serviceimpl.Scheduled;

@Service
public class SendEmailServiceimpl implements SendEmailService{

	@Autowired
	JavaMailSender sender;

	public	ResponseEmailDto sendMail (RequestEmailDto requestEmailDto) {
		 MimeMessage message = sender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message);
	    
		try {
        	helper.setTo(requestEmailDto.getTo());
        	helper.setFrom(requestEmailDto.getFrom());
        	helper.setSubject(requestEmailDto.getSub());
        	helper.setText(requestEmailDto.getBody());
        }catch (MessagingException e) {
            e.printStackTrace();
            }
        sender.send(message);
        System.out.println("mail sent");
        return null;
	}
	
	/*@Scheduled(cron= "${cron.task.job}")
	public void schedulerCheck() {
		System.out.println("shedular run");
	}*/

}
