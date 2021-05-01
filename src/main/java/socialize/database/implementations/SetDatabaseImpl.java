package socialize.database.implementations;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import socialize.data.OriginData;
import socialize.database.SetDatabase;

public class SetDatabaseImpl<T extends OriginData> implements SetDatabase<T> {
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
			.sorted((dataA, dataB) -> (int) (dataA.getOrigin().getDate().getTime() - dataB.getOrigin().getDate().getTime())) // TODO: Test to ensure this sort is correct
			.findFirst();
		return optional.orElse(null);
	}

	@Override
	public void add(T data) {
		set.add(data);
	}

	@Override
	public Set<T> getSet() {
		return set;
	}
}
