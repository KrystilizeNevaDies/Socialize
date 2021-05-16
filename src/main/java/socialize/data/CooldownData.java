package socialize.data;

import java.util.Date;

import socialize.tracing.OriginReference;

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
	public static  CooldownData from(Date lastConsumed, OriginReference origin) {
		return new CooldownDataImpl(lastConsumed, origin);
	}
	
	class CooldownDataImpl implements CooldownData {
		Date lastConsumed;
		
		OriginReference origin;
		CooldownDataImpl(Date lastConsumed, OriginReference origin) {
			this.lastConsumed = lastConsumed;
		}

		@Override
		public Date getLastConsumed() {
			return lastConsumed;
		}

		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
