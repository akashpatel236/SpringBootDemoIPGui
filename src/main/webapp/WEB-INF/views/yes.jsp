<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="/resources/css/wes.css">
<link rel="stylesheet" href="/resources/css/styleNew.css">
<title>KPN Telecom Wholesale</title>
</head>
<body>
	<div id="header">
		<img src="/resources/images/logo_wholesale.gif" alt="" />

	</div>
	<h1 align="center">TIE Micro Services Application</h1>
	<hr>
	<div class="group_input_box" align="center">
	<form action="/kpn-wholesale/" method="post">
		<table align="center">
			<tbody>
				<tr>
					<td align="left" colspan="2"><font color="blue" size="4">Yes!!!
							TieWIPServiceProvider MicroService is up and running you can send
							your request.</font><br>
					<br></td>
					<td></td>
				</tr>
				
			</tbody>
		</table>
		<table align="center" class="table1">
			<tbody class="menu">
				
				<thead>
				<tr>
                        <th scope="row">Below are the Service Status</th></tr>
                    <tr>
                        <th scope="col">No.</th>
                        <th scope="col">Service Name</th>
                        <th scope="col">Service Status</th>
                    </tr>
                </thead>
				<!-- <tr>
					<td><b>No.</b></td><td><b>Service Name</b></td><td><b>Service Status</b></td>
				</tr> -->
				<tr>
					<td>1</td><td>Instance1-WIP1 Service</td><td><b>${Instance1WIP1}</b></td>
				</tr>
				<tr>
					<td>2</td><td>Instance2-WIP1 Service</td><td><b>${Instance2WIP1}</b></td>
				</tr>
				<tr>
					<td>2</td><td>WIP5 Service</td><td><b>${WIP5}</b></td>
				</tr>
			</tbody>
		</table>
		<table class="menu" align="center">
			<tbody>
				<tr>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td align="center" colspan="3"><input class="submitbutton"
						type="submit" value="OK"></td>
				</tr>
			</tbody>
		</table>
		</form>
	</div>

</body>
</html>