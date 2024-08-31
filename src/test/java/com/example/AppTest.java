package com.example;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
	@Test
	public void testSuma() {
		int resultado = App.suma(2, 3);
		int esperado = 5;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta() {
		int resultado = App.resta(3, 2);
		int esperado = 1;
		
		assertEquals(esperado, resultado);
	}

}
