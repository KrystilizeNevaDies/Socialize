package socialize.data;

import java.util.UUID;

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
	public static  GiftData from(int giftID, UUID origin) {
		return new GiftDataImpl(giftID, origin);
	}
	
	class GiftDataImpl implements GiftData {
		int giftID;
		
		UUID origin;
		
		GiftDataImpl(int giftID, UUID origin) {
			this.giftID = giftID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return giftID;
		}

		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
