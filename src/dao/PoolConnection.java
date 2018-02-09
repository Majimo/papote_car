package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PoolConnection {
	
	static Connection cnx = null;
	
	public static Connection getConnection() {
		try{
			if(cnx ==null || cnx.isClosed()){
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			String url= "jdbc:sqlserver://localhost:1433;databasename="
					+ "PAPOTE_CAR;user=sa;password=Pa$$w0rd";
			
			cnx = DriverManager.getConnection(url);
			return cnx;
			}
			else{
				return cnx;
			}
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public static void closeConnection(){
		if (cnx !=null){
			try {
				cnx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}

