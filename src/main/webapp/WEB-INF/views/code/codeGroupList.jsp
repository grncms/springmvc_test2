<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags"%>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

<from id="formList" name="formList" method="get"
	action="/infra/code/codeGroupList"> <input type="hidden"
	id="thisPage" name="thisPage"
	value="<c:out value ="${vo.thisPage }" default="1"/>"> <input
	type="hidden" id="ifcgSeq" name="ifcgSeq"> <select
	name="shIfcgDelNy">
	<option value="">::삭제여부::
	<option value="1" <c:if test="${vo.shIfcgDelNy eq 1 }">selected</c:if>>Y
	
	<option value="0" <c:if test="${vo.shIfcgDelNy eq 0 }">selected</c:if>>N
	
</select> || 회원이름 : <input type="text" name="shIfcgName" id="shIfcgName">
|| <select name="shOption">
	<option value="">::검색구분::
	<option value="1">한글
	<option value="0">영문
</select> <input type="text" name="shValue"> <input type="submit"
	id="btnSubmit" name="search"> <input type="submit"
	id="btnSubmit2" name="search"> <br>



<c:choose>
	<c:when test="${fn:length(list) eq 0}">
		<tr>
			<td class="text-center" colspan="9">There is no data!</td>
		</tr>
	</c:when>
	<c:otherwise>
		<c:forEach items="${list}" var="item" varStatus="status">


			<c:out value="${item.ifcgSeq}" /> |  <%-- <a href="javascript:goForm(<c:out value=${item.ifcgSeq}"><c:out value="${item.ifcgName}" /></a> --%>
			<a href="/infra/code/codeGroupView?ifcgSeq=<c:out value="${item.ifcgSeq}"/>"><c:out
					value="${item.ifcgName}" /></a> | <c:out value="${item.ifcgDelNy}" />
			<%-- 위에있는 seq 소괄호	뒤에 붙일거	&shOption=<c:out value="${vo.shOption }"/>&shValue=<c:out value="${vo.shValue }"/> --%>
			<br>

		</c:forEach>
	</c:otherwise>
</c:choose> </from>


<nav aria-label="...">
	<ul class="pagination">

		<c:if test="${vo.startPage gt vo.pageNumToShow}">
			<li class="page-item"><a class="page-link"
				href="/infra/code/codeGroupList?thisPage=${vo.startPage - 1}&shOption=<c:out value="${vo.shOption }"/>&shValue=<c:out value="${vo.shValue }"/>">Previous</a></li>
		</c:if>

		<c:forEach begin="${vo.startPage}" end="${vo.endPage}" varStatus="i">
			<c:choose>
				<c:when test="${i.index eq vo.thisPage}">
					<li class="page-item active"><a class="page-link"
						href="/infra/code/codeGroupList?thisPage=${i.index}&shOption=<c:out value="${vo.shOption }"/>&shValue=<c:out value="${vo.shValue }"/>">${i.index}</a></li>
				</c:when>
				<c:otherwise>
					<li class="page-item"><a class="page-link"
						href="/infra/code/codeGroupList?thisPage=${i.index}&shOption=<c:out value="${vo.shOption }"/>&shValue=<c:out value="${vo.shValue }"/>">${i.index}</a></li>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:if test="${vo.endPage ne vo.totalPages }">
			<li class="page-item"><a class="page-link"
				href="/infra/code/codeGroupList?thisPage=${vo.endPage + 1}&shOption=<c:out value="${vo.shOption }"/>&shValue=<c:out value="${vo.shValue }"/>">Next</a></li>
		</c:if>
	</ul>
</nav>



<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="/infra/resources/js/validation.js"></script>



<script type="text/javascript">
	$("#btnSubmit").on("click", function() {

		if ($("#shIfcgName").val() == "" || $("#shIfcgName").val() == null) {
			alert("znznfnvldzmvhdm 이다.");
			$("#shIfcgName").focus();
		}

		/* alert($("#shOption").val()); */
		/* alert("hello javascript!!!");
		confirm("진짜 삭제 하시겠습니까? 삭제하시면 이후 복원이 되지 않습니다.");			// jquery 방식 */
		/* alert("jquery : " +    $("#shIfcgName").val()                     );
		alert("javascrip: " + document.getElementById("shIfcgName").value );
		alert($("#shIfcgDelNy").val());
		alert($("#shIfcgName").val());
		alert($("#input[name=shIfcgName]").val());
		alert($("#shOption").val());
		alert($("#shValue").val());
		 */

	});
</script>



<c:if test="${vo.startPage gt vo.pageNumToShow}">
	<li class="page-item"><a class="page-link"
		href="/infra/code/codeGroupList?thisPage=${vo.startPage - 1}">Previous</a></li>
</c:if>
<c:forEach begin="${vo.startPage}" end="${vo.endPage}" varStatus="i">
	<c:choose>
		<c:when test="${i.index eq vo.thisPage}">
			<li class="page-item active"><a class="page-link"
				href="/infra/code/codeGroupList?thisPage=${i.index}">${i.index}</a></li>
		</c:when>
		<c:otherwise>
			<li class="page-item"><a class="page-link"
				href="/infra/code/codeGroupList?thisPage=${i.index}">${i.index}</a></li>
		</c:otherwise>
	</c:choose>
</c:forEach>
<c:if test="${vo.endPage ne vo.totalPages}">
	<li class="page-item"><a class="page-link"
		href="/infra/code/codeGroupList?thisPage=${vo.endPage + 1}">Next</a></li>
</c:if>





