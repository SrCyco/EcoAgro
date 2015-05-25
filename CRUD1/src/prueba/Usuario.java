package prueba;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "usuario")
@ViewScoped

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1940966339053470935L;
	private String nombre;
	private String apellido;
	private String fecha;
	private String identificacion;
	private String telefono;
	private String correo;
	private String nickname;
	private String contraseña1;
	private String contraseña2;

	public Usuario() {
		this.apellido = "";
		this.contraseña1 = "";
		this.contraseña2 = "";
		this.correo = "";
		this.fecha = "";
		this.identificacion = "";
		this.nickname = "";
		this.nombre = "";
		this.telefono = "";
	}

	public Usuario(String nombre, String apellido, String fecha, String identificacion, String telefono, String correo, String nickname, String contraseña1, String contraseña2){
		this.apellido =apellido;
		this.contraseña1 = contraseña1;
		this.contraseña2 = contraseña2;
		this.correo = correo;
		this.fecha = fecha;
		this.identificacion= identificacion;
		this.nickname = nickname;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getContraseña1() {
		return contraseña1;
	}

	public void setContraseña1(String contraseña1) {
		this.contraseña1 = contraseña1;
	}

	public String getContraseña2() {
		return contraseña2;
	}

	public void setContraseña2(String contraseña2) {
		this.contraseña2 = contraseña2;
	}

}
