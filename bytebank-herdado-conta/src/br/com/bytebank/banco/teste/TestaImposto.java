package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TestaImposto {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(222, 0010);
		cc.deposita(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto calc = new CalculadorImposto();
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
	}

}
