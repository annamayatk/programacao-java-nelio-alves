package estrutura_repeticao;

import java.util.Scanner;

public class Uri1144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int linha = 1; linha <= n; linha++) {
			int saida = 0;
			for (int i = 1; i <= 3; i++) {
				saida = (int) Math.pow(linha, i);
				if (i > 1)
					System.out.printf(" ");
				System.out.printf("%d", saida);

			}
			System.out.println();
			for (int j = 1; j <= 3; j++) {
				int soma = linha;
				if (j > 1) {
					soma = (int) Math.pow(linha, j) + 1;
					System.out.printf(" ");
				}
				System.out.printf("%d", soma);
			}
			System.out.println();
		}

		sc.close();
	}

}