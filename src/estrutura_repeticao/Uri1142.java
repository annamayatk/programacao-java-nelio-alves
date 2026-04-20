package estrutura_repeticao;

import java.util.Scanner;

public class Uri1142 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;

		for (int linha = 1; linha <= n; linha++) {
			for (int i = 1; i <= 4; i++) {
				int soma = x + i;
				if (soma % 4 == 0) {
					System.out.print("PUM");
				} else {
					System.out.printf("%d ", soma);
				}
			}
			x = x + 4;
			System.out.println();
		}
		sc.close();
	}

}
