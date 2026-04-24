package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numeros = new int[n];
		int cont = 0;

		for (int i = 0; i < n; i++) {
			numeros[i] = sc.nextInt();
			if (numeros[i] % 2 == 0) {
				cont = cont + 1;
			}
		}
		int[] pares = new int[cont];
		int x = 0;
		double media = 0.0;

		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				pares[x] = numeros[i];
				x = x + 1;
			}
		}

		for (int i = 0; i < cont; i++) {
			media = media + pares[i];
		}
		
		media = media / (x);

		System.out.println(media);
		sc.close();
	}

}
