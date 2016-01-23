<%-- 
    Document   : thanks
    Created on : Jan 22, 2016, 3:33:04 PM
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
        <h4>Thank you for your interest, <span>${fullName}</span>. I will be in touch
        with you shortly.</h4>
    </body>
</html>
