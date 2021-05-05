<%@ page language="java" contentType="text/html;
charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>
<head>

<title>알뜰시장</title>

</head>
<body>

	<h1>${title}</h1>
	<h3>${id } <input type="text" id="id" name="id" placeholder="아이디입력"></h3>
	<h3>${pw}	<input type="text" id="pw" name="pw" placeholder="비밀번호입력"></h3>
	
	
<a href="${path}/shop/login" >로그인하기</a> <a href="${path}/shop/signup" >회원가입하러가기</a>
	
</body>
</html>
