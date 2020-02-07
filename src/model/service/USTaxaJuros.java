package model.service;

public class USTaxaJuros implements TaxaJuros {
	private static final double juros = 1.0;
	
	public USTaxaJuros() {
		
	}
	
	@Override
	public double getJuros() {
		return juros;
	}
	
	
}
