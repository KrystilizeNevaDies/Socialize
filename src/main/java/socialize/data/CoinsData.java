package socialize.data;

import java.util.UUID;

public interface CoinsData extends CurrencyTransactionData {
	
	/**
	 * Gets the amount of coins in this transaction
	 * 
	 * @return amount
	 */
	public double getAmount();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static  CoinsData from(double amount, UUID origin) {
		return new CoinsDataImpl(amount, origin);
	}
	
	class CoinsDataImpl implements CoinsData {
		double amount;
		
		UUID origin;
		
		CoinsDataImpl(double amount, UUID origin) {
			this.amount = amount;
			this.origin = origin;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
