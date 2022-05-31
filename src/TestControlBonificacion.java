
public class TestControlBonificacion {

	public static void main(String[] args) {
								//si dejaramos Funcionario(); no va a compilar al ser una clase abstracta
		Funcionario cristian = new Contador();
		cristian.setSalario(2000);
		
		Gerente gisella = new Gerente();
		gisella.setSalario(10000);
		
		Contador rodolfo = new Contador();
		rodolfo.setSalario(5000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(cristian);
		controlBonificacion.registrarSalario(gisella);
		controlBonificacion.registrarSalario(rodolfo);
				
	}
	
}
