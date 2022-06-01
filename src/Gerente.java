
public class Gerente extends Funcionario implements Autenticable {
	
	public double getBonificacion() {
		return super.getSalario()+ this.getSalario();
	}

	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean iniciarSesion(String clave) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
