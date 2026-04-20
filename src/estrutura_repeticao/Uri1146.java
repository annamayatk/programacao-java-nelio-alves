package estrutura_repeticao;

import java.util.Scanner;

public class Uri1146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(); //teve que usar isso, porque o sysout print dava time limit exceeded
		
		int x = sc.nextInt();
		while (x != 0) {

			for (int i = 1; i <= x; i++) {
				sb.append(i);
				if (i != x) {
					sb.append(" ");
				}

			}
			sb.append("\n");
			x = sc.nextInt();
		}
		System.out.print(sb);
		sc.close();
	}

}
