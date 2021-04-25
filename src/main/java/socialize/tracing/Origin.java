package socialize.tracing;

import java.util.Date;

/**
 * The Origin object is used to trace transactions in the system.
 * @author Krystilize
 *
 */
public abstract class Origin implements IOrigin {
	
	public static final Origin ROOT = new RootOrigin();
	
	protected Date date;
	protected Origin parent;
	
	protected Origin(Origin parent, Date date) {
		this.date = date;
		this.parent = parent;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getOriginNotes() {
		return date.toString();
	};
	
	@Override
	public Origin getParent() {
		return parent;
	}
	
	static class RootOrigin extends Origin {
		protected RootOrigin() {
			super(null, new Date());
		}

		@Override
		public OriginType getType() {
			return OriginType.ROOT;
		}
		
		@Override
		public Origin getParent() {
			return this;
		}
	}
}