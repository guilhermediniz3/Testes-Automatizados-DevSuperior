package tests.factory;

import entities.Account;

public class AccountFactory {
           public static Account createEmptyAccount() {
        	   
        	   return new Account(1L , 0.0);
        	   
        	   
        	   
        	   
           }
           
           public static Account createAccount(double saldoInicial) {
        	   
        	   return new Account(1L,saldoInicial);
           }
}
