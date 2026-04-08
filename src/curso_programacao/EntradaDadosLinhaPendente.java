package curso_programacao;

import java.util.Scanner;

public class EntradaDadosLinhaPendente {

	public static void main(String[] args) {

		int x;
		String s1, s2, s3;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt(); //acaba comendo uma linha,tem que fazer um nextline extra
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();
	}
}
