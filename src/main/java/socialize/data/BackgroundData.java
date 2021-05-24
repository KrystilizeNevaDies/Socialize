package socialize.data;

import java.util.UUID;

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
	public static BackgroundData from(int ID, UUID origin) {
		return new BackgroundDataImpl(ID, origin);
	}
	
	class BackgroundDataImpl implements BackgroundData {
		int ID;
		
		UUID origin;
		
		BackgroundDataImpl(int ID, UUID origin) {
			this.ID = ID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return ID;
		}

		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
