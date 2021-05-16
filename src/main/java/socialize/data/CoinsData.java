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
	public static <T> CoinsData from(double amount, T origin) {
		return new CoinsDataImpl<>(amount, origin);
	}
	
	class CoinsDataImpl<T> implements CoinsData {
		double amount;
		
		T origin;
		
		CoinsDataImpl(double amount, T origin) {
			this.amount = amount;
			this.origin = origin;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return origin;
		}
	}
}
