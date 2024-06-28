package Test;

import java.util.List;

import DAO.TblClienteImp;
import model.TblCliente;


public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TblCliente cliente= new TblCliente();
		TblClienteImp crud=new TblClienteImp();
		/*insrtamos datos
		cliente.setNombre("Mojon");
		cliente.setApellido("Gomez");
		cliente.setDni("9876512");
		cliente.setEmail("wano@mojon.diarrea");
		cliente.setTelf("3225187");
		cliente.setSex("Male");
		cliente.setNacionalidad("peruca");
		//invomos el methotd registrar
		crud.RegistrarCliente(cliente);*/
		
		List<TblCliente> listado=crud.ListarCliente();
		//aplicamos un bucle
		for(TblCliente lis:listado){
			
			//imprimimos por pantalla
			System.out.println("nombre "+lis.getNombre()+
					" Apellido "+lis.getApellido()+" Telefono "+lis.getTelf()+" Nacionalidad "+lis.getNacionalidad()+
					" Email "+lis.getEmail()+" Sexo "+lis.getSex());
			
		}
	}//fin de principal

}//fin de clase
