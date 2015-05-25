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
	private String contrase�a1;
	private String contrase�a2;

	public Usuario() {
		this.apellido = "";
		this.contrase�a1 = "";
		this.contrase�a2 = "";
		this.correo = "";
		this.fecha = "";
		this.identificacion = "";
		this.nickname = "";
		this.nombre = "";
		this.telefono = "";
	}

	public Usuario(String nombre, String apellido, String fecha, String identificacion, String telefono, String correo, String nickname, String contrase�a1, String contrase�a2){
		this.apellido =apellido;
		this.contrase�a1 = contrase�a1;
		this.contrase�a2 = contrase�a2;
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

	public String getContrase�a1() {
		return contrase�a1;
	}

	public void setContrase�a1(String contrase�a1) {
		this.contrase�a1 = contrase�a1;
	}

	public String getContrase�a2() {
		return contrase�a2;
	}

	public void setContrase�a2(String contrase�a2) {
		this.contrase�a2 = contrase�a2;
	}

}
