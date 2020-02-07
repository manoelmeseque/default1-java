package model.service;

import java.security.InvalidParameterException;

public interface TaxaJuros {
	double getJuros();
	
	default double pagamento(double montante, int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Quantidade de meses invalidos!");
		}else {
			return montante * Math.pow(1 + getJuros() / 100, meses);
		}
	}
}
