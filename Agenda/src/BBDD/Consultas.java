package BBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Models.Tarea;

public class Consultas {
	
	public Conexion con = new Conexion();
	public PreparedStatement pstm = null;
	public final int ACTUALIZAR = 1;
	public final int ADD = 2;
	public final int DELETE = 3;
	
	public String sql = "";
	
	
	public int AdDelAct(int i, String tabla, Tarea tarea) {
		try {
			Connection sqlCon = con.getConnection();
			switch(i) {
				case ACTUALIZAR: 
					sql = "UPDATE " + tabla + " SET "  ;
				case ADD: 
					sql = "INSERT INTO " + tabla + "(*)" + " VALUES ("+  tarea.getIDTarea() + "," + tarea.getNombreTar() + "," +
					tarea.getDescripcion() + "," + tarea.getFechInicio() + "," + tarea.getFechFin() + ");";
					System.out.println(sql);
					//pstm = con.prepareStatement(sql);
					pstm = sqlCon.prepareStatement(sql);
					pstm.executeUpdate();
	
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return 1;
	}
}
