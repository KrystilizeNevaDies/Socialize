package socialize.database.implementations;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import socialize.data.CurrencyTransactionData;
import socialize.database.CurrencyDatabase;

public class CurrencyDatabaseImpl<T extends CurrencyTransactionData> implements CurrencyDatabase<T> {
	double total;
	Set<T> set;
	
	public CurrencyDatabaseImpl(Set<T> set) {
		this.set = set;
		this.total = set.stream()
		.collect(
			Collectors.summarizingDouble(T::getAmount)
		)
		.getSum();
	}
	
	@Override
	public Set<T> getAll() {
		return set;
	}

	@Override
	public T get(Predicate<T> condition) {
		Optional<T> optional = set.stream()
			.filter(condition)
			.findAny();
		return optional.orElse(null);
	}

	@Override
	public double getTotal() {
		return total;
	}

}
