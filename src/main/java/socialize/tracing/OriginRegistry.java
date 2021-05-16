package socialize.tracing;

public interface OriginRegistry<T> {
	public T registerOrigin(Origin origin);
	
	public Origin getOrigin(T id);
	
	public Origin getRootOrigin();
}
