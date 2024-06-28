package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.TblClienteImp;

import model.TblCliente;


/**
 * Servlet implementation class ControladorCliente
 */
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControladorCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: Calla mojon ").append(request.getContextPath());
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		List<TblCliente> ListarCliente=crud.ListarCliente();
		request.setAttribute("ListadoClientes",ListarCliente);
		request.getRequestDispatcher("/ListadoCliente.jsp").forward(request, response);
	}// fin doget

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);	
		String ApellidoVar = request.getParameter("Apellido");
		String NombreVar = request.getParameter("Nombre");
		String DniVar = request.getParameter("Dni");
		String SexoVar = request.getParameter("Sexo");
		String EmailVar = request.getParameter("Email");
		String NacionalidadVar = request.getParameter("Nacionalidad");
		String TelefonoVar = request.getParameter("Telefono");
		TblCliente cliente = new TblCliente();
		TblClienteImp crud = new TblClienteImp();
		cliente.setApellido(ApellidoVar);
		cliente.setNombre(NombreVar);
		cliente.setDni(DniVar);
		cliente.setSex(SexoVar);
		cliente.setEmail(EmailVar);
		cliente.setNacionalidad(NacionalidadVar);
		cliente.setTelf(TelefonoVar);
		crud.RegistrarCliente(cliente);
		List<TblCliente> ListarCliente=crud.ListarCliente();
		request.setAttribute("ListadoClientes",ListarCliente);
		request.getRequestDispatcher("/ListadoCliente.jsp").forward(request, response);
	}// fin dopost

}
