<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/wes.css">
<script type="text/javascript" src="/resources/js/app.js"></script>


<title>TIE</title>
</head>
<body>
<div id="header">
            <img src="/resources/images/logo_wholesale.gif" alt="" />

        </div><h1 align="center">TIE Micro Services Application</h1>
<hr>

  <div class="group_input_box" align="center">
    <form action="wip5Action" method="post" onsubmit="return validate()">
      <table align="center">
      <tr><td colspan="3"><font color="blue" size="3">WIP5 - Information Validation New Line Services</font></td></tr>
      <tr><td colspan="3"></td></tr>
          <tr><td colspan="3"></td></tr>
          <tr><td colspan="3"></td></tr>
        <tr>
          <td>Enter Telephone Number:</td><td></td>
          <td><input id="telephonenumber" name="telephonenumber"></td>
          </tr>
          <tr>
          <td>Current/Future:</td><td></td>
          <td>
          <select name="currentfuture" id="currentfuture" style="width: 145px">
          <option value=""></option>
		  <option value="Current">Current</option>
		  <option value="Future">Future</option>
		  </select>
          </td>
          </tr>
          <tr>
          <td>Enter Post Code:</td><td></td>
          <td><input id="postalcode" name="postalcode"></td>
          </tr>
          <tr>
          <td>Enter House Number:</td><td></td>
          <td><input id="housenumber" name="housenumber"></td>
          </tr>
          <tr>
          <td>Enter House Number Addition:</td><td></td>
          <td><input id="housenumberadd" name="housenumberadd"></td>
          </tr>
          <tr><td colspan="3"></td></tr>
          <tr><td colspan="3"></td></tr>
          <tr><td colspan="3"></td></tr>
          <tr>
          <td align="right"><input class="submitbutton" type="submit" value="Submit"></td><td></td><td align="left"><input class="submitbutton" type="button" value="Back" onclick="window.history.go(-1);"></td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>