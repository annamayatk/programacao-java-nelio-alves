package estrutura_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1132 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		int min, max;
		
		if (x > y) {
			max = x;
			min = y;
		} else {
			max = y;
			min = x;
		}
		
		for (int i = min; i <= max; i++) {

			if (i % 13 != 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);
		sc.close();
	}

}
