package socialize.data;

import socialize.tracing.Origin;

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
	public static BadgeData from(int ID, Origin origin) {
		return new BadgeDataImpl(ID, origin);
	}
	
	class BadgeDataImpl implements BadgeData {
		int ID;
		
		Origin origin;
		
		BadgeDataImpl(int ID, Origin origin) {
			this.ID = ID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return ID;
		}

		@Override
		public Origin getOrigin() {
			return origin;
		}
	}
}
