package socialize.database.implementations;

import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import socialize.data.OriginData;
import socialize.database.MapDatabase;

public class MapDatabaseImpl<K, V extends OriginData> implements MapDatabase<K, V> {
	Map<K, V> map;
	
	public MapDatabaseImpl(Map<K, V> map) {
		this.map = map;
	}

	@Override
	public EntryData<K, V> get(Predicate<EntryData<K, V>> condition) {
		// TODO: Ensure that the most recent value is retrieved
		return map.entrySet().stream()
			.map(EntryData::fromMapEntry)
			.filter(condition)
			.findAny()
			.orElse(null);
	}

	@Override
	public Map<K, V> getMap() {
		return map;
	}

	@Override
	public void add(EntryData<K, V> data) {
		map.put(data.getKey(), data.getValue());
	}

	@Override
	public Set<EntryData<K, V>> getAll() {
		return map.entrySet().stream()
			.map(EntryData::fromMapEntry)
			.collect(Collectors.toSet());
	}
}
