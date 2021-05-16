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
	public static <T> BackgroundData from(int ID, T origin) {
		return new BackgroundDataImpl<T>(ID, origin);
	}
	
	class BackgroundDataImpl<T> implements BackgroundData {
		int ID;
		
		T origin;
		
		BackgroundDataImpl(int ID, T origin) {
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
