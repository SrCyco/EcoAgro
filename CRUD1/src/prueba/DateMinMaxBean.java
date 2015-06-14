package prueba;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dateMinMaxBean")
@ViewScoped
public class DateMinMaxBean implements Serializable {

	private Date selectedDate = new Date(System.currentTimeMillis());
	private Date minDate = new Date(System.currentTimeMillis());
	private Date maxDate = new Date(System.currentTimeMillis());
	private Date selectDate = new Date(System.currentTimeMillis());

	public DateMinMaxBean() {
		Calendar calendar = Calendar.getInstance();
        calendar.setTime(minDate);
        calendar.add(Calendar.YEAR, -80);
        minDate = calendar.getTime();
        
        // Set the default maximum date to 5 Years from now
        calendar = Calendar.getInstance();
        calendar.setTime(maxDate);
        calendar.add(Calendar.YEAR, -18);
        maxDate = calendar.getTime();
        
        // Set our selected date to almost 1 Year ago
        // This is done to help show how invalid dates are non-selectable
        calendar = Calendar.getInstance();
        calendar.setTime(selectedDate);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        calendar.add(Calendar.YEAR, 0);
        selectedDate = calendar.getTime();

	}
	
	public Date getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public void submitMinMax(ActionEvent event) {
		if ((minDate != null) && (selectedDate != null)) {
			if (selectedDate.before(minDate)) {
				selectedDate = new Date(minDate.getTime());
			}
		}
		if ((maxDate != null) && (selectedDate != null)) {
			if (selectedDate.after(maxDate)) {
				selectedDate = new Date(maxDate.getTime());
			}
		}
	}

}
