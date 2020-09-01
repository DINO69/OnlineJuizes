package br.com.guifr.CodeChef;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ModeOfFrequenciesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void findModeForSequence_5_9_2_9_7_2_5_3_is_2() {
		
		//arrange
		int expected = 2;
		int[] arrayNumbers = {5,9,2,9,7,2,5,3};
		
		//act
		int returnMethod = ModeOfFrequencies.findMode(arrayNumbers);
		
		//assert
		Assert.assertEquals(expected, returnMethod);
		
	}
	
	@Test
	public void findModeForSequence_5_9_2_9_7_2_5_3_1_is_1() {
		
		//arrange
		int expected = 1;
		int[] arrayNumbers = {5,9,2,9,7,2,5,3,1};
		
		//act
		int returnMethod = ModeOfFrequencies.findMode(arrayNumbers);
		
		//assert
		Assert.assertEquals(expected, returnMethod);
		
	}
	
	@Test
	public void findModeForSequence_5_5_is_2() {
		
		//arrange
		int expected = 2;
		int[] arrayNumbers = {5,5};
		
		//act
		int returnMethod = ModeOfFrequencies.findMode(arrayNumbers);
		
		//assert
		Assert.assertEquals(expected, returnMethod);
		
	}
	
	@Test
	public void findModeForSequence_5_5_4_4_8_8_8_6_6_6_7_7_7_is_3() {
		
		//arrange
		int expected = 3;
		int[] arrayNumbers = {5,5,4,4,8,8,8,6,6,6,7,7,7};
		
		//act
		int returnMethod = ModeOfFrequencies.findMode(arrayNumbers);
		
		//assert
		Assert.assertEquals(expected, returnMethod);
		
	}

}
