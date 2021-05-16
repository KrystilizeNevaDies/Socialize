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
	public static <T> BadgeData from(int ID, T origin) {
		return new BadgeDataImpl<T>(ID, origin);
	}
	
	class BadgeDataImpl<T> implements BadgeData {
		int ID;
		
		T origin;
		
		BadgeDataImpl(int ID, T origin) {
			this.ID = ID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return ID;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return origin;
		}
	}
}
