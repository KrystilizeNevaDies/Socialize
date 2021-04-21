package socialize.database;

import socialize.data.CurrencyTransactionData;

/**
 * This is an interface used to represent a connection for a currency between an external database and the server.
 * 
 * @author Krystilize
 *
 * @param <T>
 */
public interface CurrencyDatabase<T extends CurrencyTransactionData> extends SetDatabase<T> {
	/**
	 * Gets the total value of this currency
	 * 
	 * @return total
	 */
	public double getTotal();
}