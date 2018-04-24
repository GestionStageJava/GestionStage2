package com.btssio;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnectionDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
		      Class.forName("org.postgresql.Driver");
		      System.out.println("Driver O.K.");

		      String url = "jdbc:postgresql://172.20.96.1:5432/ppe_gestion_stage";
		      String user = "";
		      String passwd = "";

		      Connection conn = DriverManager.getConnection(url, user, passwd);
		      System.out.println("Connexion effective !");
		      System.out.println("Ok");

		    } catch (Exception e) {
		      e.printStackTrace();
		    }      
	}
}
