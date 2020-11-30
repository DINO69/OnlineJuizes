package br.com.guifr.expections;

public class PalavraNaoOrdenadaException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public PalavraNaoOrdenadaException(String msg) {
		super(msg);
	}
	
}
