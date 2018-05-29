<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Static content -->
<link rel="stylesheet" href="/resources/css/wes.css">
<link rel="stylesheet" href="/resources/css/tie.css">
<script type="text/javascript" src="/resources/js/app.js"></script>


<title>TIE</title>
</head>
<body>
<div id="header">
            <img src="/resources/images/logo_wholesale.gif" alt="" />

        </div><h1 align="center">TIE Micro Services Application</h1>
<hr>
  <div class="group_input_box" align="center">
  <p align="right"><font color="red" size="1">Response From: ${strResponseReceivedFrom}</font></p>
    <form action="/kpn-wholesale/" method="post">
      <table align="center">
      <tr><td align="left" colspan="3"><font color="blue" size="5">WIP1 - Response</font><br><br></td>
      </tr>
      <tr><td colspan="3" class="input_table_text"></td></tr>
          <tr><td colspan="3" class="input_table_text"></td></tr>
          <tr><td colspan="3" class="input_table_text"></td></tr>
        <tr>
          <td class="input_table_text" colspan="3"><font color="blue" size="2">Input Information</font></td><td></td>
        </tr>
        <tr>
          <td class="input_table_text">Telephone Number:</td><td></td>
          <td>${telephonenumber}</td>
          </tr>
          <tr>
          <td class="input_table_text">Post Code:</td><td></td>
          <td>${postalcode}</td>
          </tr>
          <tr>
          <td class="input_table_text">House Number:</td><td></td>
          <td>${houseNumber}</td>
          </tr>
          <tr>
          <td class="input_table_text">House Number Addition:</td><td></td>
          <td>${houseNumberaddinput}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">Current/Future:</td><td></td>
          <td>${currentFuture}
          </td>
          </tr>
          <tr><td colspan="3" class="input_table_text"></td></tr>
          <tr>
          <td class="input_table_text" colspan="3"><font color="blue" size="2">Order Information</font></td><td></td>
          </tr>
          
          <tr>
          <td class="input_table_text" colspan="3"><b>${orderinfo}</b></td>
          </tr>
          <tr>
          <td class="input_table_text">Street:</td><td></td>
          <td>${street}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">House Number:</td><td></td>
          <td>${houseNumber}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">House Number Addition:</td><td></td>
          <td>${houseNumberadd}
          </td>
          </tr>
         <tr>
          <td class="input_table_text">Post Code:</td><td></td>
          <td>${postalcode}</td>
          </tr>
          <tr>
          <td class="input_table_text">Residence:</td><td></td>
          <td>${residence}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">Service Type Telephony:</td><td></td>
          <td>${servicetype}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">Current/Future:</td><td></td>
          <td>${currentFuture}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">Status Connection:</td><td></td>
          <td>${statusconnection}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">Main Number:</td><td></td>
          <td>${telephonenumber}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">Broadband:</td><td></td>
          <td>${broadband}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">High Capacity:</td><td></td>
          <td>${highcapacity}
          </td>
          </tr>
          <tr>
          <td class="input_table_text">Number Of Grid Lines:</td><td></td>
          <td>${numberOfGridLines}
          </td>
          </tr>
          <tr><td colspan="3" class="input_table_text"></td></tr>
          <tr><td colspan="3" class="input_table_text"></td></tr>
          
          <tr><TD class="input_table_text" colspan="3" >_____________________________________________________________________</TD>
          </tr>
          <tr><TD class="input_table_text" >Telephone Number</TD><TD class="input_table_text" >Rol   </TD><TD class="input_table_text" >Status </TD>
          </tr>
          <TR><TD class="input_table_text" >${telephonenumber}</TD><TD class="input_table_text" >${role}</TD><TD class="input_table_text" >${status}</TD>
		  </TR>
		   <tr><TD class="input_table_text" colspan="3" >_____________________________________________________________________</TD>
          </tr>
          <tr><td colspan="3" class="input_table_text"></td></tr>
          <tr>
          <td align="center" colspan="3"><input class="submitbutton" type="submit" value="OK"></td>
        </tr>
          
      </table>
    </form>
  </div>

</body>
</html>