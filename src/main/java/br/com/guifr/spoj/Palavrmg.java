package br.com.guifr.spoj;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Palavrmg {

	private static Scanner scanner;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		int quantidadeTestes = scanner.nextInt();
		
		while (quantidadeTestes-- > 0) {
			System.out.println(palavraOrdenada(scanner.next()));
		}
		
	}
	
	
	
	public static String palavraOrdenada(String palavra) {
		
		AtomicInteger atomicInteger = new AtomicInteger();
		atomicInteger.set(Integer.MIN_VALUE);
		
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		atomicBoolean.set(true);
		
		palavra.toUpperCase().chars().forEach(i -> {
			
			if(i > atomicInteger.get()) {
				atomicInteger.set(i);
			}else {
				atomicBoolean.set(false);
			}
			
//			System.out.println(i);
			
		});

		
		String ordenada;
		
		if(atomicBoolean.get())
			ordenada = "O";
		else
			ordenada = "N";
		
		return String.format("%s: %s", palavra, ordenada);
		
	}

}
