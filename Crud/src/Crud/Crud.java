package Crud;



import java.util.ArrayList;
import java.util.Scanner;


public class Crud implements ISchemi {
	Scanner scanner = new Scanner(System.in);

	public void vedimenu() {
		System.out.println("Menu principale \n");

		System.out.println("Premi 1 per riempire" + "\n" + "Premi 2 per visualizzare " + "\n"
				+"Premi 3 per modificare"+"\n"+ "Premi 4 per eliminare"+"\n"+"Qualsiasi altro numero per uscire");
	}
	

public int Scelta() {

	int valore = 0;
	boolean vero = true;

	while (vero) {

		

		try {
			valore = scanner.nextInt();
			scanner.nextLine();
			vero = false;

		} catch (Exception e) {
			System.out.println("Errore nella selezione reinserisci un numero");

		}
	}
	return valore;
}


	@Override
	public void riempiPersona(Persona persona) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci  nome");
		persona.setNome(scanner.nextLine());

		System.out.println("Inserisci  cognome");
		persona.setCognome(scanner.nextLine());

		System.out.println("Inserisci matricola?");
		persona.setMatricola(Scelta());
		
	}

	@Override
	public void riempiArray(ArrayList<String> nomi, ArrayList<Integer> matricola, Persona persona) {
		int p = cercaPosizioni(nomi);
		nomi.add(p + " " + persona.getNome() + " " + persona.getCognome()+" "+ persona.getMatricola()) ;
	
		
	}

	@Override
	public int cercaPosizioni(ArrayList<String> nomi) {
		int pos = 0;
		
		
		for (String string : nomi) {
			
				pos ++;
				break;

			
		}

		return pos;
	}

	@Override
	public void mostraPersone(ArrayList<Integer> matricola, ArrayList<String> nomi) {
		
		for (String string : nomi) {
			System.out.println(string);
			
		}
	
		
	}

	@Override
	public void modificaPersone(ArrayList<Integer> matricola, ArrayList<String> nomi) {
		
		mostraPersone(matricola, nomi);
		System.out.println("ModificaPersona");
		System.out.println();
		System.out.println("Quale posizione vuoi modificare");
		System.out.println();
		System.out.println("Scelta Posizione");
		int p=Scelta();
		System.out.println("Scelta Campo");
		System.out.println("1- nome cognome   2- matricola");
		int nce=Scelta();		
		if(nce==1) {
			System.out.println("Inserire Nome e Cognome");
		nomi.add(scanner.nextLine());
		}else {
			System.out.println("Inserire matricola");
			matricola.add(Scelta());
		}
		
	}

	@Override
	public void eliminaPersona(ArrayList<Integer> matricola, ArrayList<String> nomi) {
		mostraPersone(matricola, nomi);
		System.out.println("Elimina Persona");
		System.out.println();
		System.out.println("Quale posizione vuoi Eliminare");
		System.out.println();
		System.out.println("Scelta Posizione");
		int p=Scelta();
		
		for (String string : nomi) {
			string = nomi.remove(p);
		
		}
		 

	
		
	}
	
	
}























