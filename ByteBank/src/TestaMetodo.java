
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50);
		
		System.out.println(conta.saldo);
	
	
		Conta contaM = new Conta();
		contaM.deposita(1000);
		System.out.println("saldo contaM" + contaM.saldo);
		contaM.transfere(3000, conta);
		
		System.out.println("saldo contaM" + contaM.saldo);
		System.out.println("saldo conta" + conta.saldo);
	
	}
}


