package socialize.data;

import java.util.Date;

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
	public static <T> CooldownData from(Date lastConsumed, T origin) {
		return new CooldownDataImpl<T>(lastConsumed, origin);
	}
	
	class CooldownDataImpl<T> implements CooldownData {
		Date lastConsumed;
		
		T origin;
		CooldownDataImpl(Date lastConsumed, T origin) {
			this.lastConsumed = lastConsumed;
		}

		@Override
		public Date getLastConsumed() {
			return lastConsumed;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return origin;
		}
	}
}
