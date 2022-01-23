
public class TestaCondicional2 {

	public static void main(String[] args) {

		System.out.println("Condicionais");
		int idade = 20;
		int quantidadePessoas = 0;
		boolean acompanhado = quantidadePessoas >= 3;

		if (idade >= 18 && acompanhado) {
			System.out.println("Pode entrar");
		} else {

			System.out.println("Não pode entrar");

		}
		
		System.out.println();
	}
}
