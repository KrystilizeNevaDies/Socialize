package socialize.data;

import socialize.tracing.OriginReference;

public interface BadgeData extends OriginData {
	
	/**
	 * Gets the ID of this badge
	 * 
	 * @return ID
	 */
	public int getID();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static BadgeData from(int ID, OriginReference origin) {
		return new BadgeDataImpl(ID, origin);
	}
	
	class BadgeDataImpl implements BadgeData {
		int ID;
		
		OriginReference origin;
		
		BadgeDataImpl(int ID, OriginReference origin) {
			this.ID = ID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return ID;
		}

		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
