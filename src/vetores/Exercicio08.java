package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] alturas = new double[n];
		char[] sexo = new char[n];
		double max = 0.0, min = Double.MAX_VALUE, media = 0.0;
		int contM = 0, contF = 0;

		for (int i = 0; i < n; i++) {
			alturas[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);

			if (alturas[i] > max) {
				max = alturas[i];
			}
			if (alturas[i] < min) {
				min = alturas[i];
			}

			if (sexo[i] == 'F') {
				media += alturas[i];
				contF++;
			}
			if (sexo[i] == 'M') {
				contM++;
			}
		}

		if (contF > 0) {
			media = media / contF;
		}
		System.out.println("Menor altura = " + min);
		System.out.println("Maior altura = " + max);
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		System.out.println("Numero de homens = " + contM);

		sc.close();
	}

}
