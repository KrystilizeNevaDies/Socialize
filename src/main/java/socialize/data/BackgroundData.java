package socialize.data;

import java.util.UUID;

public interface BackgroundData extends OriginData {

	/**
	 * Gets the ID of this background
	 *
	 * @return ID
	 */
	public String getID();

	/**
	 * Creates an immutable version of this data
	 *
	 * @return data
	 */
	public static BackgroundData from(String ID, UUID origin) {
		return new BackgroundDataImpl(ID, origin);
	}

	class BackgroundDataImpl implements BackgroundData {
		final String ID;
		final UUID origin;

		BackgroundDataImpl(String ID, UUID origin) {
			this.ID = ID;
			this.origin = origin;
		}

		@Override
		public String getID() {
			return ID;
		}

		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
