<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/jstlHeader.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>알뜰시장</title>
<style>
  table {
    width: 100%;
    border: 1px solid #444444;
  }
  th, td {
    border: 1px solid #444444;
  }
</style>
</head>
<body>
<p>알뜰시장</p>
<p>환영합니다 ${sessionScope.loginUser }님 <a href="/jquery/logout">로그아웃</a></p>
<div>게시글 리스트</div>
<table>
<thead><tr>
<td>제목</td>
<td>조회수</td>
<td>작성자</td>
<td>분류</td>
<td>가격</td>

</tr></thead>

<c:forEach var="b" items="${result }">
<fmt:formatDate value="${b.updatetime}" pattern="yyyy-MM-dd HH:MM:ss" var="dateFormat_cr"/>
<tr>
<td><a href="/view/boardDetail?id=${b.id }">${b.title }</a></td>
<td>${b.views }</td>
<td>${b.users }</td>
<td>${b.choose }</td>
<td>${b.price }</td>

</tr>
</c:forEach>
</table>
<div> <a href="/view/boardwrite">글 작성하기</a></div>
</body>
</html>