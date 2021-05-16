package socialize.data;

import socialize.tracing.OriginReference;

public interface OriginData {
	/**
	 * Gets the data's origin's ID
	 * 
	 * @return Origin's ID
	 */
	public OriginReference getOriginReference();
}
