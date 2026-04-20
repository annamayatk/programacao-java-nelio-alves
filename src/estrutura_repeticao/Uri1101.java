package estrutura_repeticao;

import java.util.Scanner;

public class Uri1101 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int max = 0, min = 0, soma = 0;

		while (m > 0 && n > 0) {

			if (n > m) {
				max = n;
				min = m;
			} else {
				max = m;
				min = n;
			}
			for (int i = min; i <= max; i++) {
				System.out.printf("%d", i);

				System.out.printf(" ");

				soma += i;
			}
			System.out.printf("Sum=%d", soma);
			System.out.println();
			soma = 0;

			m = sc.nextInt();
			n = sc.nextInt();
		}

		sc.close();

	}

}
