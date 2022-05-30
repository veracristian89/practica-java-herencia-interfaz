
public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario cristian = new Funcionario();
		cristian.setSalario(2000);
		
		Gerente gisella = new Gerente();
		gisella.setSalario(10000);
		
		ControlBonificacion controlBonificacion = new ControlBonificacion();
		
		controlBonificacion.registrarSalario(cristian);
		controlBonificacion.registrarSalario(gisella);
		
	}
	
}
