<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/errStyle.css">
    <title>Error</title>
</head>
<body>
    <table>
        <th>Error</th>
        <tr>
            <td>${message}</td>
        </tr>
    </table>
    <br><br><hr>
    <a href="list"><button>Go Back</button></a>
</body>
</html>

