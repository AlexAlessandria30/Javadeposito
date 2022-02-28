

public class Ricerca {

	public boolean cercoNome(Persone persone1, Persone persone2, Persone persone3, String valore) {

		boolean trovato = false;

		String p1 = persone1.getNome();
		String p2 = persone2.getNome();
		String p3 = persone3.getNome();

		String[] persone = new String[3];
		persone[0] = p1;
		persone[1] = p2;
		persone[2] = p3;
		

		for (String string : persone) {
			if(string == valore) {
				trovato= true;
			}

		}
		return trovato;
	}
}
