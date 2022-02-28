import java.util.Arrays;
import java.util.Scanner;

public class terzo {

	public static void main(String[] args) {
		
		String[] frutta = new String[6];
		frutta[0] = "mela";
		frutta[1] = "pera";

		String[] studenti = { "Alex", "Michele" ,"Giovanni","Flavia"};

		// foreach

		for (String studente : studenti) {
			// System.out.println(studente);
		}

		int[] numeri = { 12, 4, 3, 7, 2, 9, 5 };
		Arrays.sort(numeri);

		for (int i = 0; i < numeri.length; i++) {

			// System.out.println(numeri[i]);
		}

		// riordinamento senza Arrays.sort()

		int[] numeri2 = { 12, 12, 52, 21, 42, 85, 62, 9, 2, 1, 0,-12,-1,-43,5,23,-12,76,123,-120003 };

		for (int i = 0; i < numeri2.length; i++) {

			for (int j = i + 1; j < numeri2.length; j++) {

				if (numeri2[i] > numeri2[j]) {

					int ordine = numeri2[i];
					numeri2[i] = numeri2[j];
					numeri2[j] = ordine;

					// System.out.println(numeri2[j]);
				}
			}
		}

		for (int ordinato : numeri2) {
			System.out.print(ordinato + " ");
		}

	}
}