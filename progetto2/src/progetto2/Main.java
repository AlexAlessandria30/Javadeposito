package progetto2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean b = true;

		while (b) {
			
			System.out.println("Menu principale");

				Scanner scanner = new Scanner(System.in);

				System.out.println("Premi 1 per fare un addizione " + "\n" + "Premi 2 per moltiplicazione " + "\n"
						+ "Premi 3 per sottrazione " + "\n" + "Premi 4 per divisione" + "\n"
						+ "Qualsiasi altro numero per uscire");
			try {
				

				int valore = scanner.nextInt();
				scanner.nextLine();

				switch (valore) {
				case 1:
					Scanner addizione = new Scanner(System.in);

					System.out.println("inserisci un numero");
					int numero1 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("inserisci un altro numero");
					int numero2 = scanner.nextInt();
					scanner.nextLine();

					int somma = numero1 + numero2;
					System.out.println("Il risultato è " + somma + "\n");
					break;

				case 2:
					Scanner moltiplicazione = new Scanner(System.in);

					System.out.println("inserisci un numero");
					int numero3 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("inserisci un altro numero");
					int numero4 = scanner.nextInt();
					scanner.nextLine();

					int prodotto = numero3 * numero4;
					System.out.println("Il risultato è " + prodotto + "\n");
					break;

				case 3:
					Scanner sottrazione = new Scanner(System.in);

					System.out.println("inserisci un numero");
					int numero5 = scanner.nextInt();
					scanner.nextLine();

					System.out.println("inserisci un altro numero");
					int numero6 = scanner.nextInt();
					scanner.nextLine();

					int differenza = numero5 - numero6;
					System.out.println("Il risultato è " + differenza + "\n");
					break;

				case 4:
					Scanner divisione = new Scanner(System.in);

					System.out.println("inserisci un numero");
					int numero7 = scanner.nextInt();
					scanner.nextLine();
					
					for (int i = 0; i < 5; i++) {
						if (numero7 <= 0) {
						System.out.println("Reinserisci un altro numero diverso da 0 \n");
						 numero7 = scanner.nextInt();
						scanner.nextLine();
					}
					}

					System.out.println("inserisci un altro numero \n");
					int numero8 = scanner.nextInt();
					scanner.nextLine();

					for (int i = 0; i < 5; i++) {
						if (numero8 <= 0) {
						System.out.println("Reinserisci un altro numero diverso da 0 \n");
						 numero8 = scanner.nextInt();
						scanner.nextLine();
					}
					}
					

					try {

						double diviso = numero7 / numero8;
						System.out.println("Il risultato è " + diviso + "\n");

					} catch (Exception e) {

						System.out.println("Operazione non consentita \n");

					}

					break;

				default:
					b = false;
					break;
				}

			} catch (Exception e) {
				System.out.println("Errore nella selezione");
			}
		}
	}
}
