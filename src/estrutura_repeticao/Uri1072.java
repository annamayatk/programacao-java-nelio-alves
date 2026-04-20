package estrutura_repeticao;

import java.util.Scanner;

public class Uri1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = 0;
		int in = 0;
		int out = 0;

		for (int i = 1; i <= N; i++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		sc.close();
	}

}
