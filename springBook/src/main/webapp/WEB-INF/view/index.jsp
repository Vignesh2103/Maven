<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HOME</title>
   <!-- <link rel="stylesheet" href="rolex.css"> -->
   <style>
    .container{
        width: 400px;
        margin: 50px auto;
        padding: 20px;
        border: 1px solid #ccc;
        border-radius: 5px;
        background-color: #f7f7f7;
        text-align: center;
        box-shadow: 0px 0px 10px rgba(0,0,0,0.3);
      }
      .container button[type="submit"] {
        background-color: #456fc9;
        color: #fff;
        border: none;
        border-radius: 5px;
        padding: 10px 20px;
        font-size: 16px;
        cursor: pointer;
      }
    
    .container h2 {
        margin-top: 0;
      }
    
      .container button[type="submit"]:hover {
        background-color: #2844e2;
        font-size: 18px;
      }
      .container:hover{
        box-shadow: 0px 0px 20px rgba(0,0,0,0.5);
        border: 1px solid #999;
    
      }
    
      .form-group {
        margin-bottom: 20px;
      }
   </style>
</head>
<body>
    <div class="container">
        <h2>ADD OR LIST BOOKS</h2>
        <div class="form-group">
            <form method="get" action="showForm" >
                <button type="submit">ADD</button>
             </form>
        </div>
        <div class="form-group">
            <form method="get" action="list">
                <button type="submit">LIST</button>
            </form>
        </div>
    </div>
</body>
</html>