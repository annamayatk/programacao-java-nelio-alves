package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1049 {

	// em Java sempre se usa .equals() para comparar Strings

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String vertebras = sc.nextLine();
		String animal = sc.nextLine();
		String dieta = sc.nextLine();
		String especie = "";

		if (vertebras.equals("vertebrado")) {
			if (animal.equals("ave")) {
				if (dieta.equals("carnivoro")) {
					especie = "aguia";
				} else if (dieta.equals("onivoro")) {
					especie = "pomba";
				}
			} else if (animal.equals("mamifero")) {
				if (dieta.equals("onivoro")) {
					especie = "homem";
				} else if (dieta.equals("herbivoro")) {
					especie = "vaca";
				}
			}
		} else if (vertebras.equals("invertebrado")) {
			if (animal.equals("inseto")) {
				if (dieta.equals("hematofago")) {
					especie = "pulga";
				} else if (dieta.equals("herbivoro")) {
					especie = "lagarta";
				}
			} else if (animal.equals("anelideo")) {
				if (dieta.equals("hematofago")) {
					especie = "sanguessuga";
				} else if (dieta.equals("onivoro")) {
					especie = "minhoca";
				}
			}
		}
		
		System.out.println(especie);
		sc.close();
		
	}

}
