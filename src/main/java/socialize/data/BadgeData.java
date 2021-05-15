package socialize.data;

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
	public static BadgeData from(int ID, long origin) {
		return new BadgeDataImpl(ID, origin);
	}
	
	class BadgeDataImpl implements BadgeData {
		int ID;
		
		long origin;
		
		BadgeDataImpl(int ID, long origin) {
			this.ID = ID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return ID;
		}

		@Override
		public long getOrigin() {
			return origin;
		}
	}
}
