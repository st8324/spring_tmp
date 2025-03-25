<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<h1>게시판 관리</h1>
	<div class="board-list">
		<c:forEach items="${list}" var="board">
			<form class="input-group mb-3" action="<c:url value="/admin/board/update"/>" method="post">
			    <input type="hidden" name="bo_num" value="${board.bo_num }">
			    <input type="text" class="form-control" placeholder="${board.bo_name}" name="bo_name" value="${board.bo_name}">
			    <button type="submit" class="form-control btn btn-outline-warning">수정</button>
			    <a href="<c:url value="/admin/board/delete?num=${board.bo_num}"/>" class="form-control btn btn-outline-danger">삭제</a>
			 </form>
		 </c:forEach>
	</div>
	<div class="board-insert">
		<form action="<c:url value="/admin/board/insert"/>" method="post">
			<div class="input-group mb-3">
			    <input type="text" class="form-control" placeholder="게시판을 입력하세요." name="name">
			    <button class="form-control btn btn-outline-success">등록</button>
			 </div>
		</form>
	</div>
</body>
</html>
