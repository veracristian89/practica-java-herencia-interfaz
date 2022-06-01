
public class Gerente extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Gerente() {
		this.util = new AutenticacionUtil();
	}
	
	public double getBonificacion() {
		return super.getSalario()+ this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);
	}
	
}
