package socialize.database.implementations;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import socialize.data.OriginData;
import socialize.database.IDatabase;

public class SetDatabaseImpl<T extends OriginData> implements IDatabase<T> {
	Set<T> set;
	
	public SetDatabaseImpl(Set<T> set) {
		this.set = set;
	}
	
	@Override
	public Set<T> getAll() {
		return set;
	}

	@Override
	public T get(Predicate<T> condition) {
		Optional<T> optional = set.stream()
			.filter(condition)
			.findFirst(); // TODO: Test to ensure this order is correct
		return optional.orElse(null);
	}

	@Override
	public void add(T data) {
		set.add(data);
	}
}
