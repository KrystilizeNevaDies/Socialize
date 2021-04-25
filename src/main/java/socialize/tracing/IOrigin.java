package socialize.tracing;

public interface IOrigin {
	public String getOriginNotes();
	
	public OriginType getType();
	
	public Origin getParent();
}