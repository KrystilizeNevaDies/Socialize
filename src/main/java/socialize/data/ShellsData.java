package socialize.data;

import java.util.UUID;

public interface ShellsData extends CurrencyTransactionData {
	
	/**
	 * Gets the amount of shells in this transaction
	 * 
	 * @return amount
	 */
	public double getAmount();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static  ShellsData from(double amount, UUID origin) {
		return new ShellsDataImpl(amount, origin);
	}
	
	class ShellsDataImpl implements ShellsData {
		double amount;
		
		UUID originID;
		
		ShellsDataImpl(double amount, UUID originID) {
			this.amount = amount;
			this.originID = originID;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@Override
		public UUID getOrigin() {
			return originID;
		}
	}
}
