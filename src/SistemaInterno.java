
public class SistemaInterno {

	private String clave = "123456";
	
	public boolean autentica(Autenticable gerente) {
		boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
		if(puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		} else {
			System.out.println("Error al iniciar sesion");
			return false;
		}
	}
	
}
