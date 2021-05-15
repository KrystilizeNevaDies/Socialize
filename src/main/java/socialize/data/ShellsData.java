package socialize.data;

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
	public long getOrigin();
	
	/**
	 * Creates an immutable version of this data
	 * 
	 * @return data
	 */
	public static ShellsData from(double amount, long origin) {
		return new ShellsDataImpl(amount, origin);
	}
	
	class ShellsDataImpl implements ShellsData {
		double amount;
		
		long origin;
		
		ShellsDataImpl(double amount, long origin) {
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
