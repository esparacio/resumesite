<%-- 
    Document   : edu
    Created on : Jan 20, 2016, 2:50:14 PM
    Author     : Elena
--%>

<!DOCTYPE html>
<html>
 <%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:import url="/includes/header.html"/>
   
    <body>
        <a href="index.html"><img class="logo" src="images/logospace.png" alt="logo"></a>
        <h2>Education</h2>
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
        <section class = "edu">
            <p><b>Elon University</b>, Elon, NC</p>
            <p><i>Elon College Fellow and Presidential Scholar</i></p>
            <p><b>Major:</b> Computer Science</p>
            <p><b>Minor:</b> English - Creative Writing </p>
            <p><b>GPA:</b> 3.5</p>
            <p><b>Relevant Coursework:</b> Computer Science I, II, III; Mobile Computing, Discrete Structures. 
            Programming Languages, Algorithm Analysis, and Computer Systems to be completed after Spring
            2016.</p>
        </section>
        <section class="full">
            <h3>About</h3>
                <p>I am a junior at Elon University, a private liberal arts college in 
                Elon, North Carolina. I am looking for a technological internship in 
                the Alpharetta/Atlanta area for the summer of 2016. I am a Computer Science major 
                with a minor in English - Creative Writing, and an Elon College Fellow. 
                As of this year, I am performing mentored research focusing on mobile applications 
                and the use of a volumetric device as a tangible display. 
                In the Spring, I will be taking Programming Languages and Algorithm Analysis,
                which will broaden my base of knowledge in languages and give me the ability to
                create the cleanest and most efficient code possible. I hope to use these skills
                this summer at a company near my hometown. </p>
            <h3>Honors and Awards</h3>
            <table>
                <col style="width:15%;">
                <col style="width:75%;">
                <tr>
                    <td><img class="award" src="images/wreath.png" alt="award"></td>
                    <td>Receipient of Presidential Scholarship</td>
                </tr>
                <tr>
                    <td><img class="award" src="images/wreath.png" alt="award"></td>
                    <td>1 of 2 Computer Science Fellows in the Elon College Fellows Program</td>
                </tr>
                <tr>
                    <td><img class="award" src="images/wreath.png" alt="award"></td>
                    <td>President's List: 4 semesters (3.7 or above)</td>
                </tr>
                <tr>
                    <td><img class="award" src="images/wreath.png" alt="award"></td>
                    <td>Dean's List: 1 semester (3.5-3.7)</td>
                </tr>
                 <tr>
                    <td><img class="award" src="images/wreath.png" alt="award"></td>
                    <td>Member of the English Honor Society: Sigma Tau Delta, Xi Omicron Chapter</td>
                </tr>
            </table>
            <h3>Coursework</h3>
                <p>Throughout the course of college I have developed several mobile applications,
                websites, and programs. Click <a class="linky" href="port.jsp"> HERE</a> to look at my full portfolio, or
                follow <a class="linky" href="pdfs/research.pdf">THIS</a> link to see my undergraduate research.</p>
        </section>
    </body>
</html>
