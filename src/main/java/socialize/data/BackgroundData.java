package socialize.data;

import socialize.tracing.OriginReference;

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
	public static BackgroundData from(int ID, OriginReference origin) {
		return new BackgroundDataImpl(ID, origin);
	}
	
	class BackgroundDataImpl implements BackgroundData {
		int ID;
		
		OriginReference origin;
		
		BackgroundDataImpl(int ID, OriginReference origin) {
			this.ID = ID;
			this.origin = origin;
		}
		
		@Override
		public int getID() {
			return ID;
		}

		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
