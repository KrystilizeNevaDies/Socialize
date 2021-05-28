package socialize.data;

import java.util.Date;
import java.util.UUID;

public interface CooldownData extends OriginData {
	/**
	 * Gets the exact time this cooldown was last consumed.
	 *
	 * @return
	 */
	public Date getLastConsumed();

	/**
	 * Creates an immutable version of this data
	 *
	 * @return data
	 */
	public static CooldownData from(Date lastConsumed, UUID origin) {
		return new CooldownDataImpl(lastConsumed, origin);
	}

	class CooldownDataImpl implements CooldownData {
		final Date lastConsumed;
		final UUID origin;

		CooldownDataImpl(Date lastConsumed, UUID origin) {
			this.lastConsumed = lastConsumed;
			this.origin = origin;
		}

		@Override
		public Date getLastConsumed() {
			return lastConsumed;
		}

		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
