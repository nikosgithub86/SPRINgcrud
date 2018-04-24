<%-- 
    Document   : customers
    Created on : 29 Μαρ 2018, 5:39:00 μμ
    Author     : Nikolaos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <h1 class="text-center">Hello World!</h1>
            </div>
            <div class="row">
                <div class="col-md-4 col-md-offset-4">

                    <table class="table table-bordered table-hover">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th>Surname</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${clist}" var="c">
                                <tr>
                                    <td>${c.name}</td>
                                    <td>${c.surname}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </body>
</html>
