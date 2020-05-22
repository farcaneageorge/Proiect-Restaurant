<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style> 
        .head1 { 
text-align:left;
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
background-image:url("${pageContext.request.contextPath}/resources/nice.jpg");
background-repeat:no-repeat;
background-size: 100%;
text-align:center;
color:white;
font-size:20px;


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
  width:100%;
}
table, th, td {
  border: 2px solid black;
  border-collapse: collapse;
  
  
}
th  {
  padding: 10px;
  text-align: left;
  
  
  td{
  padding: px;
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
		</br></br>
        
<title></title>
</head>
<body>
</br></br>

	<table >
		<c:forEach items="${model.rezervari }" var="r">
			<tr>
				<td><c:out value="${r.id }" /></td>
				<td><c:out value="${r.nume }" /></td>
				<td><c:out value="${r.prenume }" /></td>
				<td><c:out value="${r.nrTelefon }" /></td>
				<td><c:out value="${r.infoRezervare }" /></td>
				<td><a href="./rezervari-detalii/${r.id }">Detalii</a></td>
				<td><a href="./editRezervare/${r.id }">Edit</a></td>
				<td><a href="./deleteRezervare/${r.id }">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	</br>
	<a href="<c:url value="/rezervareAdd.htm" />"><input type=submit value="Adauga rezervare" class="btn btn-success"/></a>
	
</body>
</html>