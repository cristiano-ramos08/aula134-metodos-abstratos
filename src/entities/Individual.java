package entities;

public class Individual extends TaxPayer {
	
	private double gastosSaude;
	
	public Individual() {
		
	}	
	
	public Individual(String name, double rendaAnual, double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}


	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Integer gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double tax() {
		
		//double imposto = (getRendaAnual() < 20000.00) ? getRendaAnual * 0.15 - gastos * 0.5 :
		double tax = 0.0;
		if (getRendaAnual() < 20000.0) {
			tax = getRendaAnual() * 0.15 - gastosSaude * 0.5;
		}
		else {
			tax = getRendaAnual() * 0.25 - gastosSaude * 0.5;
		}
		
		if (tax < 0.0) {
			tax = 0.0;
		}
		return tax;
	}
	

}
