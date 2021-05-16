package socialize.tracing;

import java.util.Date;

/**
 * The Origin object is used to trace transactions in the system.
 * @author Krystilize
 *
 */
public abstract class Origin implements IOrigin {
	protected Date date;
	protected Object parent;
	
	protected <T> Origin(T parent, Date date) {
		this.date = date;
		this.parent = parent;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getOriginNotes() {
		return date.toString();
	};
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getParentID() {
		return (T) parent;
	}
}