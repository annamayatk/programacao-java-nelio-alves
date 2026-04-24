package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] nomes = new String[n];
		double[] precosCompra = new double[n];
		double[] precosVenda = new double[n];

		double lucro = 0.0, totalCompra = 0, totalVenda = 0, lucroTotal = 0;
		int cont1 = 0, cont2 = 0, cont3 = 0;

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			precosCompra[i] = sc.nextDouble();
			precosVenda[i] = sc.nextDouble();

			double diferenca = precosVenda[i] - precosCompra[i];

			lucro = diferenca * 100 / precosCompra[i];
			if (lucro < 10) {
				cont1++;
			} else if (lucro >= 10 && lucro <= 20) {
				cont2++;
			} else {
				cont3++;
			}

			totalCompra += precosCompra[i];
			totalVenda += precosVenda[i];
		}

		lucroTotal = totalVenda - totalCompra;

		System.out.println("Lucro abaixo de 10%: " + cont1);
		System.out.println("Lucro entre 10% e 20%: " + cont2);
		System.out.println("Lucro acima de 20%: " + cont3);
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f%n", lucroTotal);

		sc.close();
	}

}
