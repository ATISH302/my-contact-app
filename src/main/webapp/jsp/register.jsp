<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<title>新規登録</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
    <div class="container">
        <h1>新規登録</h1>
        <form action="${pageContext.request.contextPath}/register" method="post">
            <p>
                <label for="username">ユーザー名:</label>
                <input type="text" id="username" name="username" required>
            </p>
            <p>
                <label for="password">パスワード:</label>
                <input type="password" id="password" name="password" required>
            </p>
            <div class="button-group">
                <input type="submit" value="登録">
            </div>
        </form>
        <p><a href="login.jsp">ログインはこちら</a></p>
    </div>
</body>
</html>