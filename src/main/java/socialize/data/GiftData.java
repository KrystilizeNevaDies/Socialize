package socialize.data;

import socialize.tracing.Origin;

public interface GiftData {
	
	/**
	 * Gets the gift ID
	 * 
	 * @return ID
	 */
	public int getID();
	
	/**
	 * Gets the gift origin
	 * 
	 * @return Origin
	 */
	public Origin getOrigin();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static GiftData from(int giftID, Origin origin) {
		return new GiftDataImpl(giftID, origin);
	}
	
	class GiftDataImpl implements GiftData {
		int giftID;
		
		Origin origin;
		
		GiftDataImpl(int giftID, Origin origin) {
			this.giftID = giftID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return giftID;
		}

		@Override
		public Origin getOrigin() {
			return origin;
		}
	}
}
