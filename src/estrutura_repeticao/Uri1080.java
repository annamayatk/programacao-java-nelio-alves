package estrutura_repeticao;

import java.util.Scanner;

public class Uri1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int max = Integer.MIN_VALUE;
		int posicao = 0;
		
		for (int i = 1; i <= 100; i++) {
			n = sc.nextInt();
			if (max < n) {
				max = n;
				posicao = i;
			}
			
		}
		System.out.println(max);
		System.out.println(posicao);
		sc.close();
	}

}
