

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
/*
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Sto funzionando");

		} catch (Exception e) {

			e.printStackTrace();
		}
*/

		Connection con;
		Statement st;
		ResultSet rt;
		PreparedStatement pst;
	
		String url="jdbc:mysql://localhost:3306/noleggioLibri";
		String user = "root";
		String password="rootroot";
		String query ="SELECT * FROM clienti ";
		String query2 ="SELECT * FROM clienti WHERE cognome = 'alessandria'\"";
		String quesyinst="INSERT INTO clienti VALUES (?,?,?)";
		
		try {
			
			con=DriverManager.getConnection(url,user,password);
			st = con.createStatement();
			rt=st.executeQuery(query);
			
			while (rt.next()) {
				System.out.println(rt.getString("codice")+
				" "+rt.getString("nome")+" "+rt.getString("cognome"));
			}
			
			// metodo di inserimento
			//st.executeUpdate(quesyinst);
			
			//Scanner scanner = new Scanner(System.in);
			//System.out.println("inserisci numero progressivo nome e cognome ");
		
			pst=con.prepareStatement(quesyinst);
			pst.setString(2, "Andrea");
			pst.setString(3, "Persona");
			pst.setInt(1,8);
			//pst.executeUpdate();
			
		
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			
		}
		
		
	}

}
