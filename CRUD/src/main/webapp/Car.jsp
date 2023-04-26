<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <html>

        <body>
            <h2>Hello World!</h2>
            <div align="center">
                <table border="1" cellpadding="5">
                    <caption>
                        <h2>List of carLists</h2>
                    </caption>
                    <tr>
                        <th>id;</th>
                        <th>name</th>
                        <th>prize</th>
                    </tr>
                    <c:forEach var="carList" items="${carList}">
                        <tr>
                            <td>
                                <c:out value="${carList.id}" />
                            </td>
                            <td>
                                <c:out value="${carList.name}" />
                            </td>
                            <td>
                                <c:out value="${carList.prize}" />
                            </td>
                            <td> <a href="/edit?id=<c:out value='${carList.id}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="/delete?id=<c:out value='${carList.id}' />">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <h1>Get User Inputs</h1>
            <form action="/serv" method="post">
                <label for="id">ID:</label> <input type="text" id="id" name="id"><br>
                <label for="name">Name:</label> <input type="text" id="name" name="name"><br>
                <label for="price">Price:</label> <input type="text" id="prize" name="prize"><br>
                <input type="submit" value="Submit">
            </form>

            <h1>Edit & Updte</h1>
            <form action="/update" method="get">
                <label for="id">ID:</label> <input type="text" id="id" name="id" value="${id}" readonly><br>
                <label for="name">Name:</label> <input type="text" id="name" name="name" value="${name}"><br>
                <label for="price">Price:</label> <input type="text" id="prize" name="prize" value="${prize}"><br>
                <input type="submit" value="UPDATE">
            </form>
           
        </body>

        </html>