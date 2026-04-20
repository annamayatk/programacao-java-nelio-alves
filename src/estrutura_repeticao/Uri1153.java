package estrutura_repeticao;

import java.util.Scanner;

public class Uri1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int resultado = 1;
		
		// fatorial é N = N * (N-1) * (N-2) * (N-3) * . . . * 1
		// n = 4 * 3 * 2 * 1 == 24
		
		for (int i = n; i > 0; i--) {
			resultado = resultado * i;
			
		}
		System.out.println(resultado);

		sc.close();

	}

}
