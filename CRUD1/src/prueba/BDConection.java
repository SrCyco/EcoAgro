package prueba;

import java.awt.List;
import java.io.Serializable;
import java.io.ObjectInputStream.GetField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.swing.DefaultListModel;

import org.icefaces.ace.event.SelectEvent;
import org.icefaces.ace.event.UnselectEvent;

@ManagedBean(name = "bdconection")
@ViewScoped
public class BDConection implements Serializable {

	private static final int EVENT_SIZE = 5;
	private Connection conexion;
	private ArrayList<Usuario> lista;
	private List evento;
	private Date selectDate = new Date(System.currentTimeMillis());

	/**
	 * Este es el contructor de la clase crea una conexion llamando al driver de
	 * coneccion JDBC
	 * 
	 * @param usuario
	 * @param pw
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public BDConection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conexion = DriverManager.getConnection(
					"jdbc:mysql://localhost/crud", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		todasLasTuplas();

	}

	public void ejecutar(String nombre, String apellido, String fecha,
			String identificacion, String telefono, String correo,
			String nickname, String contraseña, String contraseña2) {
		String sql = "INSERT INTO usuarios values ('" + nombre + "','"
				+ apellido + "','" + fecha + "','" + identificacion + "','"
				+ telefono + "','" + correo + "','" + nickname + "','"
				+ contraseña + "','" + contraseña2 + "');";
		try {
			Statement sentencia = getConexion().createStatement();
			sentencia.executeUpdate(sql);
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();

		}
	}

	public void todasLasTuplas() {
		lista = new ArrayList<Usuario>();

		String sql = "select * from usuarios";
		Statement comando;
		try {
			comando = conexion.createStatement();
			ResultSet registro;
			registro = comando.executeQuery(sql);

			while (registro.next()) {
				Usuario u = new Usuario(registro.getString(1),
						registro.getString(2), registro.getString(3),
						registro.getString(4), registro.getString(5),
						registro.getString(6), registro.getString(7),
						registro.getString(8), registro.getString(9));
				lista.add(u);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void actualizar(String nombre, String apellido, String fecha,
			String identificacion, String telefono, String correo,
			String contraseña, String nikcname) {
		String sql = "UPDATE usuarios set NOMBRE='" + nombre
				+ "', APELLIDO = '" + apellido + "', FECHA = '" + fecha
				+ "', IDENTIFICACION = '" + identificacion + "', TELEFONO = '"
				+ telefono + "', CORREO = '" + correo + "', CONTRASENA = '"
				+ contraseña + "' where NICKNAME ='" + nikcname + "';";
		Statement sentencia;
		try {
			sentencia = getConexion().createStatement();
			sentencia.executeUpdate(sql);
			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void eliminar(String nickname) {
		String sql ="DELETE from usuarios where NICKNAME ='"+nickname+"';";
		Statement sentencia;
		try {
			sentencia = getConexion().createStatement();
			sentencia.executeUpdate(sql);
			sentencia.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// public Usuario unaTupla(String nickname) {
	// try {
	// String sql = "select * from usuarios where nickname = '" + nickname
	// + "'";
	// Statement comando;
	// comando = conexion.createStatement();
	//
	// ResultSet registro = comando.executeQuery(sql);
	// Usuario u = new Usuario(registro.getString(1), registro.getString(2),
	// registro.getString(3), registro.getString(4),
	// registro.getString(5), registro.getString(6),
	// registro.getString(7), registro.getString(8),
	// registro.getString(9));
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return u;
	// }

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}

	public ArrayList<Usuario> getLista() {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNombre() + ","
					+ lista.get(i).getApellido() + ","
					+ lista.get(i).getFecha() + ","
					+ lista.get(i).getIdentificacion() + ","
					+ lista.get(i).getTelefono() + ","
					+ lista.get(i).getCorreo() + ","
					+ lista.get(i).getNickname() + ","
					+ lista.get(i).getContraseña1());

		}
		return lista;
	}

}
