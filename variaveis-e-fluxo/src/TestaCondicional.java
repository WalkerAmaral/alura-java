
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("Condicionais");
		int idade = 10;
		int quantidadePessoas = 1;
		if (idade >= 18) {
			System.out.println("Pode entrar, � maior de idade");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Pode entrar, est� acompanhado");
			} else {
				System.out.println("Voc� � menor de idade, nao pode entrar");
			}
		}
	}
}
