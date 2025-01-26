<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://jakarta.apache.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 50%;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            box-shadow: 0 0 10px #ccc;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .form-group button {
            padding: 10px 15px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Login</h2>
        <form:form method="post" action="${pageContext.request.contextPath}/login">
            <div class="form-group">
                <label for="username">Username:</label>
                <form:input path="username" id="username" />
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <form:password path="password" id="password" />
            </div>
            <div class="form-group">
                <button type="submit">Sign In</button>
            </div>
        </form:form>
    </div>
</body>
</html>
