package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;



import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaSalarioMuitoALto () {
		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class, 
				() -> service.calcularBonus(new Funcionario("Paulo", LocalDate.now(), new BigDecimal("25000"))));
				
	}
	
	
	@Test
	void bonusDeveriaSerDezPorCentoDoSalario () {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Paulo", LocalDate.now(), new BigDecimal("2500")));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeDezMil () {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Paulo", LocalDate.now(), new BigDecimal("10000")));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
	
	
}
