<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags"%>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>


<%-- <from id="formList" name="formList" method="get" action="/infra/member/memberList">
	<input type="hidden" id="thisPage" name="thisPage" value="<c:out value ="${vo.thisPage }" default="1"/>">
	<input type="hidden" id="ifmmSeq" name="ifmmSeq"> --%>



<select name="shIfmmDelNy">
	<option value="">::삭제여부::
	<option value="1" <c:if test="${vo.shIfmmDelNy eq 1 }">selected</c:if>>Y
	
	<option value="0" <c:if test="${vo.shIfmmDelNy eq 0 }">selected</c:if>>N
	
</select>
<select name="shOption" id="shOption">
	<option value="2">전체
	<option value="1">id
	<option value="0">이름
</select>
|| 회원이름 :
<input type="text" name="shIfmmName" id="shIfmmName">
<input type="submit" id="btnSubmit" name="search">
<!-- <input type="submit" id="btnSubmit2" name="search"> -->
<br>


<div id="userList">
	<c:choose>
		<c:when test="${fn:length(test) eq 0}">
			<tr>
				<td class="text-center" colspan="9">There is no data!</td>
			</tr>
		</c:when>
		<c:otherwise>
			<c:forEach items="${test}" var="item" varStatus="status">
				<c:out value="${item.ifmmSeq}" /> | <a
					href="/infra/member/memberView?ifmmSeq=<c:out value="${item.ifmmSeq}"/>"><c:out
						value="${item.ifmmId}" /></a> | <c:out value="${item.ifmmName}" /> | <c:out
					value="${item.ifmmPassword}" /> | <c:out
					value="${item.ifmmChildrenNum}명" />

				<%-- <Button onclick="deleteUser(${item.ifmmSeq})"> 삭제 </Button> --%>


				<br>

			</c:forEach>
		</c:otherwise>
	</c:choose>

</div>

<script>
	$(document).ready(function() {
		var searchWord = "${searchWord}";
		var searchOption = "${searchOption}"
		
		if(searchWord != "") {
			$("#shIfmmName").val(searchWord);
		}
		
		if(searchOption != 2) {
			$("#shOption").val(searchOption).prop("selected", true);
		}
		
		var input = document.getElementById("shIfmmName");
		
		input.addEventListener("keyup", function(event) {
			if(event.keyCode ===13) {
				event.preventDefault();
				search();
			}
		})
		
	})

	function deleteUser(seq) {
		// json 형식으로 데이터 set
		var param = {
			ifmmSeq : seq
		}

		// ajax 통신
		$.ajax({
			type : "POST", // HTTP method type(GET, POST) 형식이다.
			url : "/infra/member/memberDel", // 컨트롤러에서 대기중인 URL 주소이다.
			data : param, // Json 형식의 데이터이다.
			success : function(res) { // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
				// 응답코드 > 0000
				alert(res.code);

			},
			error : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
				alert("통신 실패.")
			}
		});
	}

	$("#btnSubmit").on("click", function() {
		search();
	})
	
	function search(){
		if ($("#shIfmmName").val() == "" || $("#shIfmmName").val() == null) {
			alert("znznfnvldzmvhdm 이다.");
			$("#shIfmmName").focus();
		}
		var param = {	
			shIfmmName : $("#shIfmmName").val()
		}

		var url = "/infra/member/memberList?";
		var data = "shIfmmName=" +  $("#shIfmmName").val() + "&shOption=" + $("select[name=shOption]").val();
		
		location.href = url + data;
		
/* 		$.ajax({
			type : "POST", // HTTP method type(GET, POST) 형식이다.
			url : "/infra/member/memberListAjax", // 컨트롤러에서 대기중인 URL 주소이다.
			data : param, // Json 형식의 데이터이다.
			success : function(res) { // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
				// 응답코드 > 0000
				
				console.log(res);
				console.log(res.list);
				
				var listHtml = "";
				
				for (var i = 0; i < res.list.length; i++) {
					listHtml += res.list[i].ifmmSeq + " " + res.list[i].ifmmName + " " + res.list[i].ifmmPassword;

					$("#userList").html(listHtml);
				}

			},
			error : function(XMLHttpRequest, textStatus, errorThrown) { // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
				alert("통신 실패.")
			}
		}); */
	}
</script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="/infra/resources/js/validation.js"></script>

