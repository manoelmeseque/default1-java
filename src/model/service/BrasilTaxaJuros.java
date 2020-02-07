package model.service;

public class BrasilTaxaJuros implements TaxaJuros {
	private static final double juros = 2.0;
	
	public BrasilTaxaJuros() {
		
	}
	
	@Override
	public double getJuros() {
		return juros;
	}
	
	
	
}
