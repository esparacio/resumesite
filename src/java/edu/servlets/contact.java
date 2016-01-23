/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.servlets;

import edu.business.SendMail;
import edu.business.User;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Elena
 */
public class contact extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/thanks.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/thanks.jsp";    
        } 
        
        else if (action.equals("add")) {
          
            try{
                String fullName = request.getParameter("fullName");
                String emailAddress = request.getParameter("emailAddress");
                String companyName = request.getParameter("companyName");
                String mail = request.getParameter("message");
                Date today = Calendar.getInstance().getTime();
                String date = new SimpleDateFormat("MM-dd-yyyy").format(today);
                
                User user = new User(fullName, emailAddress, companyName, date);

                String combo = fullName +" " + emailAddress + "" + companyName 
                        + "" + date + " " +mail;
                
                SendMail.send(combo);
                System.out.println("Mail send successfully");
                
                String message = "";
                url = "/thanks.jsp";
              
                request.setAttribute("user", user);
                request.setAttribute("message", message);
      
      request.setAttribute("fullName", fullName);
      request.setAttribute("emailAddress", emailAddress);
      request.setAttribute("companyName", companyName);
      request.setAttribute("date", date);
      
      HttpSession session = request.getSession();
      session.setAttribute("fullName", fullName);
      session.setAttribute("emailAddress", emailAddress);
      session.setAttribute("companyName", companyName);
      session.setAttribute("date",date);

            }
            catch(NumberFormatException nfe){
                String message = "Please fill out all three text boxes.";
                url = "/index.jsp";
            request.setAttribute("message", message);
            } 
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
}