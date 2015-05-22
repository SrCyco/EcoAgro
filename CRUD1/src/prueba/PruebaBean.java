package prueba;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="pruebaBean")
@ViewScoped

public class PruebaBean implements Serializable{
	
	private String prueba;
	private Calendar calendar;
	private String fecha;
	private Date date;
	private Date maxDate;
	private StringTokenizer tokenizer;
	private ArrayList <String> listTokens;
//	private 
	public PruebaBean() {
		date = new Date(System.currentTimeMillis());
		maxDate = new Date(System.currentTimeMillis());
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -18);
        date = calendar.getTime();
//        tokenizer = new StringTokenizer(""+calendar.getTime());
//        while (tokenizer.hasMoreTokens()) {
//        	listTokens = new ArrayList<String>();
//			System.out.println(tokenizer.nextToken());
//		}
//        
////        if (listTokens.get(6).compareTo(arg0)) {
////			
////		}
//        
//        calendar = Calendar.getInstance();
//        calendar.setTime(maxDate);
//        calendar.add(Calendar.YEAR, 5);
//        maxDate = calendar.getTime();
	}
	
	public void mostrar(){
		prueba = "Hola Mundo Gonorreas!!";
		System.out.println(prueba);	
		System.out.println(calendar.get(3));	
//		System.out.println(calendar.get(2));
	}
	
	public Date fecha(){
		
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -1);
        date = calendar.getTime();
        System.out.println(Calendar.YEAR);
        
        
//		calendar = Calendar.getInstance();
//		String dia = Integer.toString(calendar.get(Calendar.DATE));
//		String mes = Integer.toString(calendar.get(Calendar.MONTH));
//		String año = Integer.toString(calendar.get(Calendar.YEAR));
//		fecha=dia+"/"+mes+"/"+año;
		return date;
	}

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
