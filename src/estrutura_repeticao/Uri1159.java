package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1159 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		while (x != 0) {
			int soma = 0;
			int cont = 0;
			while (cont < 5) {
				if (x % 2 == 0) {
					soma += x;
					cont += 1;
				}
				x += 1;
			}
			System.out.println(soma);
			x = sc.nextInt();
		}

		sc.close();

	}

}
