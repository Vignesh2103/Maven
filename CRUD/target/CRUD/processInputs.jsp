<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Process Inputs</title>
        </head>

        <body>
            <h1>Process Inputs</h1>
            <% String id=request.getParameter("id"); String name=request.getParameter("name"); String
                price=request.getParameter("price"); %>
                <p>ID: <%=id%>
                </p>
                <p>Name: <%=name%>
                </p>
                <p>Price: <%=price%>
                </p>
        </body>

        </html>