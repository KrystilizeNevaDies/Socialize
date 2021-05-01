package socialize.data;

import java.util.Date;

public interface CooldownData {
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
	public static CooldownData from(Date lastConsumed) {
		return new CooldownDataImpl(lastConsumed);
	}
	
	class CooldownDataImpl implements CooldownData {
		Date lastConsumed;
		
		CooldownDataImpl(Date lastConsumed) {
			this.lastConsumed = lastConsumed;
		}

		@Override
		public Date getLastConsumed() {
			return lastConsumed;
		}
	}
}
