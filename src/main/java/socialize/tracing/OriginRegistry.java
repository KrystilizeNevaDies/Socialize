package socialize.tracing;

public interface OriginRegistry<T> {
	public T registerOrigin();
	
	public Origin getOrigin(T id);
	
	public Origin getRootOrigin();
}
