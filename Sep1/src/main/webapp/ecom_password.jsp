<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Sign In</title>
<style>
		.center {
			position: relative;
			text-align: center;
			margin-left: auto;
			margin-right: auto;
		}
		button{
            background-color: cornflowerblue;
            color: rgb(0, 0, 0);
            padding: 10px 20px;
            text-decoration: none;
            border-radius: 20px;
            transition: background-color 0.3s ease;    
        }
        
        button:hover{
            background-color: rgb(255, 255, 255);
        }
</style>
</head>
<body style="background-color:#99ccff;">
	<div class="center">
	<br/>
	<form action="authorization">
		Username: <input type='text' name='user'><br/><br>
		Password: <input type='password' name='pwd'> <br/><br>
		<button>Submit</button>
	</form>
	</div>
</body>
</html>