
public class TestaBanco {
	public static void main(String[] args) {
	
		Conta contaDoBruno = new Conta();
		contaDoBruno.titular = new Cliente();
		
		contaDoBruno.titular.nome = "Bruno Costa";
		contaDoBruno.titular.cpf = "405.888.888.00";
		contaDoBruno.titular.profissao = "Desenvolvedor";
		
		contaDoBruno.deposita(100);
		System.out.println(contaDoBruno.getSaldo());
		
		
	}
}
