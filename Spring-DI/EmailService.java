package com.services;

public class EmailService implements MessageService {
public boolean sendMessage(String msg,String rec) {
	System.out.println("Email sent to " +rec+ " with Message = " +msg);
	return true;
}
}
