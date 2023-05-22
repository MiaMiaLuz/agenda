package Models;

public class User implements Comparable <String>{ //añador setters para cambiar contraseña mas adelante
	
	private String NombreUser;
	private String Contrasenna;
	private String TablaAsociada;
	
	public String getNombreUser() {
		return NombreUser;
	}
	public String getContrasenna() {
		return Contrasenna;
	}
	public String getBBDD() {
		return TablaAsociada;
	}
	
	User(String NombreUser, String Contrasenna){
		
		this.NombreUser = NombreUser;
		this.Contrasenna = Contrasenna;
		this.TablaAsociada = NombreUser;
		
	}
	
	//para comprobar si un usuario ya existe
	public int compareTo(String NombreUser){
		return this.NombreUser.compareTo(NombreUser);
	}
}
