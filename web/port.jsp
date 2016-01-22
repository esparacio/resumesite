<%-- 
    Document   : port
    Created on : Jan 20, 2016, 4:12:58 PM
    Author     : Elena
--%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles/links.css" type="text/css"/>
        <link rel="stylesheet" href="styles/unslider.css" type="text/css"/>
        <link rel="stylesheet" href="styles/unslider-dots.css" type="text/css"/>
        
        <link href='https://fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,700' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Raleway' rel='stylesheet' type='text/css'>
         
         <script type="text/javascript" src="js/jquery-1.12.0.js"></script>
         <script type="text/javascript" src="js/unslider.js"></script>
        <title>Elena Sparacio Interactive Resume</title>
    </head>
 
 <script>
	jQuery(document).ready(function($) {
			$('.slider1').unslider({
            autoplay:true,
            arrows: {
	
	prev: '<a class="unslider-arrow prev"><</a>',
	next: '<a class="unslider-arrow next">></a>'}
});

$('.slider2').unslider({
            autoplay:true,
            arrows: {
	
	prev: '<a class="unslider-arrow prev"><</a>',
	next: '<a class="unslider-arrow next">></a>'}
});

$('.slider3').unslider({
            autoplay:true,
            arrows: {
	
	prev: '<a class="unslider-arrow prev"><</a>',
	next: '<a class="unslider-arrow next">></a>'}
});
		});	
	</script>
 
    <body>
        <a href="index.html"><img class="logo" src="images/logospace.png" alt="logo"></a>
        <h2>Portfolio</h2>
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
        <section class="web">
            <h3>Personal Website</h3>
            <p class="para">I challenged myself to build this website within a week, and it took
                me 72 hours to beat the challenge. <b>This website is built from scratch.</b> You
                can see what it started like <a class="button" href='before.html'><b>HERE.</b></a> The website uses my skills 
            in Web Development, jQuery, Responsive Web Design,
            object-oriented programming, user interfaces, web architecture concepts,
            MCV design patterns, debugging, etc. It utilizes the languages Java, HTML, CSS, and JavaScript.</p>
             
            <p class="para">I uploaded my code for the website onto my GitHub account, so feel free to take a look at the 
              code. </p>
        </section>
        
            <section class="mob">
            <h3>Mobile: Around Campus App</h3>
            <p class="para"><i>Around Campus</i> is an application that allows
            the user to see the buildings that are open (intuitive UI: green for open, red for close) on campus along with their respective
            hours. Once a user selects a building, the application then routes the user to 
            their destination with the integrated Google Maps feature.</p>
            <div class="slider1">
                <ul>
                    <li class="slid"><img class="mobile" src="images/mobile/homepageicons.png" alt="mobile"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/achome.png" alt="home"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/ac1.png" alt="work"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/ac2hours.png" alt="hours"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/ac3map.png" alt="map"></li>
                </ul>
            </div>
            </section>
       
        <section class="re">
            <h3>Research</h3>
            <p class="para">My undergraduate research focuses on innovative mobile application development through
                the use of volumetric/tangible displays. To learn more, follow <a class="linky" href="pdfs/research.pdf">THIS</a> link.</p>
            <div class="slider2">
                <ul>
                    <li class="slid"><img class="research" src="images/research/presentation.jpg" alt="present"></li>
                    <li class="slid"><img class='research' src="images/research/cubielights.jpg" alt="cube"></li>
                    <li class="slid"><img class="research" src="images/research/cubecode.png" alt="code"></li>
                    <li class="slid"><img class="research" src="images/research/cube1.jpg" alt="cube1"></li>
                    <li class="slid"><img class="research" src="images/research/cube2.jpg" alt="cube2"></li>
                    <li class="slid"><img class="research" src="images/research/cube3.jpg" alt="cube3"></li>
                    <li class="slid"><img class="research" src="images/research/cube4.jpg" alt="cube4"></li>
                    <li class="slid"><img class="research" src="images/research/cube5.jpg" alt="cube5"></li>
                </ul>
            </div>
        </section>
         <section class="mob2">
            <h3>Mobile: Secret Santa App</h3>
            <p class="para"><i>SecretSanta</i> is an minimalist, cloud-based application 
                in which groups of users can utilize a randomized matching system to give them
                a Secret Santa. This application was an experiment with cloud-computing,
                databases, Photoshop, and Android Studio. </p>
            <div class="slider3">
                <ul>
                    <li class="slid"><img class="mobile" src="images/mobile/sshome.png" alt="sshome"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/ss1.png" alt="ss1"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/ss2.png" alt="ss2"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/ss3.png" alt="ss3"></li>
                    <li class="slid"><img class="mobile" src="images/mobile/ss4.png" alt="ss4"></li>
                </ul>
            </div>
        </section>
            
       
    </body>
</html>
