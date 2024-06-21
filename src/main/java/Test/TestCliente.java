package Test;

import DAO.TblClienteImp;
import model.TblCliente;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblCliente cliente= new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		//insrtamos datos
		cliente.setNombre("Estefano");
		cliente.setApellido("Gomez");
		cliente.setDni("9876512");
		cliente.setEmail("wano@mojon.diarrea");
		cliente.setTelf("3225187");
		cliente.setSex("Male");
		cliente.setNacionalidad("peruca");
		//invomos el methotd registrar
		crud.RegistrarCliente(cliente);
	}//fin de principal

}//fin de clase
