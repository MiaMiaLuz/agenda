package Models;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Tarea {
	
	private double IDTarea; //gestionar para que se autoincremente
	private String NombreTar;
	private Date FechInicio; //gestionar para que se establezca automaticamente a la fecha de hoy
	private Date FechFin;
	private String Descripcion;

	
	/**Getters y setters*/
	public String getNombreTar() {
		return NombreTar;
	}
	public void setNombreTar(String nombreTar) {
		NombreTar = nombreTar;
	}
	//no tiene setter porque se hace de forma automatica al generar la tarea
	public Date getFechInicio() {
		return FechInicio;
	}
	public Date getFechFin() {
		return FechFin;
	}
	public void setFechFin(Date fechFin) {
		FechFin = fechFin;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getIDTarea() {
		return IDTarea;
	}
	public void setIDTarea(double iDTarea) {
		IDTarea = iDTarea;
	}
	
	public Tarea(String NombreTar, Date FechFin/*, Double IDTarea*/){
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.HOUR_OF_DAY, 0);
		//this.IDTarea;
		this.NombreTar = NombreTar;
		this.FechInicio = new Date(System.currentTimeMillis());
		this.FechFin = FechFin;
	}
	Tarea(String NombreTar, Date FechFin, String Descripcion /*, Double IDTarea*/){
		Calendar fecha = Calendar.getInstance();
		fecha.set(Calendar.HOUR_OF_DAY, 0);
		//this.IDTarea = IDTarea;
		this.NombreTar = NombreTar;
		this.FechInicio = new Date(System.currentTimeMillis());
		this.FechFin = FechFin;
		this.Descripcion = Descripcion;
	}
}
