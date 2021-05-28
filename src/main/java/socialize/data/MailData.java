package socialize.data;

import java.util.UUID;

public interface MailData extends OriginData {

	/**
	 * Gets the mail string
	 *
	 * @return String
	 */
	public String getMail();

	/**
	 * Creates an immutable version of this data
	 *
	 * @return data
	 */
	public static MailData from(String bio, UUID origin) {
		return new MailDataImpl(bio, origin);
	}

	class MailDataImpl implements MailData {
		final String mail;

		final UUID origin;

		MailDataImpl(String mail, UUID origin) {
			this.mail = mail;
			this.origin = origin;
		}

		@Override
		public String getMail() {
			return mail;
		}

		@Override
		public UUID getOrigin() {
			return origin;
		}
	}
}
