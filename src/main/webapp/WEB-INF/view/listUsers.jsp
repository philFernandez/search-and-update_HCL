<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Users</title>
    <link rel="stylesheet" href="/style.css">
</head>
<body>
    <h1>Users</h1>
    <div>
        <table>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Password</th>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                    <td>${user.email}</td>
                    <td>${user.password}</td>
                </tr>
            </c:forEach>
        </table>
            <hr>
            <a href="update"><button type="submit">Edit User</button></a>
            <a href="add"><button type="submit">New User</button></a>
        </ul>

    </div>
</body>
</html>
