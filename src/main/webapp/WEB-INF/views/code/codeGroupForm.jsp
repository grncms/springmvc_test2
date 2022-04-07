<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/code/codeGroupList">
	<input type="text" name="ifcgName" placeholder="아이디" value="<c:out value="${rt.ifcgName}"/>">
	<input type="submit" value ="제출"> 
</form>

<!-- <form id="form" method="post" action="/infra/code/codeGroupInst"> -->
<form id="form" method="post" action="/infra/code/codeGroupInst" enctype="multipart/form-data">
	<input type="hidden" name="thisPage" value="<c:out value="${vo.thisPage }"/>">
	<input type="hidden" name="shOption" value="<c:out value="${vo.shOption }"/>">
	<input type="hidden" name="shValue" value="<c:out value="${vo.shValue }"/>">
	<input type="hidden" name="">
	<input type="text" id="ifcgName" name="ifcgName" placeholder="코드그룹">
	<input type="text" id="abcDate" name="abcDate">
	<br><input type="file" name="file" multiple>
	<br><input type="file" name="file1">
	
	<input type="submit" id="btnSubmit" value="제출">
</form>