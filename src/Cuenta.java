//entidad cuenta:

public abstract class Cuenta {

	protected double saldo;//al utilizar private ya no se puede acceder al parametro saldo desde una instancia para modificarlo.
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();
	private static int total = 0; // variable estatica, es pasa a ser un atributo de la clase y no de sus posibles instancias.
	
	
	
	//constructor
	public Cuenta(int agencia, int numero) { // cual es la ventaja? con el constructor obliga a colocar un valor a agencia.
		this.agencia = agencia;
		this.numero = numero;
		Cuenta.total ++;
	}
	
	// metodo sin retorno (void)
	public abstract void depositar(double monto);
	
	//metodo con retorno (boolean, aunque pueden ser distintos retornos como int o double)
	public boolean retirar(double monto) {
		if (this.saldo >= monto) {
			this.saldo -= monto;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transferir(double monto, Cuenta cuenta){
		if(this.saldo >= monto) {
			this.retirar(monto);
			cuenta.depositar(monto);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia>0) {
		this.agencia = agencia;
		} else {
			System.out.println("agencia invalida");
		}
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
