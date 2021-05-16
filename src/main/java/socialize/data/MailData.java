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
	public static <T> MailData from(String bio, T origin) {
		return new MailDataImpl<T>(bio, origin);
	}
	
	class MailDataImpl<T> implements MailData {
		String mail;
		
		T origin;
		
		MailDataImpl(String mail, T origin) {
			this.mail = mail;
			this.origin = origin;
		}
		
		@Override
		public String getMail() {
			return mail;
		}

		@SuppressWarnings("unchecked")
		@Override
		public T getOriginID() {
			return origin;
		}
	}
}
