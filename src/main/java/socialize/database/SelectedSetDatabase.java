package socialize.database;

/**
 * This database is the same as {@link SetDatabase} except one of the entries are marked as active
 * @author Krystilize
 *
 */
public interface SelectedSetDatabase<T> extends SetDatabase<T> {
	public T getSelected();
}
