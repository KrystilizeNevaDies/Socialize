package socialize.data;

import socialize.tracing.OriginReference;

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
	public static BioData from(String bio, OriginReference origin) {
		return new BioDataImpl(bio, origin);
	}
	
	class BioDataImpl implements BioData {
		String bio;
		
		OriginReference origin;
		
		BioDataImpl(String bio, OriginReference origin) {
			this.bio = bio;
			this.origin = origin;
		}
		
		@Override
		public String getBio() {
			return bio;
		}

		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
