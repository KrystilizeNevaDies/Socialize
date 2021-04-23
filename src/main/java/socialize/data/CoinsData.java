package socialize.data;

import socialize.tracing.Origin;

public interface CoinsData extends CurrencyTransactionData {
	
	/**
	 * Gets the amount of shells in this transaction
	 * 
	 * @return amount
	 */
	public double getAmount();
	
	/**
	 * Gets the transaction origin
	 * 
	 * @return Origin
	 */
	public Origin getOrigin();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static CoinsData from(double amount, Origin origin) {
		return new CoinsDataImpl(amount, origin);
	}
	
	class CoinsDataImpl implements CoinsData {
		double amount;
		
		Origin origin;
		
		CoinsDataImpl(double amount, Origin origin) {
			this.amount = amount;
			this.origin = origin;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@Override
		public Origin getOrigin() {
			return origin;
		}
	}
}
