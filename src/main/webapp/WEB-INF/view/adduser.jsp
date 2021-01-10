<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE HTML>
<head>
    <meta charset="ISO-8859-1">
    <title>Add User</title>
</head>
<html>
    <body>
        <div align="center">
            <h1>Add User</h1>
            <form:form modelAttribute="user">
                <table>
                        <form:errors path="" element="td" />
                        <tr>
                            <td>
                                <form:label path="name">User Name</form:label>
                            </td>
                            <td>
                                <form:input path="name" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <form:label path="email">User Email</form:label>
                            </td>
                            <td>
                                <form:input path="email" type="email" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <form:label path="password">User Password</form:label>
                            </td>
                            <td>
                                <form:password path="password" />
                            </td>
                        </tr>
                </table>
                <input type="submit" value="Add User">
            </form:form>
        </div>
    </body>
</html>