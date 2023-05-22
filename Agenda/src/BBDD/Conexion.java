package BBDD;
import java.sql.*;

public class Conexion {
	
	public static Connection con = null;
	public static String DRIVER = "";
	public static String URL = "";
	public static String USR = "root";
	public static String PSW = "123456";
	
	public static Connection getConnection() {
		if (con == null) {
			try {
				Runtime.getRuntime().addShutdownHook(new Hilos());
				Class.forName(DRIVER);
				DriverManager.getConnection(URL, USR, PSW);
				return con;
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	
	public static class Hilos extends Thread {
		public void run(){
			try {
			con = Conexion.getConnection();
			con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
