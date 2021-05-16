package socialize.data;

import socialize.tracing.OriginReference;

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
	public static  CoinsData from(double amount, OriginReference origin) {
		return new CoinsDataImpl(amount, origin);
	}
	
	class CoinsDataImpl implements CoinsData {
		double amount;
		
		OriginReference origin;
		
		CoinsDataImpl(double amount, OriginReference origin) {
			this.amount = amount;
			this.origin = origin;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
