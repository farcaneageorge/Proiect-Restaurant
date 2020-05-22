<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
 
        .head1 { 
text-align:center;
            font-size:35px; 
            color:#ffcc00; 
            font-weight:bold; 
        } 
        .head2 { 
text-align:left;
			color:#33ccff;
			font-style:italic;
            font-size:25px; 
            margin-left:10px; 
            margin-bottom:15px; 
        } 


        body 
{ 
background-image:url("${pageContext.request.contextPath}/resources/mexican.jpg");
background-repeat:no-repeat;
background-size: 100%;
text-align:left;
color:white;
font-size:17px;
        } 

      
        .menu {  
         border: 2px solid black;
 			 position: sticky; 
            top: 0; 
            background-color: #E08119; 
            padding:10px 0px 10px 0px; 
            color:white; 
            margin: 0 auto; 
            overflow: hidden;
            
            

            
            
        } 
        .menu a { 
           
            float: left; 
            color: black; 
            text-align: center; 
            padding: 14px 16px; 
            text-decoration: none; 
            font-size: 20px; 
            
        } 
        
        .menu-search { 
  
            right: auto; 
            float: right; 
        } 
        

        footer { 
            width: 100%; 
            bottom: 0px; 
            color: #fff; 
            position: absolute; 
            padding-top:20px; 
            padding-bottom:50px; 
            text-align:left; 
            font-size:30px; 
          
        } 
        .body_sec { 

            margin-left:20px; 
            }
            table {
  width:28%;
}
table, th, td {
  border: 2px solid black;
  border-collapse: collapse;
}
th  {
  padding: 13px;
  text-align: left;
  color:black;
  
  td{
  padding: 12px;
  text-align: left;
  }
       
    </style> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <!-- Header Section -->
    <header> 
        <div class="head1"><i>George's , un restaurant de vis</i></div> 
        <div class="head2"></div> 
    </header> 
      
    <!-- Menu Navigation Bar -->
    <div class="menu"> 
        <a href="home.htm">Acasa</a>    
        <a href="despreNoi.htm">Despre noi</a> 
        <a href="meniuri.htm">Meniu</a> 
        <a href="rezervari.htm">Rezervare eveniment</a> 
        <a href="recenzi.htm">Recenzii</a> 
        
        </div> 
    
      
    <!-- Body section -->
    <div class = "body_sec"> 
        <section id="Content"> 
        
       </br>     </br>     </br>
       
       <p align="right", style="font-size:20px" ><i><b>Adresa noastra : Piata Nucetului nr 22, &ensp;&ensp;vedeti harta &#8595;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;</b></i></p>
             
       <p><img src="resources/google.jpg"style="float:right;width:600px;height:280px;">
        
        
        <p><b>Orar restaurant :</b></p>
        <table>
        <tr>
   <td>Luni - Vineri</td>
    <td>09:00 - 22:00</td>
    </tr>
    <tr>
    <td>Sambata</td>
    <td>09:00 - 23:00</td>
    </tr>
    <td>Duminica</td>
    <td>10:00 - 22:00</td>
		 </table>
		 
		 </br>     </br>
	
		 <p><b>Contacteaza-ne:</b></p>
		 <p>Email : farcanea_george@yahoo.com</p>
		 <p>Telefon : 0756095714</p>
		 

</body>
</html>