package socialize.data;

import socialize.tracing.Origin;

public interface BioData extends OriginData {
	
	/**
	 * Gets the bio string
	 * 
	 * @return String
	 */
	public String getBio();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static BioData from(String bio, Origin origin) {
		return new BioDataImpl(bio, origin);
	}
	
	class BioDataImpl implements BioData {
		String bio;
		
		Origin origin;
		
		BioDataImpl(String bio, Origin origin) {
			this.bio = bio;
			this.origin = origin;
		}
		
		@Override
		public String getBio() {
			return bio;
		}

		@Override
		public Origin getOrigin() {
			return origin;
		}
	}
}
