<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Find User</title>
</head>
    <body>
        <div align="center">
            <h1>Update User</h1>
            <form:form action="update" method="post" modelAttribute="user">
                <table>
                    <tr>
                        <td>
                            <form:label path="id">User ID:</form:label>
                        </td>
                        <td>
                            <form:input value="" path="id" required="required" /> <hr>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="name">User Name:</form:label>
                        </td>
                        <td>
                            <form:input path="name" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="email">User Email:</form:label>
                        </td>
                        <td>
                            <form:input path="email" type="email" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="password">User Password:</form:label>
                        </td>
                        <td>
                            <form:password path="password" />
                        </td>
                    </tr>
                </table>
                <form:button>Update</form:button>
            </form:form>
        </div>
    </body>
</html>