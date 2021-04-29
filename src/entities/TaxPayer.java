package entities;

public abstract class TaxPayer {

	
	private String name;
	private double rendaAnual;
	
	public TaxPayer() {
	}

	public TaxPayer(String name, double rendaAnual) {
		super();
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract double tax();
	
	
}
