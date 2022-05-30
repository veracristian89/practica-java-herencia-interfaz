import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestFuncionario {

	public static void main(String[] args) {
		Funcionario cristianFuncionario = new Funcionario();
		cristianFuncionario.setSalario(2000);
		System.out.println(cristianFuncionario.getSalario());
		System.out.println(cristianFuncionario.getBonificacion());
	}
	
}
