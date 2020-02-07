package application;

import java.util.Locale;
import java.util.Scanner;

import model.service.TaxaJuros;
import model.service.USTaxaJuros;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Montante: ");
		double montante = sc.nextDouble();
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		System.out.println();
		TaxaJuros tj = new USTaxaJuros();
		System.out.printf("Divida: R$%.2f", tj.pagamento(montante, meses));

	}

}
