<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>
<%@page import="model.TblCliente"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de clientes</title>
</head>
<body bgcolor="#c5dec9">
	<h1 align="center">Listado de clientes</h1>

	<h2 align="center">
		<a href="RegistrarCliente.jsp" style="text-decoration: none;">Registrar
			cliente</a>
	</h2>
	<table align="center" border="2">
		<tr>
			<td>Codigo</td>
			<td>Apellido</td>
			<td>Nombre</td>
			<td>Dni</td>
			<td>Sexo</td>
			<td>Email</td>
			<td>Nacionalidad</td>
			<td>Telefono</td>
		</tr>
		<%
			List<TblCliente> listadocliente = (List<TblCliente>) request.getAttribute("ListadoClientes");
			if (listadocliente != null) {

				for (TblCliente lis : listadocliente) {
		%>
		<tr>
			<td><%=lis.getIdcliente()%></td>
			<td><%=lis.getNombre()%></td>
			<td><%=lis.getApellido()%></td>
			<td><%=lis.getDni()%></td>
			<td><%=lis.getEmail()%></td>
			<td><%=lis.getNacionalidad()%></td>
			<td><%=lis.getSex()%></td>
			<td><%=lis.getTelf()%></td>

		</tr>
		<%
			} //cerramos la condicion...
			} //cerramos el bucle
		%>
	</table>
</body>
</html>