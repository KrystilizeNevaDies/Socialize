package socialize.data;

import java.util.UUID;

public interface BadgeData extends OriginData {

	/**
	 * Gets the ID of this badge
	 *
	 * @return ID
	 */
	public int getID();

	/**
	 * Creates an immutable version of this data
	 *
	 * @return data
	 */
	public static BadgeData from(int ID, UUID origin) {
		return new BadgeDataImpl(ID, origin);
	}

	class BadgeDataImpl implements BadgeData {
		final int ID;

		final UUID origin;

		BadgeDataImpl(int ID, UUID origin) {
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
