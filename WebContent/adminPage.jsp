<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>
<%@ page import="ua.nure.mirzoiev.hospitalSystem.entity.Role" %>

<html>
<%@ include file="/WEB-INF/jspf/head.jspf" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<c:set var="title" value="admin page" />

<body>
<%@ include file="/WEB-INF/jspf/header.jspf"%>

<table id="main-container" class="table table-striped">

	<tr>
<td class="content">
	<form action="${contextPath}/admin/doctors">
		<button type="submit">List of doctors</button>
	</form>

	<form action="${contextPath}/admin/patients">
		<button type="submit">list of patients</button>
	</form>

	<form action="${contextPath}/admin/patientCards">
		<button type="submit">Read all cards and appointment</button>
	</form>
</td>
</tr>
</table>


<%@ include file="/WEB-INF/jspf/footer.jspf"%>

</body>
</html>
