<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<title>Hello TIE</title>
</head>
<body>
  <h1>TIE WIP Micro services application</h1>
  <hr>
<div class="form">
<form action="hello" method="post" onsubmit="return validate()">
      <table>
        <tr><td>Your Telephone Number is: ${telephonenumber}</td></tr>
        <tr><td>Postal Code is: ${postalcode}</td></tr>
        <tr><td>House Number is: ${houseNumber}</td></tr>
        <tr><td>Current/Future: ${currentFuture}</td></tr>
       </table>
       </form> 
</div>
</body>

</html>