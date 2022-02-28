
import java.util.ArrayList;
import java.util.Scanner;

import Crud.Crud;
import Crud.Persona;

public class Main {

	public static void main(String[] args) {

		boolean b = true;
		int scelta = 0;
		Crud a = new Crud();

		ArrayList<String> nomi = new ArrayList<String>();
		ArrayList<Integer> matricola= new ArrayList<Integer>();

		while (b) {

			a.vedimenu();
			scelta = a.Scelta();
			Persona persona = new Persona();

			switch (scelta) {
			case 1:

				@SuppressWarnings("unused")

				Scanner scanner1 = new Scanner(System.in);
				a.riempiPersona(persona);

				// System.out.println(persona.getNome());
				// System.out.println(persona.getEta());
				a.riempiArray(nomi, matricola, persona);

				break;

			case 2:
				a.mostraPersone(matricola, nomi);

				break;

			case 3:

				a.modificaPersone(matricola, nomi);
				break;
			case 4 :
				a.eliminaPersona(matricola, nomi);
				
				break;

			default:
				b = false;
				break;
			}

		}
	}

}
