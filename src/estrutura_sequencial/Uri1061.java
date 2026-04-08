package estrutura_sequencial;

import java.util.Scanner;

public class Uri1061 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Dia");
		int dia1 = sc.nextInt();
		sc.nextLine();
		String linha1 = sc.nextLine();
		String[] partes = linha1.split("[: ]+");
		int hora1 = Integer.parseInt(partes[0]);
		int min1 = Integer.parseInt(partes[1]);
		int seg1 = Integer.parseInt(partes[2]);
		
		System.out.print("Dia");
		int dia2 = sc.nextInt();
		sc.nextLine();
		String linha2 = sc.nextLine();
		String[] partes2 = linha2.split("[: ]+");
		int hora2 = Integer.parseInt(partes2[0]);
		int min2 = Integer.parseInt(partes2[1]);
		int seg2 = Integer.parseInt(partes2[2]);
		
		dia1 = dia1 * 86400;
		hora1 = hora1 * 3600;
		min1 = min1 * 60;
		seg1 = seg1 + dia1 + hora1 + min1;
		
		dia2 = dia2 * 86400;
		hora2 = hora2 * 3600;
		min2 = min2 * 60;
		seg2 = seg2 + dia2 + hora2 + min2;
		
		int diferenca = seg2 - seg1;
		
		int diasSaida = diferenca / 86400;
		int resto = diferenca % 86400;
		
		int horasSaida = resto / 3600;
		resto = resto % 3600;
		
		int minutosSaida = resto / 60;
		resto = resto % 60;
		
		int segundosSaida = resto;
				
		System.out.printf("%d dia(s)%n", diasSaida);
		System.out.printf("%d hora(s)%n", horasSaida);
		System.out.printf("%d minuto(s)%n", minutosSaida);
		System.out.printf("%d segundo(s)%n", segundosSaida);
		
		sc.close();
	}

}
