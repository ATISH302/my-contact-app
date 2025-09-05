<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
	<body>
		<div class="container">
		    <h1>ログイン</h1>
		    <form action="${pageContext.request.contextPath}/login" method="post">
		    	<label for="username">ユーザー名:</label>
		    	<input type="text" id="username" name="username" required>
		    	<label for="password">パスワード:</label>
		    	<input type="password" id="password" name="password" required>
		    <button type="submit">ログイン</button>
		</form>
		
			<p style="margin-top: 15px;">
		      <a href="register.jsp">新規登録はこちら</a>
		    </p>
		</div>
	</body>
</html>
