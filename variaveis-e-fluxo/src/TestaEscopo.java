
public class TestaEscopo {

	public static void main(String[] args) {
		
		System.out.println("Condicionais");
		int idade = 20;
		int quantidadePessoas = 20;
		//boolean acompanhado = quantidadePessoas >= 3;
		
		boolean acompanhado;
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Pode entrar");
		} else {

			System.out.println("Não pode entrar");

		}
		
		System.out.println();
	}

}
