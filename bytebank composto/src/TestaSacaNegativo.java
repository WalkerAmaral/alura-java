
public class TestaSacaNegativo {
	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.deposita(10000);
		conta.saca(200);

		System.out.println(conta.getSaldo());
		
		
	}
}
