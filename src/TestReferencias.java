
public class TestReferencias {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNombre("roberto gomez bola�os");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("dr chapatin");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
	}
	
}
