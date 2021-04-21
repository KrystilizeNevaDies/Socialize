package socialize.database.implementations;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import socialize.database.SelectedSetDatabase;

public class SelectedSetDatabaseImpl<T> implements SelectedSetDatabase<T> {
	Set<T> set;
	T selected;
	
	public SelectedSetDatabaseImpl(Set<T> set, T selected) {
		assert(set.contains(selected));
		
		this.set = set;
		this.selected = selected;
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
	public T getSelected() {
		return selected;
	}

}
