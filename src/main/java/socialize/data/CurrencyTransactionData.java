package socialize.data;

public interface CurrencyTransactionData extends OriginData {

	/**
	 * Gets the currency amount in this transaction
	 *
	 * @return amount
	 */
	public double getAmount();
}
