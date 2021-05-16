package socialize.tracing;

public interface IOrigin {
	public String getOriginNotes();
	
	public <T> T getParentID();
}