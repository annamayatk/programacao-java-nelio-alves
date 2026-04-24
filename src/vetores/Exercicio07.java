package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		double[] medias = new double[n];
		int cont = 0;

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();

			medias[i] = (nota1[i] + nota2[i]) / 2;
			if (medias[i] >= 6.0) {
				cont++;
			}
		}
		String[] aprovados = new String[cont];
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (medias[i] >= 6.0) {
				aprovados[j] = nomes[i];
				j++;
			}

		}
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < cont; i++) {
			System.out.println(aprovados[i]);
		}
		sc.close();
	}

}
