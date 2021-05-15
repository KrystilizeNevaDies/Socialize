package socialize.data;

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
	public static BioData from(String bio, long origin) {
		return new BioDataImpl(bio, origin);
	}
	
	class BioDataImpl implements BioData {
		String bio;
		
		long origin;
		
		BioDataImpl(String bio, long origin) {
			this.bio = bio;
			this.origin = origin;
		}
		
		@Override
		public String getBio() {
			return bio;
		}

		@Override
		public long getOrigin() {
			return origin;
		}
	}
}
