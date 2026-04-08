package estrutura_sequencial;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();
		
		int anos = idade / 365;
		int resto = idade % 365;
		
		int meses = resto / 30;
		resto = resto % 30;
		
		int dias = resto;
		

		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		sc.close();
	}

}
