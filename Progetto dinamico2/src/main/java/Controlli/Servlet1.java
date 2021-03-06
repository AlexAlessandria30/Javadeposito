package Controlli;

import java.io.IOException;

import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Connessioni.Connetti;
import JavaBean.Esami;
import JavaBean.Persona;
import Sistema.Controllo;

@WebServlet({ "/Servlet1", "/s1" })
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	RequestDispatcher rd;
	ResultSet rs;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String indice = request.getParameter("z");

		switch (indice) {
		case "1":
			String s = request.getParameter("s");
			request.setAttribute("Studente", s);
			request.setAttribute("corso", "Corso Servlet");

			Controllo generico = new Controllo();

			int c = generico.Calcolo(21, 1230);
			request.setAttribute("calcolo", c);

			int matricola = generico.Numeromatricola(15);
			request.setAttribute("matricola", matricola);

			Controllo generica2 = new Controllo();

			rs = generica2.listaMat();
			request.setAttribute("Materia", rs);

			rd = request.getRequestDispatcher("/Pagine/Studente.jsp");
			rd.forward(request, response);

			break;
		case "2":
			String nomeS = request.getParameter("email");
			request.setAttribute("Docente", nomeS);
			
			request.setAttribute("corso", "Corso Servlet");

			rd = request.getRequestDispatcher("/Pagine/Docente.jsp");
			rd.forward(request, response);
			break;
		case "3":
			Controllo generica = new Controllo();
			rs = generica.listaMat();
			request.setAttribute("Materia", rs);

			rd = request.getRequestDispatcher("/Pagine/mostraDocenti.jsp");
			rd.forward(request, response);
			break;
		case "4":
			rd = request.getRequestDispatcher("./Index.jsp");
			rd.forward(request, response);
			break;
		case "5":

			rd = request.getRequestDispatcher("/Pagine/inserisciAlunno.jsp");
			rd.forward(request, response);
			break;
		case "6":

			Controllo controllo = new Controllo();

			rs = controllo.listaAL();
			request.setAttribute("Studenti", rs);

			rd = request.getRequestDispatcher("/Pagine/tuttGliStudenti.jsp");
			rd.forward(request, response);

			break;

		case "7":
			Controllo controllo1 = new Controllo();
			rs = controllo1.listaAL();
			request.setAttribute("listast", rs);

			rd = request.getRequestDispatcher("/Pagine/modificaStd.jsp");
			rd.forward(request, response);

			break;
		case "8":

			Controllo generica3 = new Controllo();
			rs = generica3.listaMat();
			request.setAttribute("Materia", rs);

			rd = request.getRequestDispatcher("/Pagine/PrenotaEsame.jsp");
			rd.forward(request, response);

			break;
		case "9":

			rd = request.getRequestDispatcher("/Pagine/HomeStudente.jsp");
			rd.forward(request, response);

			break;
		case "10":

			Controllo generica4 = new Controllo();
			rs = generica4.listaEs();
			request.setAttribute("Esami", rs);
			
			rd = request.getRequestDispatcher("/Pagine/PrenotazioniEsami.jsp");
			rd.forward(request, response);

			break;


		default:
			break;

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Controllo generico = new Controllo();
		Connetti connetto = new Connetti();
		Persona persona = new Persona();
		Esami esami = new Esami();

		String indice = request.getParameter("z");

		switch (indice) {

		case "1":

			connetto.connettiDB();

			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String dataN = request.getParameter("dataN");
			String citta = request.getParameter("citta");
			String matricola = request.getParameter("matricola");

			persona.setNome(nome);
			persona.setCognome(cognome);
			persona.setDataN(dataN);
			persona.setCitta(citta);
			persona.setMatricola(matricola);

			generico.BeanP(nome, cognome, dataN, citta, matricola);
			generico.insertPersona(persona);

			rd = request.getRequestDispatcher("./Pagine/Docente.jsp");
			rd.forward(request, response);
			break;
		case "2":

			connetto.connettiDB();
			String matricola1 = request.getParameter("matricola");
			String nome1 = request.getParameter("nome");
			String cognome1 = request.getParameter("cognome");
			String dataE = request.getParameter("dataE");
			String esame = request.getParameter("esame");

			esami.setNome(nome1);
			esami.setCognome(cognome1);
			esami.setDataE(dataE);
			esami.setMateria(esame);
			esami.setMatricola(matricola1);

			generico.BeanEsame(nome1, cognome1, dataE, esame, matricola1);
			generico.insertEsame(esami);

			rd = request.getRequestDispatcher("./Pagine/HomeStudente.jsp");
			rd.forward(request, response);
			break;

		case "3":

			String matricol = request.getParameter("matricola");
			persona = generico.ottieniRecord(matricol);
			request.setAttribute("personaC", persona);

			rd = request.getRequestDispatcher("./Pagine/CmodiStu.jsp");
			rd.forward(request, response);

			break;
		case "4":
			String m = request.getParameter("matricola");
			String nm = request.getParameter("nome");
			String c = request.getParameter("cognome");
			String cit = request.getParameter("citta");
			String dat = request.getParameter("dataN");

			persona = generico.BeanP(nm, c, cit, dat, m);
			generico.updatePersona(persona);

			Controllo controllo1 = new Controllo();
			rs = controllo1.listaAL();
			request.setAttribute("listast", rs);

			rd = request.getRequestDispatcher("/Pagine/modificaStd.jsp");
			rd.forward(request, response);

			break;
		}

	}

}
