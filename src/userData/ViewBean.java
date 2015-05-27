package userData;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ViewBean implements Serializable {

	private String dateSelected;
	private Date datein = new Date();

	public Date getDatein() {
	    return datein;
	}

	public String getDateSelected() {
		return dateSelected;
	}

	public void setDateSelected(String dateSelected) {
		this.dateSelected = dateSelected;
	}
}
