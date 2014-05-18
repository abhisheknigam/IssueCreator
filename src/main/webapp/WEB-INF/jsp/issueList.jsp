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

<h1>Issue List</h1>

<div class="one-third column">
<p><a href="addIssue.html" style="text-decoration: none !important;"><label class="asbestos-flat-button" style= "width:200px;float:left;left:100px;height:30px;margin:-20px;padding-top:10px">Add Issue</label></a>
</p>			
	  </div>
<form:form method="post" action="" commandName="issue">

	<article>
	<c:if  test="${!empty issueList}">
		<table class="data" style="border:1px; width:1200px; position:absolute;left:70px">
		<tr>
			<th><spring:message code="label.number"/></th>
		    <th><spring:message code="label.description"/></th>
		    <th><spring:message code="label.ddlChanges"/></th>
		    <th><spring:message code="label.dmlChanges"/></th>
		    <th><spring:message code="label.comments"/></th>
		</tr>
		<c:forEach items="${issueList}" var="issue">
		    <tr>
		        <td style="width:10%"><a href="https://provenir.atlassian.net/browse/${issue.number}" target="_blank">${issue.number}</a></td>
		        <td style="width:12%">${issue.description} </td>
		        <td style="width:30%">${issue.dmlChanges}</td>
		        <td style="width:30%">${issue.ddlChanges}</td>
		        <td style="width:18%">${issue.comments}</td>
		        <td><a href="delete/${issue.id}" style= "text-decoration:underline;">Delete</a></td>
		    </tr>
		</c:forEach>
		</table>
	</c:if>
	</article>
</form:form>
</body>