package socialize.database.implementations;

import java.util.Set;
import java.util.stream.Collectors;

import socialize.data.CurrencyTransactionData;
import socialize.database.CurrencyDatabase;

public class CurrencyDatabaseImpl<T extends CurrencyTransactionData> extends SetDatabaseImpl<T>
		implements CurrencyDatabase<T> {
	public CurrencyDatabaseImpl(Set<T> set) {
		super(set);
	}

	@Override
	public double getTotal() {
		return set.stream().collect(Collectors.summarizingDouble(T::getAmount)).getSum();
	}

}
