package socialize.database.implementations;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

import socialize.database.MapDatabase;

public class MapDatabaseImpl<K, V> implements MapDatabase<K, V> {
	Map<K, V> map;
	
	public MapDatabaseImpl(Map<K, V> map) {
		this.map = map;
	}

	@Override
	public Entry<K, V> get(Predicate<Entry<K, V>> condition) {
		return map.entrySet().stream()
			.filter(condition)
			.findAny()
			.orElse(null);
	}

	@Override
	public void add(Entry<K, V> data) {
		map.put(data.getKey(), data.getValue());
	}

	@Override
	public Map<K, V> getMap() {
		return map;
	}

	@Override
	public Set<Entry<K, V>> getAll() {
		return map.entrySet();
	}
}
