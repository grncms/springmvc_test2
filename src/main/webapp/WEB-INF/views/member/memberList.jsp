<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

<c:choose>
	<c:when test="${fn:length(test) eq 0}">
		<tr>
			<td class="text-center" colspan="9">There is no data!</td>
		</tr>	
	</c:when>
	<c:otherwise>
		<c:forEach items="${test}" var="item" varStatus="status">	
		<c:out value="${item.ifmmSeq}"/> | <c:out value="${item.ifmmId}"/> | <c:out value="${item.ifmmName}"/> | <c:out value="${item.ifmmPassword}"/> | <c:out value="${item.ifmmChildrenNum}명"/> 
		<Button onclick="deleteUser(${item.ifmmSeq})"> 삭제 </Button>
		
		  
		<br>
		
		</c:forEach>
	</c:otherwise>
</c:choose>	 

<script>
	function deleteUser(seq) {
	    // json 형식으로 데이터 set
        var param = {
        		ifmmSeq  : seq
        }
            
        // ajax 통신
        $.ajax({
            type : "POST",            // HTTP method type(GET, POST) 형식이다.
            url : "/infra/member/memberDel",      // 컨트롤러에서 대기중인 URL 주소이다.
            data : param,            // Json 형식의 데이터이다.
            success : function(res){ // 비동기통신의 성공일경우 success콜백으로 들어옵니다. 'res'는 응답받은 데이터이다.
                // 응답코드 > 0000
                alert(res.code);
            },
            error : function(XMLHttpRequest, textStatus, errorThrown){ // 비동기 통신이 실패할경우 error 콜백으로 들어옵니다.
                alert("통신 실패.")
            }
        });
	}
</script>