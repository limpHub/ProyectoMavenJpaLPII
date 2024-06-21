<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center">Registrar cliente</h1>
	<form action="ControladorCliente" method="post">
		<table align="center">
			<tr>
				<td>Apellido</td>
				<td><input type="text" name="Apellido"></td>
			<tr>
				<td>Nombre</td>
				<td><input type="text" name="Nombre"></td>
			<tr />
			<tr>
				<td>Dni</td>
				<td><input type="text" name="Dni"></td>
			<tr />
			<tr>
				<td>Sexo</td>
				<td><input type="text" name="Sexo"></td>
			<tr />
			<tr>
				<td>Nacionalidad</td>
				<td><input type="text" name="Nacionalidad"></td>
			<tr />
			<tr>
				<td>Telefono</td>
				<td><input type="text" name="Telefono"></td>
			<tr />
			<tr>
				<td colspan="2" style="text-align: center"
				><input type="submit" value="registrar" ></td>
			<tr />
			
		</table>
	</form>

</body>
</html>