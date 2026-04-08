package estrutura_condicional;

import java.util.Scanner;

public class Aula35 {

	public static void main(String[] args) {

		int x = 5;

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12)
			System.out.println("Bom dia"); // quando tem apenas um comando, pode apagar as chaves

		else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
	}

}
