package socialize.data;

import socialize.tracing.Origin;

public interface ShellsData extends CurrencyTransactionData {
	
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
	public static ShellsData from(double amount, Origin origin) {
		return new ShellsDataImpl(amount, origin);
	}
	
	class ShellsDataImpl implements ShellsData {
		double amount;
		
		Origin origin;
		
		ShellsDataImpl(double amount, Origin origin) {
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
