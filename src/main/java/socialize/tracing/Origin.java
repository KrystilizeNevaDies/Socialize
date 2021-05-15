package socialize.tracing;

import java.util.Date;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The Origin object is used to trace transactions in the system.
 * @author Krystilize
 *
 */
public abstract class Origin implements IOrigin {
	
	public static final Map<Long, Origin> ORIGIN_MAP;
	public static final long ROOT = 0;
	
	private static Random random = new Random();
	
	private long index;
	protected Date date;
	protected Origin parent;
	
	static {
		// Setup ORIGIN_MAP
		ORIGIN_MAP = new ConcurrentHashMap<>();
		
		RootOrigin root = new RootOrigin();
		
		ORIGIN_MAP.put((long) 0, root);
	}
	
	protected Origin(Origin parent, Date date) {
		this.date = date;
		this.parent = parent;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getOriginNotes() {
		return date.toString();
	};
	
	@Override
	public Origin getParent() {
		return parent;
	}
	
	public long getIndex() {
		return index;
	}
	
	protected static long putOrigin(Origin origin) {
		long randomLong = random.nextLong();
		
		// Ensure randomLong is unique
		while (ORIGIN_MAP.containsKey(randomLong))
			randomLong = random.nextLong();
		
		ORIGIN_MAP.put(randomLong, origin);
		
		origin.index = randomLong;
		
		return randomLong;
	}

	public static Origin from(long origin) {
		return ORIGIN_MAP.get(origin);
	}
	
	private static class RootOrigin extends Origin {
		
		protected RootOrigin() {
			super(null, new Date());
		}

		@Override
		public OriginType getType() {
			return OriginType.ROOT;
		}
		
		@Override
		public Origin getParent() {
			return this;
		}
		
		@Override
		public long getIndex() {
			return 0;
		}
	}
}