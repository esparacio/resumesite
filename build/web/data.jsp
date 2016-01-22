<%-- 
    Document   : data
    Created on : Jan 21, 2016, 5:56:43 PM
    Author     : Elena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <script type="text/javascript" src="js/jquery-1.12.0.js"></script>
         <script type="text/javascript" src="js/unslider-master/src/js/unslider.js"></script>
         <link rel="stylesheet" href="js/unslider-master/dist/css/unslider.css">
         <link rel="stylesheet" href="js/unslider-master/dist/css/unslider-dots.css">
    
    </head>
    
    <script>
		jQuery(document).ready(function($) {
			$('.slider1').unslider();
		});
	</script>
    
    <body>
      <h3>Mobile: Around Campus App</h3>
            <div class="slider1">
                <ul>
                    <li><img class="mobile" src="images/mobile/homepageicons.png" alt="mobile"></li>
                    <li><img class="mobile" src="images/mobile/achome.png" alt="home"></li>
                    <li><img class="mobile" src="images/mobile/ac1.png" alt="work"></li>
                    <li><img class="mobile" src="images/mobile/ac2hours.png" alt="hours"></li>
                    <li><img class="mobile" src="images/mobile/ac3map.png" alt="map"></li>
                </ul>
            </div>
    </body>
</html>
