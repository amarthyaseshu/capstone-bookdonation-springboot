package com.prograd.service;

import org.springframework.stereotype.Service;

@Service
public interface MailService {
	
	public void send(String fromAddress, String toAddress, String subject, String content) throws Exception;

}
