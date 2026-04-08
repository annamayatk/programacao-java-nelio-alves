package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1050 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int ddd = sc.nextInt();
		String cidade = "";

		switch (ddd) {
		case 11:
			cidade = "Sao Paulo";
			break;
		case 19:
			cidade = "Campinas";
			break;
		case 21:
			cidade = "Rio de Janeiro";
			break;
		case 27:
			cidade = "Vitoria";
			break;
		case 31:
			cidade = "Belo Horizonte";
			break;
		case 32:
			cidade = "Juiz de Fora";
			break;
		case 61:
			cidade = "Brasilia";
			break;
		case 71:
			cidade = "Salvador";
			break;
		default:
			System.out.println("DDD nao cadastrado");
		}
		
		if (cidade != "") {
		System.out.println(cidade);
		}
		sc.close();
	}

}
