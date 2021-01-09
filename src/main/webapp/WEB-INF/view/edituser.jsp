<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE HTML>
<head>
    <meta charset="ISO-8859-1">
    <title>Edit User</title>
</head>
<html>
    <body>
        <form:form modelAttribute="editform">
            <form:errors path="" element="div" />
            <div>
                <form:label path="name">User Name</form:label>
                <form:input path="name" />
                <form:errors path="name" />
            </div>
            <div>
                <form:label path="email">User Email</form:label>
                <form:input path="email" />
                <form:errors path="email" />
            </div>
            <div>
                <form:label path="password">User Password</form:label>
                <form:password path="password" />
                <form:errors path="password" />
            </div>
            <div>
                <input type="submit" value="Add User">
            </div>
        </form:form>
    </body>
</html>
