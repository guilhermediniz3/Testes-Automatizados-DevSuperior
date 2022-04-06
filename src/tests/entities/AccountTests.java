package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

public class AccountTests {
	@Test
	public void depositoShouldIncrementarWhenrealizado() {
		// Arrange -> Instancia os objetos necessários
		double montante = 200.00;
		double saldoEsperado = 196.00;
		Account acc = AccountFactory.createEmptyAccount();
		
		// Act -> executa as ações necessárias
		
        acc.deposito(montante);
		// Asserts -> Declara o que deveria acontecer (Resultado esperado)
		
		Assertions.assertEquals(saldoEsperado, acc.getSaldo());
		
		
		
		
		
		
		
	}

	
	@Test
	public void depositoShouldNaoDepositarWhenMontanteNegativo() {
		double montante = -200.00;
		double saldoEsperado = 100.00;
		Account acc = AccountFactory.createAccount(saldoEsperado);
		acc.deposito(montante);
		
		Assertions.assertEquals(saldoEsperado, acc.getSaldo());
	}
  
}
