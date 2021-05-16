package socialize.data;

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
	public static <T> ShellsData from(double amount, T origin) {
		return new ShellsDataImpl<T>(amount, origin);
	}
	
	class ShellsDataImpl<T> implements ShellsData {
		double amount;
		
		T originID;
		
		ShellsDataImpl(double amount, T originID) {
			this.amount = amount;
			this.originID = originID;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return originID;
		}
	}
}
