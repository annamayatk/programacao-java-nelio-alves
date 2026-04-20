package estrutura_repeticao;

import java.util.Scanner;

public class Uri1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0, y = 0, soma = 0;

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x % 2 == 0) {
				x += 1;
			}
			
			for (int j = 0; j < y; j++) {
				soma += x;
				x += 2;

			}
			System.out.println(soma);
			soma = 0;
		}
		sc.close();
	}

}
