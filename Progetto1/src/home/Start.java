package home;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Start {

	public static void main(String[] args) {

		int a = 100;
		int b = 10;

		int c = a / b;

		System.out.println(c);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual'è il tuo nome?");
		String nome = scanner.nextLine();

		System.out.println("Qual'è il tuo cognome?");
		String cognome = scanner.nextLine();

		System.out.println("Qual'è la tua eta?");
		int eta = scanner.nextInt();
		scanner.nextLine();

		System.out.println("In che citta vivi?");
		String citta = scanner.nextLine();

		System.out.println("Ciao " + nome + " " + cognome);
		System.out.println("Hai " + eta + " anni");
		System.out.println("Vivi a " + citta);

		int w = 10;

		if (w > 10) {
			System.out.println("Sono maggiore della W");
		} else if (w < 10) {
			System.out.println("Sono minore della W");
		} else {
			System.out.println("Posso essere uguale a W");

		}

		String nome1 = "Mario";
		String nome2 = "Pippo";
		
//equals viene usato per stabilire se le string sono uguali
		
		if (nome1.equals("Mario")) {
			System.out.println("i nomi sono uguali");
		} else {
			System.out.println("i nomi non sono uguali");
		}

		int importo = 3999;
		int totale = 0;

		if (importo >= 4000) {
			totale = importo;
			System.out.println("Niente aumento");
		} else {
			totale = importo + (importo * 10 / 100);
			System.out.println(importo + " piu aumento del 10% " + totale);
		}

		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Inserisci un numero da 1 a 100       - Altri numeri per uscire");
		int numero = scanner1.nextInt();
		scanner1.nextLine();

		String messaggio = null;

		if (numero >= 1 && numero <= 100) {

			if (numero >= 1 && numero <= 50) {
				if (numero % 2 == 0) {
					messaggio = "Il numero è pari";
				} else {
					messaggio = "Il numero è dispari";
				}
			}

			if (numero >= 51 && numero <= 100) {
				if (numero % 3 == 0) {
					messaggio = "Il numero è divisibile per 3";
				} else {
					messaggio = "Il numero non è divisibile per 3";
				}
			}

		} else {
			messaggio = "FINE";
		}

		System.out.println(messaggio);

	}

}
