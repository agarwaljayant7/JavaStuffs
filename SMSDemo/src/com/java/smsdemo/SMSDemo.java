package com.java.smsdemo;
import com.teknikindustries.bulksms.SMS;
public class SMSDemo {

	public static void main(String[] args) {
	SMS s =new SMS();
	s.SendSMS("jayantagarwal777", "jk*1990#", "Hello! from KBC", "919632151507", "https://www1.bulksms.com/home/profile?post_auth_url=/home/profile");
	}

}

