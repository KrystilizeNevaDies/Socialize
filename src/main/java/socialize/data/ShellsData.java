package socialize.data;

import socialize.tracing.OriginReference;

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
	public static  ShellsData from(double amount, OriginReference origin) {
		return new ShellsDataImpl(amount, origin);
	}
	
	class ShellsDataImpl implements ShellsData {
		double amount;
		
		OriginReference originID;
		
		ShellsDataImpl(double amount, OriginReference originID) {
			this.amount = amount;
			this.originID = originID;
		}
		
		@Override
		public double getAmount() {
			return amount;
		}

		@Override
		public OriginReference getOriginReference() {
			return originID;
		}
	}
}
