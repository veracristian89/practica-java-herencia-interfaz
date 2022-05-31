
public class Administrador extends Funcionario {

	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return this.clave == clave;
	}
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
