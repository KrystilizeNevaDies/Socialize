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
	public static <T> BioData from(String bio, T origin) {
		return new BioDataImpl<T>(bio, origin);
	}
	
	class BioDataImpl<T> implements BioData {
		String bio;
		
		T origin;
		
		BioDataImpl(String bio, T origin) {
			this.bio = bio;
			this.origin = origin;
		}
		
		@Override
		public String getBio() {
			return bio;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return origin;
		}
	}
}
