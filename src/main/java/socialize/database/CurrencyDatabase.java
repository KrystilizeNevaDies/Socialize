package socialize.database;

import socialize.data.CurrencyTransactionData;

/**
 * This is datbase type is used to represent a connection for a currency between
 * an external database and the server.
 *
 * @author Krystilize
 *
 * @param
 */
public interface CurrencyDatabase<T extends CurrencyTransactionData> extends IDatabase<T> {
	/**
	 * Gets the total value of this currency
	 *
	 * @return total
	 */
	public double getTotal();
}
