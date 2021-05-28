package socialize.data;

import java.util.UUID;

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
	public static BioData from(String bio, UUID origin) {
		return new BioDataImpl(bio, origin);
	}

	class BioDataImpl implements BioData {
		final String bio;

		final UUID origin;

		BioDataImpl(String bio, UUID origin) {
			this.bio = bio;
			this.origin = origin;
		}

		@Override
		public String getBio() {
			return bio;
		}

		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
