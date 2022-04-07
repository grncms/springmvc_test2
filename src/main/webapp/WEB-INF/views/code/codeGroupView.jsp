<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>

<c:out value="${item.ifcgSeq}"/> | <c:out value="${item.ifcgName}"/> | <c:out value="${item.ifcgDelNy}"/> <br>
<%-- <c:out value="${memberDetail.ifcgSeq}"/> | <c:out value="${memberDetail.ifcgName}"/> | <c:out value="${memberDetail.ifcgDelNy}"/> <br> --%>

<a href="/infra/code/codeGroupList?thisPage=<c:out value ="${vo.thisPage }"/>&shOption=<c:out value="${vo.shOption }"/>&shValue=<c:out value="${vo.shValue }"/>">목록</a>
<a href="/infra/code/codeGroupForm2?ifcgSeq=<c:out value="${item.ifcgSeq }"/>">수정</a>
<a href="/infra/code/codeGroupDele?ifcgSeq=<c:out value="${item.ifcgSeq }"/>" id="btnDelete">삭제(진짜)</a>
<a href="/infra/code/codeGroupDele?ifcgSeq=<c:out value="${item.ifcgSeq }"/>">삭제(가짜)</a>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script type="text/javascript">
	
	$("#btnDelete").on("click", function(){
		var answer = confirm ('삭제하시겠습니까?');
		
		if(answer){
			// /infra/code/codeGroupDele 이동
		} else {
			return false;
		}
	});
</script>


<!-- jquery ui CSS -->    
<link href="/infra/resources/common/jquery/jquery-ui-1.13.1.custom/jquery-ui.css" rel="stylesheet"> 
---
<input type="text" id="abcDate" name="abcDate">
---
<!-- jquery ui -->
<script src="/infra/resources/common/jquery/jquery-ui-1.13.1.custom/jquery-ui.js"></script>
---
<script type="text/javascript">
	$(document).ready(function(){
		 $("#abcDate").datepicker();
	}); 

	$.datepicker.setDefaults({
	    dateFormat: 'yy-mm-dd',
	    prevText: '이전 달',
	    nextText: '다음 달',
	    monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	    monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	    dayNames: ['일', '월', '화', '수', '목', '금', '토'],
	    dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
	    dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],	
	    showMonthAfterYear: true,
	    yearSuffix: '년'
	});
</script>




