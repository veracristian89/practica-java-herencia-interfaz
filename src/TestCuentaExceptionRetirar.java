
public class TestCuentaExceptionRetirar {

	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorro(123, 456);
		cuenta.depositar(1000);
			try {
				cuenta.retirar(1500);
			} catch (SaldoInsuficientException e) {
				e.printStackTrace();
			}
		System.out.println(cuenta.getSaldo());
	}
	
}
