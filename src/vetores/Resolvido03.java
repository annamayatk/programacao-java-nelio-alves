package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Resolvido03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		double[] vetAltura = new double[n];
		int menores = 0;

		for (int i = 0; i < n; i++) {
			vetNome[i] = sc.next();
			vetIdade[i] = sc.nextInt();
			vetAltura[i] = sc.nextDouble();
			
			if (vetIdade[i] < 16) {
				menores += 1;
			}
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + vetAltura[i];
		}
		double media = soma / n;
		System.out.printf("Altura média: %.2f%n", media);

		double porcentagem = menores * 100 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

		sc.close();
	}

}
