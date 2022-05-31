
public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public boolean retirar(double monto) {
		double comision = 0.2;
		return super.retirar(monto + comision);
	}
	
	@Override
	public void depositar(double monto) {
		this.saldo += monto;
		
	}
}
