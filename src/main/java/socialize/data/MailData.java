package socialize.data;

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
	public static MailData from(String bio, long origin) {
		return new MailDataImpl(bio, origin);
	}
	
	class MailDataImpl implements MailData {
		String mail;
		
		long origin;
		
		MailDataImpl(String mail, long origin) {
			this.mail = mail;
			this.origin = origin;
		}
		
		@Override
		public String getMail() {
			return mail;
		}

		@Override
		public long getOrigin() {
			return origin;
		}
	}
}
