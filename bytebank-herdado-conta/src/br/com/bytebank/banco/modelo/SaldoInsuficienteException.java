package br.com.bytebank.banco.modelo;
/**
 * Classe que representa um cliente no ByteBank
 * 
 * @author Lucas Amaral
 * @version 0.1
 *
 */

public class SaldoInsuficienteException extends Exception {

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}
