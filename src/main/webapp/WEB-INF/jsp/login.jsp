<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang='en'>
<head>
    <meta charset="UTF-8" /> 
    <title>
        HTML Document Structure
    </title>
    <link rel="stylesheet" type="text/css" href="css/style1.css" />
</head>
<body>

<div id="wrapper">

	<form:form name="login-form" class="login-form" action="login.html" method="post" commandName="login">
	
		<div class="header">
		<h1>Login</h1>
		<span>Login into the application using your JIRA Credentials</span>
		</div>
	
		<div class="content">
		<form:input name="username"  path="userName" class="input username" placeholder="Username"/>
		<div class="user-icon"></div>
		<form:password name="password"  path="password" class="input password" placeholder="Password"/>
		<div class="pass-icon"></div>		
		</div>

		<div class="footer">
		<input type="submit" name="submit" value="Login" class="button" />
		<input type="submit" name="submit" value="Register" class="register" />
		</div>
	
	</form:form>

</div>
<div class="gradient"></div>


</body>
</html>
