package br.com.guifr.spoj;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PalavrmgParameterizedTest {
	@Parameter(value = 0)
	public String ordenado;
	
	@Parameter(value = 1)
	public String palavra;
	
	@Test
	public void deveRetornarPalavraOrdenadaQuandoPalavraFor() {
		
		//3 a's
		
		//arrange
//		String expected = "O";
//		String palavra  = "a";
		
		//act
		String actual   = Palavrmg.palavraOrdenada(palavra);
		
		String expected = String.format("%s: %s", palavra, ordenado);
		//assert
		Assert.assertEquals(expected , actual);
		
		
	}
	
	@Parameters(name = "Teste {index} -> Deve retonar [{0}] quando palavra [{1}]")
	public static Collection<Object[]> parametros() {
		
		return Arrays.asList(new Object[][]{
				{"O","a"},
				{"O","Cruz"},
				{"O","belo"},
				{"O","fiNo"},
				{"O","flor"},
				{"N","batata"},
				{"N","abracadabra"},
				{"N","aaaabc"},
				{"N","aa"},
			});
		
	}
	
}
