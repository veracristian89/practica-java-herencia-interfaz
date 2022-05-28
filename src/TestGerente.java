
public class TestGerente {

	public static void main(String[] args) {
		Gerente cristianGerente = new Gerente();
		cristianGerente.setSalario(6000);
		cristianGerente.setNombre("Cristian Vera");
		cristianGerente.setDocumento("123123");
		cristianGerente.setClave("algunaPelotudez");
		System.out.println(cristianGerente.iniciarSesion("algunaPelotudez"));
		System.out.println(cristianGerente.getNombre());
		System.out.println(cristianGerente.getBonificacion());
	}
	
}
