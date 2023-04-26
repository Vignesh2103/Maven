<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BOOK-FORM</title>
    <style>
        /* Box styling */
form {
    background-color: #f9f9f9;
    margin: 50px auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f7f7f7;
        text-align: center;
        width: 400px;
    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.3);
  }
  
  /* Field styling */
  label {
    display: block;
    font-weight: bold;
    margin-bottom: 5px;
    color: #333;
  }
  
  input[type="text"] {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    border: none;
    border-radius: 5px;
    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
  }
  
  /* Submit button styling */
  input[type="submit"] {
    background-color: #4861f0;
    color: white;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    transition: background-color 0.3s ease;
  }
  
  input[type="submit"]:hover {
    background-color: #2844e2;
  }
  
  /* Field focus styling */
  input[type="text"]:hover {
    outline: #2844e2;
    background-color:rgb(197, 202, 202) ;
    color: black;
    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.3);
  }
  form:hover{
    box-shadow: 0px 0px 20px rgba(0,0,0,0.5);
    border: 1px solid #999;
  }
  .form-group {
    margin-bottom: 20px;
  }
  
    </style>
</head>
<body>
   <div class="form-group">
    <form method="post" action="${pageContext.request.contextPath}/update">
        <label>BOOK ID</label>
        <input type="text" class="id" name="id" value="${book.id}" readonly><br>
        <label>BOOK TITTLE</label>
        <input type="text" class="title" name="title" value="${book.title}"><br>
        <label>BOOK AUTHOR</label>
        <input type="text" class="author" name="author" value="${book.author}"><br>
        <label>BOOK PRICE</label>
        <input type="text" class="price" name="price" value="${book.price}"><br>
        <input type="submit" class="submit" name="" value="update">
    </form>
    
   </div>
    
</body>
</html>