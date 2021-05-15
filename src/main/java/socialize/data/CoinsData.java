package socialize.data;

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
	public static CoinsData from(double amount, long origin) {
		return new CoinsDataImpl(amount, origin);
	}
	
	class CoinsDataImpl implements CoinsData {
		double amount;
		
		long origin;
		
		CoinsDataImpl(double amount, long origin) {
			this.amount = amount;
			this.origin = origin;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@Override
		public long getOrigin() {
			return origin;
		}
	}
}
