
public class TestaGeteSet {
	public static void main(String[] args) {
		Cliente Bruno = new Cliente("Bruno Costa", "222.2322.222-22", "Programador");
		Conta bruno = new Conta(133,154828,Bruno);
		
		bruno.deposita(1000);


		System.out.println(bruno.getTitular().getNome() );
		System.out.println(Bruno.getNome() );
		
		
	}}
