package estrutura_sequencial;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tempoSegundos = sc.nextInt();
		
		int horas = (tempoSegundos / 3600);
		int minutos = (tempoSegundos % 3600) / 60; 
		int segundos = (tempoSegundos % 3600) % 60;
	
		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
		sc.close();
	}

}
