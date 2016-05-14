<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ToDo task</title>
</head>
<body>
<h1>Tasks</h1>
<form:form action="task.do" method="POST" commandName="task">
	<table>
		<tr>
			<td>Task ID</td>
			<td><form:input path="taskId" /></td>
		</tr>
<!-- 		<tr> -->
<!-- 			<td>Is done</td> -->
<%-- 			<td><form:input path="isDone" /></td> --%>
<!-- 		</tr> -->
		<tr>
			<td>Task description</td>
			<td><form:input path="task" /></td>
		</tr>
				<tr>
			<td>Done</td>
			<td><form:input type="checkbox" value="true" path="process" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
<!-- 				<input type="submit" name="action" value="Search" /> -->
<!-- 				Test buttons	 -->
<!-- 				<input type="submit" name="action" value="show all" /> -->
<!-- 				<input type="submit" name="action" value="only done" /> -->
<!-- 				<input type="submit" name="action" value="only undone" /> -->
			</td>
		</tr>
		<tr>
			<td>
				<input type="submit" name="action" value="show all" />
				<input type="submit" name="action" value="only done" />
				<input type="submit" name="action" value="only undone" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
<!-- 	<th>Is done</th> -->
	<th>Task description</th>
	<th>process</th>
	<c:forEach items="${taskList}" var="task">
		<tr>
			<td>${task.taskId}</td>
<%-- 			<td>${student.isDone}</td> --%>
			<td width=80%>${task.task}</td>
<%-- 			<td>${task.process}</td> --%>
			<td>${task.process ? "Done" : "Not done" }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>