package socialize.database.implementations;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import socialize.database.SetDatabase;

public class FakeSetDatabase<T> implements SetDatabase<T> {
	Set<T> set;
	
	public FakeSetDatabase(Set<T> set) {
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
			.findAny();
		return optional.orElse(null);
	}

}
