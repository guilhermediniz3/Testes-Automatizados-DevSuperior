package entities;

public class Account {

	private Long id;
	private Double saldo;
	
	public static double taxa =0.02;
	
	public Account() {
		
	}

	public Account(Long id, Double saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSaldo() {
		return saldo;
	}
     public void deposito(double montante) {
    	 if (montante > 0) {
         montante -= montante * taxa;
    	 saldo += montante;
    	 }
    	
    	 
     }
	
     public void sacar(double montante) {
    	 if(montante > saldo)
    	 {
    		 throw new IllegalArgumentException();
    	
    	 
    	
    	 }
    	 saldo -= montante;
    	 
     }
	
}
