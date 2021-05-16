package socialize.data;

import socialize.tracing.OriginReference;

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
	public static  MailData from(String bio, OriginReference origin) {
		return new MailDataImpl(bio, origin);
	}
	
	class MailDataImpl implements MailData {
		String mail;
		
		OriginReference origin;
		
		MailDataImpl(String mail, OriginReference origin) {
			this.mail = mail;
			this.origin = origin;
		}
		
		@Override
		public String getMail() {
			return mail;
		}

		@Override
		public OriginReference getOriginReference() {
			return origin;
		}
	}
}
