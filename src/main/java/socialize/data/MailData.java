package socialize.data;

import socialize.tracing.Origin;

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
	public static MailData from(String bio, Origin origin) {
		return new MailDataImpl(bio, origin);
	}
	
	class MailDataImpl implements MailData {
		String mail;
		
		Origin origin;
		
		MailDataImpl(String mail, Origin origin) {
			this.mail = mail;
			this.origin = origin;
		}
		
		@Override
		public String getMail() {
			return mail;
		}

		@Override
		public Origin getOrigin() {
			return origin;
		}
	}
}
