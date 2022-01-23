
public class TestaFuncionario {

	public static void main(String[] args) {

		Gerente nico = new Gerente();
//		nico.setSenha(2222);
		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2600);
//		nico.autentica(2222);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
