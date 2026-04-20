package estrutura_repeticao;

import java.util.Scanner;

public class Uri1143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int linha = 1; linha <= n; linha++) {
			for (int i = 1; i <= 3; i++) {
				int saida = (int) Math.pow(linha, i);
				if (i > 1)
					System.out.printf(" ");
				System.out.printf("%d", saida);
			}

			System.out.println();
		}

		sc.close();
	}

}
