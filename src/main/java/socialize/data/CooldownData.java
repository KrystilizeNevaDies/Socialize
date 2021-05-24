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
	public static  CooldownData from(Date lastConsumed, UUID origin) {
		return new CooldownDataImpl(lastConsumed, origin);
	}
	
	class CooldownDataImpl implements CooldownData {
		Date lastConsumed;
		
		UUID origin;
		CooldownDataImpl(Date lastConsumed, UUID origin) {
			this.lastConsumed = lastConsumed;
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
