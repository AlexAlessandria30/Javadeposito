
public class Persone {
	String nome ,cognome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String toString() {
		String persone =  this.nome + " " + this.cognome;

		return persone;
	}

}
