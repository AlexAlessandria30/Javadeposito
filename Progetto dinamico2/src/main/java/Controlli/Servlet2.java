package Controlli;

import java.io.IOException;

import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Connessioni.Connetti;
import JavaBean.Password;

import Sistema.Controllo;

@WebServlet({ "/Servlet2", "/s2" })
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet2() {
		super();

	}

	RequestDispatcher rd;
	ResultSet rs;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sessione = request.getSession();
		String utsessione = (String) sessione.getAttribute("utente");

		String indice = request.getParameter("z");

		switch (indice) {
		case "1":

			if (utsessione == null) {
				request.getServletContext().getRequestDispatcher("/Pagine/login.jsp").forward(request, response);
			} else {

				rd = request.getRequestDispatcher("/Pagine/login.jsp");
				rd.forward(request, response);
			}

			break;

		case "2":
			rd = request.getRequestDispatcher("/Pagine/Register.jsp");
			rd.forward(request, response);
			break;
		case "3":
			if (utsessione == null) {
				request.getServletContext().getRequestDispatcher("/Pagine/LoginStu.jsp").forward(request, response);
			} else {

				rd = request.getRequestDispatcher("/Pagine/LoginStu.jsp");
				rd.forward(request, response);
			}
			break;

		default:
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sessione = request.getSession();
		String utsessione = (String) sessione.getAttribute("utente");

		Controllo controllo = new Controllo();
		String indice = request.getParameter("z");

		switch (indice) {

		case "1":

			String nomeS = request.getParameter("email");
			request.setAttribute("Docente", nomeS);

		
				
				String mail = request.getParameter("email");
				String pass = request.getParameter("password");

				boolean trov = controllo.verificaLogin(mail, pass);

				if (trov == true) {
					rd = request.getRequestDispatcher("./Pagine/Docente.jsp");
					rd.forward(request, response);
				} else {
					request.setAttribute("errore", "Password o Mail errati riprova!!");
					rd = request.getRequestDispatcher("/Pagine/login.jsp");
					rd.forward(request, response);
				}
			
			break;

		case "2":

			String nome = request.getParameter("nome");
			String cognome = request.getParameter("cognome");
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			if (nome != "" & cognome != "" & email != "" & password != "") {

				Connetti connetto = new Connetti();
				connetto.connettiDB();

				Password persona = new Password();
				persona.setNome(nome);
				persona.setCognome(cognome);
				persona.setEmail(email);
				persona.setPassword(password);

				Controllo generico = new Controllo();
				generico.BeanPass(nome, cognome, email, password);
				generico.insertPassword(persona);

				nomeS = request.getParameter("email");
				request.setAttribute("Docente", nomeS);

				rd = request.getRequestDispatcher("./Pagine/Docente.jsp");
				rd.forward(request, response);
			} else {
				request.setAttribute("errore", "Inserisci tutti i campi per proseguire");
				rd = request.getRequestDispatcher("/Pagine/Register.jsp");
				rd.forward(request, response);
			}

			break;

		case "3":
			String ute = request.getParameter("utente");
			request.setAttribute("Docente", ute);

		
				
				String utente = request.getParameter("utente");
				String pass1 = request.getParameter("password");
				boolean trov1 = controllo.verificaStudente1(utente, pass1);

				if (trov1 == true) {
					rd = request.getRequestDispatcher("./Pagine/HomeStudente.jsp");
					rd.forward(request, response);
				} else {
					request.setAttribute("errore", "Password o Mail errati riprova!!");
					rd = request.getRequestDispatcher("/Pagine/LoginStu.jsp");
					rd.forward(request, response);
				}
			
			break;

		default:
			break;
		}

	}
}
