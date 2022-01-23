package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDePrimitivo {

	public static void main(String[] args) {

		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(11,22);
		ContaPoupanca cp1 = new ContaPoupanca(33,44);
		referencias[0] = cc1;
		referencias[1] = cp1;
		
		System.out.println(referencias[0]);
		System.out.println(referencias[1]);
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];
		
		System.out.println(ref);
	}

}
