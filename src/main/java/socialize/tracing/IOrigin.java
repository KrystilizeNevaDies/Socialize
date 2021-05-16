package socialize.tracing;

public interface IOrigin {
	public String getOriginNotes();
	
	public Origin getParent();
}