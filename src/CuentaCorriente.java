
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void retirar(double monto) throws SaldoInsuficientException {
		double comision = 0.2;
			super.retirar(monto + comision);	
	}
	
	@Override
	public void depositar(double monto) {
		this.saldo += monto;
		
	}
}
