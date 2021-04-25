package socialize.tracing;

import java.util.Date;

/**
 * This object denotes an interaction between two players.
 * <br><br>
 * e.g. Krystilize sends a Mail to TheMode911
 * 
 * @author Krystilize
 */
public class AnonymousOrigin extends Origin {
	public AnonymousOrigin(Origin parent, Date date) {
		super(parent, date);
	}

	@Override
	public OriginType getType() {
		return OriginType.ANONYMOUS;
	}
}