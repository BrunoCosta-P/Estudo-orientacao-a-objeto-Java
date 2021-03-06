public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta (int agencia, int numero, Cliente titular) {
		total++;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saldo insuficente");
			return false;
		}
	}
	
	boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}else {
			System.out.println("Saldo insuficente");
			return false;
		}	
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia<=0) {
			System.out.println("Agencia invalida");
			return;
		}
		
		this.agencia = agencia;
		
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <=0) {
			System.out.println("Numero de conta invalido");
			return;
		}
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public static int getTotal() {
		return total;
	}

}
