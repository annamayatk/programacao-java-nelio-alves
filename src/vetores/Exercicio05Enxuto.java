package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Enxuto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cont = 0;
		int soma = 0, numero = 0;

		for (int i = 0; i < n; i++) {
			numero = sc.nextInt();
			if (numero % 2 == 0) {
				soma += numero;
				cont++;
			}
		}

		double media = (double) soma / cont;

		System.out.println(media);
		sc.close();
	}

}
