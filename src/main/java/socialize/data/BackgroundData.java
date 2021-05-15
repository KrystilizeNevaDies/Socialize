package socialize.data;

public interface BackgroundData extends OriginData {
	
	/**
	 * Gets the ID of this background
	 * 
	 * @return ID
	 */
	public int getID();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static BackgroundData from(int ID, long origin) {
		return new BackgroundDataImpl(ID, origin);
	}
	
	class BackgroundDataImpl implements BackgroundData {
		int ID;
		
		long origin;
		
		BackgroundDataImpl(int ID, long origin) {
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
