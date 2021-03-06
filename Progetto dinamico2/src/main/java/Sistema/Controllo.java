package Sistema;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import Connessioni.Connetti;
import JavaBean.Esami;
import JavaBean.IGenerica;
import JavaBean.Materie;
import JavaBean.Password;
import JavaBean.Persona;

public class Controllo extends Connetti implements IGenerica {
	public int Calcolo(int x, int y) {

		int risultato = x + y - (x / 2) + (y * 8) / 100 - (x / 10) - (y / 30) / 100;
		return risultato;

	}

	public int Numeromatricola(int x) {
		int matricola = x + 10 * 200 * 324 + 76 / 21 - 10;
		return matricola;
	}

	public String[] mostracolleghi() {
		String[] colleghi = { "Mario Rossi", "Luana Sada", "Franco Gendi", "Giovanni Ressa", "Flavia Zeta" };

		return colleghi;

	}

	

	@Override
	public String toString() {
		return Arrays.toString(mostracolleghi());
	}

	// connessione al DB

	Statement st = null;
	PreparedStatement pst = null;
	ResultSet rst;
	String sql;
	Connection conn;
	ArrayList<Persona> arrayLS = new ArrayList<Persona>();

	public ResultSet listaTuttiRS() {
		Connection connesso = connettiDB();
		try {
			sql = "SELECT * FROM Persona";
			st = connesso.createStatement();

			rst = st.executeQuery(sql);
			// connesso.close();
		} catch (SQLException e) {
			System.out.println("Tabella Inesistente");
		}

		return rst;
	}
	
	// inserisci Alunno

	@Override
	public Persona BeanP(String nome, String cognome, String dataN, String citta,String matricola) {
		Persona persona = new Persona();
		persona.setNome(nome);
		persona.setCognome(cognome);
		persona.setDataN(dataN);
		persona.setCitta(citta);
		persona.setMatricola(matricola);
		return persona;
	}

	// salva alunno
	@Override
	public void insertPersona(Persona persona) {
		// String data=Generica.dataitaing(st.getDataN());
		sql = "INSERT INTO Persona (nome,cognome,dataN,citta,matricola) VALUES(?,?,?,?,?)";
		conn = connettiDB();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, persona.getNome());
			pst.setString(2, persona.getCognome());
			pst.setString(3, persona.getDataN());
			pst.setString(4, persona.getCitta());
			pst.setString(5, persona.getMatricola());
			pst.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
	
	// vedi alunni

	public ResultSet listaAL() {
		conn = connettiDB();
		sql = "SELECT * FROM Persona";

		try {
			st = conn.createStatement();
			rst = st.executeQuery(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rst;

	}

	public void vediListaArray(ArrayList<Persona> persone) {
	
		for (Persona st : persone) {
			System.out.println(st.getNome() + " " 
		              + st.getCognome() + " " + st.getDataN() + " "				
		              + st.getCitta()+ " " + st.getMatricola());
		}
	}
	
	// regisrazione 

	public Password BeanPass(String nome, String cognome, String email, String password) {
		Password persona = new Password();
		persona.setNome(nome);
		persona.setCognome(cognome);
		persona.setEmail(email);
		persona.setPassword(password);
		return persona;
	}

	@Override
	public void insertPassword(Password persona) {
		sql = "INSERT INTO Password (nome,cognome,email,password) VALUES(?,?,?,?)";
		conn = connettiDB();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, persona.getNome());
			pst.setString(2, persona.getCognome());
			pst.setString(3, persona.getEmail());
			pst.setString(4, persona.getPassword());
			pst.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
	
	// login
	public  Boolean verificaLogin(String email, String pass) {
		conn = connettiDB();
		sql = "SELECT * FROM Password WHERE email=? and password=?";
		Boolean  trovato = null;
		try {
			
			pst= conn.prepareStatement(sql);
			pst.setString(1, email);
			pst.setString(2, pass);
			rst=pst.executeQuery();
			trovato = rst.next();
			conn.close();
			
			} catch (Exception e) {
	
		}
		return trovato;
	}
	
	//inserisci esami
	public Esami BeanEsame(String nome, String cognome, String dataE, String esame, String matricola) {
		Esami esam = new Esami();
		esam.setNome(nome);
		esam.setCognome(cognome);
		esam.setDataE(dataE);
		esam.setMateria(esame);
		esam.setMatricola(matricola);
		return esam;
	}

	@Override
	public void insertEsame(Esami persona) {
		sql = "INSERT INTO Esami (nome,cognome,dataE,materia, matricola) VALUES(?,?,?,?,?)";
		conn = connettiDB();

		try {
			pst = conn.prepareStatement(sql);
			pst.setString(1, persona.getNome());
			pst.setString(2, persona.getCognome());
			pst.setString(3, persona.getDataE());
			pst.setString(4, persona.getMateria());
			pst.setString(5, persona.getMatricola());
			pst.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}
	
	public ResultSet listaEs() {
		conn = connettiDB();
		sql = "SELECT * FROM Esami";

		try {
			st = conn.createStatement();
			rst = st.executeQuery(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rst;

	}

	public void vediListaArrayEsami(ArrayList<Esami> esami) {
	
		for (Esami st : esami) {
			System.out.println(st.getNome() + " " 
		              + st.getCognome() + " " + st.getDataE() + " "				
		              + st.getMateria()+ " " + st.getMatricola());
		}
	}
	
	//Login studente
	public  Boolean verificaStudente1(String utente, String password) {
		conn = connettiDB();
		sql = "SELECT * FROM PasswordStu WHERE utente=? and password=?";
		Boolean  trovato = null;
		try {
			
			pst= conn.prepareStatement(sql);
			pst.setString(1, utente);
			pst.setString(2, password);
			rst=pst.executeQuery();
			trovato = rst.next();
			conn.close();
			
			} catch (Exception e) {
	
		}
		return trovato;
	}
	
	//modifica studente
	
	public Persona ottieniRecord(String matricola) {
		Persona persona = new Persona();
		
		conn = connettiDB();
		sql = "SELECT * FROM Persona WHERE matricola=? ";
		
		try {
			
			pst= conn.prepareStatement(sql);
			pst.setString(1, matricola);
			rst=pst.executeQuery();
			
			while (rst.next()) {
		    persona.setMatricola(rst.getString("matricola"));
		    persona.setNome(rst.getString("nome"));
		    persona.setCognome(rst.getString("cognome"));
		    persona.setCitta(rst.getString("citta"));
		    persona.setDataN(rst.getString("dataN"));
		  
				
			}
			
			} catch (Exception e) {
	
		}
		return persona;
	}
	
	public void updatePersona(Persona persona) {
		sql="UPDATE Persona set nome=?, cognome=?, citta=?, dataN=? WHERE matricola=?";
		conn= connettiDB();
		try {
			pst= conn.prepareStatement(sql);
			pst.setString(1, persona.getNome());
			pst.setString(2, persona.getCognome());
			pst.setString(3, persona.getDataN());
			pst.setString(4, persona.getCitta());
			pst.setString(5, persona.getMatricola());
			pst.executeUpdate();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	//elimina Studente non utilizzata unisci ad ottieni record
	
	public void deletePersona(String matricola) {
		
		sql="Delete Persona WHERE matricola=?";
		conn= connettiDB();
		
		try {
			pst= conn.prepareStatement(sql);
			pst.setString(1, matricola);
			pst.executeUpdate();
			conn.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	//mostra materie con tabella
	
	public ResultSet listaMat() {
		conn = connettiDB();
		sql = "SELECT * FROM Materie";

		try {
			st = conn.createStatement();
			rst = st.executeQuery(sql);

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rst;

	}

	public void vediListaArrayMat(ArrayList<Materie> materia) {
	
		for (Materie st : materia) {
			System.out.println(st.getNomeMateria() + " " 
		              + st.getDocente());
		}
	}
	
	
}
