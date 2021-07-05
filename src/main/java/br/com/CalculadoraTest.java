package br.com;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	
	@Test
	public void deveSeSomarDoisNumeirosPositivo () {
		
		Calculadora calc = new Calculadora();
		int soma = calc.somar(0, 0);
		
		Assert.assertEquals(10, soma);
		
	}

}
