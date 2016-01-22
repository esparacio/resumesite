<%-- 
    Document   : contact
    Created on : Jan 20, 2016, 2:52:58 PM
    Author     : Elena
--%>

<!DOCTYPE html>
<html>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:import url="/includes/header.html"/>
    <body>
        <a href="index.html"><img class="logo" src="images/logospace.png" alt="logo"></a>
        <h2>Contact Me</h2>
        <div id ="horizontal">
                <ul id="navbar">
                    <li><a href="edu.jsp">EDUCATION</a></li>
                    <li><a href="csskills.jsp">COMPUTER SKILLS</a></li>
                    <li><a href="exp.jsp">EXPERIENCES</a></li>
                    <li><a href="port.jsp">PORTFOLIO</a></li>
                    <li><a href="pdfs/resume.pdf">RESUME</a></li>
                    <li><a href="contact.jsp">CONTACT ME</a></li>
                    
            </ul>
        </div>
        <section class="for">
            <h3>3095 Arborwoods Drive&#44; Alpharetta&#44; GA 30022 &#126; 
            Phone&#58; 908&#45;256&#45;6414 &#126; E&#45;mail&#58; esparacio&#64;elon.edu </h3>
            <h3> </h3>
            <form action="contact" method="post">
        <input type="hidden" name="action" value="add"> 
        <p><i>${message}</i></p>
        <p>If you want to contact me via the website, please fill out the form.</p>
        <p><label>Name: </label><input name="firstName" type="text" 
        value="${fullName}" required /></p>
        <p><label>Email Address: </label><input name="emailAddress" 
        type="email" value="${emailAddress}" required /></p>
        <p><label>Company: </label><input name="companyName" 
        type="text" value="${companyName}" required/> </p>
        <label>         </label><input class= "butt" type="submit" 
        value="SUBMIT">
        </section>
       
    </body>
</html>
