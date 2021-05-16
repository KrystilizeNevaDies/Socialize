package socialize.data;

import socialize.tracing.OriginReference;

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
	public static  GiftData from(int giftID, OriginReference origin) {
		return new GiftDataImpl(giftID, origin);
	}
	
	class GiftDataImpl implements GiftData {
		int giftID;
		
		OriginReference origin;
		
		GiftDataImpl(int giftID, OriginReference origin) {
			this.giftID = giftID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return giftID;
		}

		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
