package socialize.tracing;

import java.util.Date;

/**
 * The Origin object is used to trace transactions in the system.
 * @author Krystilize
 *
 */
public abstract class Origin implements IOrigin {
	protected Date date;
	
	public Date getDate() {
		return date;
	}
	
	protected Origin(Date date) {
		this.date = date;
	}
	
	public String getOriginNotes() {
		return date.toString();
	};
}