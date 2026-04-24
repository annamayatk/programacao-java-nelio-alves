package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] reais = new double[n];
		double soma = 0.0;
	
		for (int i = 0; i < n; i++) {
			reais[i] = sc.nextDouble();
			soma += reais[i];
		}

		double media = soma / n;

		System.out.printf("%.3f%n", media);

		for (int i = 0; i < n; i++) {
			if (reais[i] < media) {
				System.out.println(reais[i]);
			}
		}

		sc.close();
	}

}
