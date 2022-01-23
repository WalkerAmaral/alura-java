
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferência realizada com sucesso");
		} else {
			System.out.println("Pobre");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo );
	}
}
