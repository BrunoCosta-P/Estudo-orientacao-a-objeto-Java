public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
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
		return this.saldo;
	}
	
}
