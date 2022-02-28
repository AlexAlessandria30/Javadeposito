package Home;

import java.util.Scanner;
import modelli.Persona;

public class Sistema {
	Scanner scanner = new Scanner(System.in);

	public void vedimenu() {
		System.out.println("Menu principale \n");

		System.out.println("Premi 1 per riempire" + "\n" + "Premi 2 per visualizzare " + "\n"
				+"Premi 3 per modificare"+"\n"+ "Qualsiasi altro numero per uscire");
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
	
	

	public void riempiPersona(Persona persona) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci  nome");
		persona.setNome(scanner.nextLine());

		System.out.println("Inserisci  cognome");
		persona.setCognome(scanner.nextLine());

		System.out.println("Qual'è la tua eta?");
		persona.setEta(Scelta());

	}
	

	public void riempiArray(String[] nomi, int[] eta, Persona persona) {
		int p = cercaPosizioni(nomi);
		nomi[p] = persona.getNome() + " " + persona.getCognome();
		eta[p]  = persona.getEta();
	}
	
	

	public int cercaPosizioni(String[] nomi) {
		int pos = 0;

		for (int x = 0; x < nomi.length; x++) {
			if (nomi[x] == null) {
				pos = x;
				break;

			}
		}
		return pos;

	}
	
	
	
	public void mostraPersone(int [] eta , String [] nomi) {
		for (int i = 0; i < nomi.length; i++) {
			if (nomi[i]== null) {
				break;
			}
			System.out.println(i +" " +nomi[i]+ " età: "+ eta[i]);
			System.out.println();
		}
	}
	
	public void modificaPersone(int [] eta , String [] nomi) {
		
	mostraPersone(eta, nomi);
	System.out.println("Modifica Studente");
	System.out.println();
	System.out.println("Quale posizione vuoi modificare");
	System.out.println();
	System.out.println("Scelta Posizione");
	int p=Scelta();
	System.out.println("Scelta Campo");
	System.out.println("1- nome cognome   2- età");
	int nce=Scelta();		
	if(nce==1) {
		System.out.println("Inserire Nome e Cognome");
		nomi[p]=scanner.nextLine();
	}else {
		System.out.println("Inserire Età");
		eta[p]=Scelta();
	}


	
	
		
		
		
		
	}
	
}
