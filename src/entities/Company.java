package entities;

public class Company extends TaxPayer {

	
	private Integer numberOfEmployees;
	
	public Company() {
		
	}
	
	public Company(String name, double rendaAnual, Integer numberOfEmployees) {
		super(name, rendaAnual);
		this.numberOfEmployees = numberOfEmployees;
	}


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		if(numberOfEmployees > 10) {
			return getRendaAnual() * 0.14;
		}else {
			return getRendaAnual() * 0.16;
		}
		
	}
	
	
}
