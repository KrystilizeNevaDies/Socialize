package socialize.tracing;

import java.util.Date;
import java.util.UUID;

/**
 * This object denotes an interaction between two players.
 * <br><br>
 * e.g. Krystilize sends a Mail to TheMode911
 * 
 * @author Krystilize
 */
public class PlayerInteractionOrigin extends Origin {
	UUID recipient;
	UUID sender;
	
	public PlayerInteractionOrigin(Origin parent, Date date, UUID recipient, UUID sender) {
		super(parent, date);
		this.recipient = recipient;
		this.sender = sender;
	}
	
	public UUID getRecipient() {
		return recipient;
	}
	
	public UUID getSender() {
		return sender;
	}
	
	@Override
	public String getOriginNotes() {
		return super.getOriginNotes() + "\n"
				+ "Sender: " + sender + "\n"
				+ "Recipient: " + recipient;
	}

	@Override
	public OriginType getType() {
		return OriginType.PLAYER_INTERACTION;
	}
}