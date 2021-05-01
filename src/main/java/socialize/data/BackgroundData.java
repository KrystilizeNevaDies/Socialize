package socialize.data;

import socialize.tracing.Origin;

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
	public static BackgroundData from(int ID, Origin origin) {
		return new BackgroundDataImpl(ID, origin);
	}
	
	class BackgroundDataImpl implements BackgroundData {
		int ID;
		
		Origin origin;
		
		BackgroundDataImpl(int ID, Origin origin) {
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
