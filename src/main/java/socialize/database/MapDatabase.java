package socialize.database;

import java.util.Map;
import java.util.UUID;

import socialize.data.OriginData;
import socialize.database.MapDatabase.EntryData;

/**
 * This database type is used to represent a connection between an external
 * database and the server. <br>
 * <br>
 * This database type assumes that all objects are unordered and do not have a
 * key
 *
 *
 * @author Krystilize
 *
 * @param
 */
public interface MapDatabase<K, V extends OriginData> extends IDatabase<EntryData<K, V>> {
	/**
	 * Gets the map that is represented by this database
	 *
	 * @return map
	 */
	public Map<K, V> getMap();

	public interface EntryData<K, V extends OriginData> extends OriginData {
		public K getKey();

		public V getValue();

		@Override
		public default UUID getOrigin() {
			return getValue().getOrigin();
		}

		/**
		 * Generates an immutable EntryData from a specified map entry
		 *
		 * @param <K>
		 * @param <V>
		 * @param entry
		 * @return map.entry
		 */
		public static <K, V extends OriginData> EntryData<K, V> fromMapEntry(Map.Entry<K, V> entry) {
			return new EntryDataImpl<>(entry);
		}

		class EntryDataImpl<K, V extends OriginData> implements EntryData<K, V> {
			Map.Entry<K, V> entry;

			public EntryDataImpl(Map.Entry<K, V> entry) {
				this.entry = entry;
			}

			@Override
			public K getKey() {
				return entry.getKey();
			}

			@Override
			public V getValue() {
				return entry.getValue();
			}

			@Override
			public UUID getOrigin() {
				return entry.getValue().getOrigin();
			}
		}
	}
}
