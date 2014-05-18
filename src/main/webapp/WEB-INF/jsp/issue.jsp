<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<meta charset="utf-8">
<title>Jira Emulator</title>
<link rel="stylesheet" href="css/style.css" />
<link href='http://fonts.googleapis.com/css?family=Engagement' rel='stylesheet' type='text/css'>
<!--[if IE]>
  <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.2/jquery.min.js" type="text/javascript" charset="utf-8"></script>
    <script src="js/jquery.uniform.min.js" type="text/javascript" charset="utf-8"></script>
    <script type="text/javascript" charset="utf-8">
      $(function(){
        $("input:checkbox, input:radio, input:file, select").uniform();
      });
    </script>
</head>
<body>
<article>
<h1>Issue DDL and DML Manager</h1>
<form:form method="post" action="add.html" commandName="issue">
	<ul>
        <li>
			<h3><form:label class="label" path="number"><spring:message code="label.number"/></form:label></h3>
			<form:input size="40" path="number" />
        </li>
       <li>
        	<h3><form:label class="label" path="description" ><spring:message code="label.description"/></form:label></h3>
            <form:textarea class="textarea" style="height:50px" cols="80" rows="3" path="description"/>
		</li>
       <li>
        	<h3><form:label class="label" path="ddlChanges" ><spring:message code="label.ddlChanges"/></form:label></h3>
           <form:textarea class="textarea" cols="80" rows="10" path="ddlChanges"/>
		</li>
        <li>
        	<h3><form:label class="label" path="dmlChanges" ><spring:message code="label.dmlChanges"/></form:label></h3>
            <form:textarea class="textarea" cols="80" rows="10" path="dmlChanges"/>
		</li>
        <li>
        	<h3><form:label class="label" path="comments" ><spring:message code="label.comments"/></form:label></h3>
            <form:textarea class="textarea" cols="80" rows="10" path="comments"/>
		</li>
	</ul>
    <p>
        <button type="submit" class="action" value=""><spring:message code="label.addIssue"/></button>
        <button type="reset" class="right">Reset</button>
    </p>
</form:form>
</article>
<footer>
</footer>
