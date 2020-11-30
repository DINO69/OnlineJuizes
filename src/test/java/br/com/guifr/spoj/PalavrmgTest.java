package br.com.guifr.spoj;

import org.junit.Assert;
import org.junit.Test;

public class PalavrmgTest {
	
	@Test
	public void deveRetornarPalavraOrdenadaQuandoPalavraFor_a() {
		
		//3 a's
		
		//arrange
		String expected = "O";
		String palavra  = "a";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void deveRetornarPalavraNaoOrdenadaQuandoPalavraFor_aa() {
		
		//3 a's
		
		//arrange
		String expected = "N";
		String palavra  = "aa";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
		
	}
	
	@Test
	public void deveRetornarPalavraOrdenadaQuandoPalavraFor_Cruz() {
		
		//3 a's
		
		//arrange
		String expected = "O";
		String palavra  = "Cruz";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
		
	}
	
	
	@Test
	public void deveRetornarPalavraOrdenadaQuandoPalavraFor_belo() {
		
		//3 a's
		
		//arrange
		String expected = "O";
		String palavra  = "belo";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void deveRetornarPalavraOrdenadaQuandoPalavraFor_fiNo() {
		
		//3 a's
		
		//arrange
		String expected = "O";
		String palavra  = "fiNo";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void deveRetornarPalavraOrdenadaQuandoPalavraFor_flor() {
		
		//3 a's
		
		//arrange
		String expected = "O";
		String palavra  = "flor";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void deveRetornarPalavraNaoOrdenadaQuandoPalavraFor_batata() {
		
		//3 a's
		
		//arrange
		String expected = "N";
		String palavra  = "batata";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void deveRetornarPalavraNaoOrdenadaQuandoPalavraFor_abracadabra() {
		
		//3 a's
		
		//arrange
		String expected = "N";
		String palavra  = "abracadabra";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void deveRetornarPalavraNaoOrdenadaQuandoPalavraFor_aaaabc() {
		
		//3 a's
		
		//arrange
		String expected = "N";
		String palavra  = "aaaabc";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		//assert
		Assert.assertEquals(expected, actual);
		
	}

}
