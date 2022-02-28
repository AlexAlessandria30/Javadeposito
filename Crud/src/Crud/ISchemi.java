package Crud;

import java.util.ArrayList;

public interface ISchemi {
	public void riempiPersona(Persona persona);
	public void riempiArray(ArrayList<String> nomi, ArrayList<Integer> matricola, Persona persona);
	public int cercaPosizioni(ArrayList<String> nomi);
	public void mostraPersone(ArrayList<Integer> matricola, ArrayList<String> nomi) ;
	public void modificaPersone(ArrayList<Integer> matricola, ArrayList<String> nomi);
	public void eliminaPersona(ArrayList<Integer> matricola, ArrayList<String> nomi);

}
