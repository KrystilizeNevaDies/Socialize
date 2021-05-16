package socialize.data;

public interface GiftData extends OriginData {
	
	/**
	 * Gets the gift ID
	 * 
	 * @return ID
	 */
	public int getID();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static <T> GiftData from(int giftID, T origin) {
		return new GiftDataImpl<T>(giftID, origin);
	}
	
	class GiftDataImpl<T> implements GiftData {
		int giftID;
		
		T origin;
		
		GiftDataImpl(int giftID, T origin) {
			this.giftID = giftID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return giftID;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return origin;
		}
	}
}
