<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="rb" uri="http://www.springframework.org/tags" %>


<form method="post" action="/infra/member/memberList">

	<input type="text" name="ifmmId" placeholder="아이디">
	<input type="text" name="ifmmName" placeholder="이름">
	<input type="text" name="ifmmPassword" placeholder="비번">
	
	<input type="text" name="ifmmChildrenNum" placeholder="몇명">
	
	
	<input type="submit" value="제출">
</form>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>memberForm - Bootstrap</title>
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<link href="../../_bootstrap/bootstrap-5.1.3-dist/css/bootstrap.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<style>
body {
	min-height: 100vh;
	background: -webkit-gradient(linear, left bottom, right top, from(#92b5db),
		to(#1d466c));
	background: -webkit-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
	background: -moz-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
	background: -o-linear-gradient(bottom left, #92b5db 0%, #1d466c 100%);
	background: linear-gradient(to top right, rgb(255, 128, 64) 0%, #fffff1
		100%);
}

.input-form {
	max-width: 680px;
	margin-top: 80px;
	padding: 32px;
	background: #fff;
	-webkit-border-radius: 10px;
	-moz-border-radius: 10px;
	border-radius: 10px;
	-webkit-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
	-moz-box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15);
	box-shadow: 0 8px 20px 0 rgba(0, 0, 0, 0.15)
}
</style>
</head>

<body>
	<div class="container">
		<div class="input-form-backgroud row">
			<div class="input-form col-md-12 mx-auto">
				<h4 class="mb-3">회원가입</h4>
				<form class="validation-form" novalidate>
					<!-- 아이디이름 -->
					<div class="row">
						<div class="col-md-6 mb-3">
							<label for="id">아이디</label><br>
								<input type="text" name="ifmmId" placeholder="아이디">
							<!-- <input type="text" class="form-control" id="id" placeholder="" value="" required> -->
							<div class="invalid-feedback">필수정보입니다.</div>
						</div>
						<div class="col-md-6 mb-3">
							<label for="name">이름</label><br><input type="text" name="ifmmName" placeholder="이름">
							<div class="invalid-feedback">필수정보입니다.</div>
						</div>
					</div>
					
					<!-- 비밀번호 -->
					<div class="row">
						<div class="col-md-6 mb-3">
							<label for="name">비밀번호</label> <br>	<input type="text" name="ifmmPassword" placeholder="비번">
							<div class="invalid-feedback">필수정보입니다.</div>
						</div>
						<div class="col-md-6 mb-3">
							<label for="nickname">비밀번호확인</label> <input type="password"
								class="form-control" id="password" placeholder="" value=""
								required>
							<div class="invalid-feedback">필수정보입니다.</div>
						</div>
					</div>
					
					<!-- 이메일&인증 -->
					<div class="row">
						<div class="col-md-8 mb-3">
							<label for="name">이메일</label> <input type="password"
								class="form-control" id="password" placeholder="you@example.com"
								value="" required>
							<div class="invalid-feedback">필수정보입니다.</div>
						</div>
						<div class="col-md-4 mb-3">
							<label for="code">이메일 인증 코드</label> <input type="text"
								class="form-control" id="code" placeholder="" required>
							<div class="invalid-feedback">인증 코드를 입력해주세요.</div>
						</div>
						<div class="col-md-12 mb-3">
<!-- 							<label for="nickname">ㄴㅁㅇㅁㄴㅇ </label> -->

							<!-- Button trigger modal -->
							<button type="button" class="btn btn-danger btn-md btn-block"
								data-bs-toggle="modal" data-bs-target="#exampleModalLive">인증메일받기</button>

							<!-- Modal-s -->
							<div class="modal fade" id="exampleModalLive" tabindex="-1"
								aria-labelledby="#exampleModalLive" aria-hidden="true">
								<div class="modal-dialog">
									<div class="modal-content">
										<div class="modal-header">
											<h5 class="modal-title" id="exampleModalLabel">인증확인</h5>
											<button type="button" class="btn-close"
												data-bs-dismiss="modal" aria-label="Close"></button>
										</div>
										<div class="modal-body">인증메일을 확인해주세요.</div>
										<div class="modal-footer">
											<button type="button" class="btn btn-light"
												data-bs-dismiss="modal">확인</button>

										</div>
									</div>
								</div>
							</div>
							<!-- modal-e -->
						</div>
					</div>
					
					
					<!-- 생년월일 & 성별 -->
					
					<div class="row">
						<div class="col-md-6 mb-3">
							<label for="root">성별</label> <select
								class="custom-select d-block w-100" id="root">
								<option value="성별">성별</option>
								<option>남자</option>
								<option>여자</option>
								<option>선택안함</option>
							</select>
						</div>
						<div class="col-md-6 mb-3">
							<label for="code">생일</label> <input type="text"
								class="form-control" id="code" placeholder="" required>
								<form action="" method="get" id="" name="" enctype="multipart/form-data">
					<input type="date" id="" name="date1" min="1950-12-31" max="2022-01-10" size="">
				</form>
							<div class="invalid-feedback">필수정보입니다.</div>
						</div>
					</div>
					


					<!-- 주소 -->
					<div class="mb-3">
						<label for="address">주소</label> <input type="text"
							class="form-control" id="address" placeholder="서울특별시 강남구"
							required>
						<div class="invalid-feedback">주소를 입력해주세요.</div>
					</div>

					<div class="mb-3">
						<label for="address2">상세주소<span class="text-muted">&nbsp;(선택)</span></label>
						<input type="text" class="form-control" id="address2"
							placeholder="상세주소를 입력해주세요.">
					</div>

					<!-- ㅇㅅㅇ -->

					<div class="row">
						<div class="col-md-8 mb-3">
							<label for="root">가입 경로</label> <select
								class="custom-select d-block w-100" id="root">
								<option value=""></option>
								<option>검색</option>
								<option>카페</option>
							</select>
							<div class="invalid-feedback">가입 경로를 선택해주세요.</div>
						</div>
						<div class="col-md-4 mb-3">
							<label for="code">추천인 코드</label> <input type="text"
								class="form-control" id="code" placeholder="" required>
							<div class="invalid-feedback">추천인 코드를 입력해주세요.</div>
						</div>
					</div>
					
					<hr class="mb-4">
					<div class="custom-control custom-checkbox">
						<input type="checkbox" class="custom-control-input" id="aggrement"
							required> <label class="custom-control-label"
							for="aggrement">개인정보 수집 및 이용에 동의합니다.</label>
					</div>
					<div class="mb-4"></div>
					<button class="btn btn-primary btn-lg btn-block" type="submit">가입 완료</button>
				</form>
			</div>
		</div>
		<footer class="my-3 text-center text-small">
			<p class="mb-1">&copy; 당근마켓</p>
		</footer>
	</div>



	<script>
    window.addEventListener('load', () => {
      const forms = document.getElementsByClassName('validation-form');

      Array.prototype.filter.call(forms, (form) => {
        form.addEventListener('submit', function (event) {
          if (form.checkValidity() === false) {
            event.preventDefault();
            event.stopPropagation();
          }

          form.classList.add('was-validated');
        }, false);
      });
    }, false);
  </script>
  	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
	<script src="../../_bootstrap/bootstrap-5.1.3-dist/js/bootstrap.min.js"></script>
</body>

</html>