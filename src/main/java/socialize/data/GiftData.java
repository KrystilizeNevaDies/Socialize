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
	public static GiftData from(int giftID, long origin) {
		return new GiftDataImpl(giftID, origin);
	}
	
	class GiftDataImpl implements GiftData {
		int giftID;
		
		long origin;
		
		GiftDataImpl(int giftID, long origin) {
			this.giftID = giftID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return giftID;
		}

		@Override
		public long getOrigin() {
			return origin;
		}
	}
}
