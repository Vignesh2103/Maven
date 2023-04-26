<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
      <%@ page isELIgnored="false" %>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>LIST BOOK</title>
    </head>

    <body>
      <hr />

      <input type="button" value="Add Customer"
       onclick="window.location.href='showForm'; return false;"
       class="btn btn-primary" />
       <br/><br/>
      <!-- <div>
        <table class="table">
          <thead>
            <tr>
              <th>ID</th>
              <th>TITTLE</th>
              <th>AUTHOR</th>
              <th>PRICE</th>
            </tr>
          </thead>
          <tbody id="book-table">
          </tbody>
        </table>
      </div> -->


      <div>BOOK LIST</div>
    </div>
    <div>
     <table>
      <tr>
       <th>ID</th>
       <th>TITTLE</th>
       <th>AUTHOR</th>
       <th>PRICE</th>
      </tr>

      <!-- loop over and print our customers -->
      <c:forEach var="book" items="${books}">

       <!-- construct an "update" link with customer id -->
       <c:url var="updateLink" value="/updateForm">
        <c:param name="bookId" value="${book.id}" />
       </c:url>

       <!-- construct an "delete" link with customer id -->
       <c:url var="deleteLink" value="/delete">
        <c:param name="bookId" value="${book.id}" />
       </c:url>

       <tr>
        <td>${book.id}</td>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.price}</td>

        <td>
         <!-- display the update link --> <a href="${updateLink}">Update</a>
         | <a href="${deleteLink}"
         onclick="if (!(confirm('Are you sure you want to delete this Book?'))) return false">Delete</a>
        </td>

       </tr>

      </c:forEach>

     </table>

    </div>
   </div>

    </body>

    </html>