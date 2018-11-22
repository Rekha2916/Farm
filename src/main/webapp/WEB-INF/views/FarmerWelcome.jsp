<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

    <head>

        <title>Welcome</title>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

    </head>

    <body>

        <div class="container">

            <h3 id="output_header" class="text-success"><%= request.getAttribute("output") %></h3>

        </div>        

    </body>

</html>
