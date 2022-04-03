package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

public class AccountTests {
	@Test
	public void depositoShouldIncrementarWhenrealizado() {
		// Arrange -> Instancia os objetos necess�rios
		double montante = 200.00;
		double saldoEsperado = 196.00;
		Account acc = new Account(1L, 0.0);
		
		// Act -> executa as a��es necess�rias
		
        acc.deposito(montante);
		// Asserts -> Declara o que deveria acontecer (Resultado esperado)
		
		Assertions.assertEquals(saldoEsperado, acc.getSaldo());
		
		
		
		
		
		
		
	}

}
