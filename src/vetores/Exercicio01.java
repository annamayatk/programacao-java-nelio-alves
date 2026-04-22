package vetores;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] reais = new double[n];
		double max = 0.0;
		int posicao = 0;

		for (int i = 0; i < n; i++) {
			reais[i] = sc.nextDouble();

			if (reais[i] > max) {
				max = reais[i];
				posicao = i;
			}
		}
		System.out.printf("%.1f%n", max);
		System.out.println(posicao);
		sc.close();
	}

}
