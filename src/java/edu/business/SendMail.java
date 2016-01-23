/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.business;

import java.util.Properties;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
/**
 *
 * @author Elena
 */
public class SendMail {
    public static void send(String combo)
    { 
        
     Properties props = new Properties();
     
     /* Specifies the IP address of your default mail server
     	   for e.g if you are using gmail server as an email sever
           you will pass smtp.gmail.com as value of mail.smtp host. 
           As shown here in the code. 
           Change accordingly, if your email id is not a gmail id
        */
     props.put("mail.smtp.host", "smtp.gmail.com");
     //below mentioned mail.smtp.port is optional
     props.put("mail.smtp.port", "587");		
     props.put("mail.smtp.auth", "true");
     props.put("mail.smtp.starttls.enable", "true");
   

    Session session = Session.getInstance(props,new javax.mail.Authenticator()
    {
  	  protected PasswordAuthentication getPasswordAuthentication() 
  	  {
                   String user = "esresumesite@gmail.com";
                   String pass = "Misxxb31";
  	 	 return new PasswordAuthentication(user,pass);
  	  }
   });
    
   try
   {
 
 	/* Create an instance of MimeMessage, 
 	      it accept MIME types and headers 
 	   */
 
    MimeMessage message = new MimeMessage(session);
       message.setFrom(new InternetAddress("esequestrian2@gmail.com"));
       message.addRecipient(Message.RecipientType.TO,new InternetAddress("esresumesite@gmail.com"));
       message.setSubject("A New Company!");
       message.setText(combo);

       /* Transport class is used to deliver the message to the recipients */
       
       Transport.send(message);
 
 
    }
    catch(Exception e)
    {
    	 e.printStackTrace();
    }
  }  
    
}
