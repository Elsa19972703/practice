<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
    font-family: Arial;
}

* {
    box-sizing: border-box;
}

form.example input[type=text] {
    padding: 10px;
    font-size: 17px;
    border: 1px solid grey;
    float: left;
    width: 80%;
    background: #f1f1f1;
}

form.example button {
    float: left;
    width: 20%;
    padding: 10px;
    background: #2196F3;
    color: white;
    font-size: 17px;
    border: 1px solid grey;
    border-left: none;
    cursor: pointer;
}

form.example button:hover {
    background: #0b7dda;
}

form.example::after {
    content: "";
    clear: both;
    display: table;
}
</style>
</head>

<body align="center">
<h2>Products</h2>
<form class="example" action="Products.jsp">
  <input type="text" placeholder="Search.." name="search">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>
<table>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>Merchant</th>
    <th>Price</th>
    <th>Type</th>
  </tr>
  <tr>
    <td>p1</td>
    <td>samsung note9</td>
    <td>samsung</td>
    <td>73000</td>
    <td>mobile</td>
  </tr>
  <tr>
     <td>p2</td>
    <td>macbook pro 15</td>
    <td>apple</td>
    <td>93000</td>
    <td>laptop</td>
  </tr>
  <tr>
  <td>p3</td>
    <td>oneplus 6</td>
    <td>oneplus</td>
    <td>35000</td>
    <td>mobile</td>
  </tr>
  <tr>
    <td>p4</td>
    <td>apple ipad</td>
    <td>apple</td>
    <td>46000</td>
    <td>gadget</td>
  </tr>
  <tr>
    <td>p5</td>
    <td>boat e234</td>
    <td>boat</td>
    <td>550</td>
    <td>accessories</td>
  </tr>
  <tr>
    <td>p6</td>
    <td>samsung e7</td>
    <td>samsung</td>
    <td>23000</td>
    <td>mobile</td>
  </tr>
</table>
</body>
</html>


