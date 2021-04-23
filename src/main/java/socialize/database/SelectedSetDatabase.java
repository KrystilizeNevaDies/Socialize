package socialize.database;

import org.jetbrains.annotations.NotNull;

/**
 * This database is the same as {@link SetDatabase} except one of the entries are marked as active
 * 
 * @author Krystilize
 */
public interface SelectedSetDatabase<T> extends SetDatabase<T> {
	/**
	 * Gets the data that is currently selected in this database
	 * @return
	 */
	public T getSelected();
	
	/**
	 * Sets the data that is currently selected in this database
	 * @return
	 */
	public void setSelected(@NotNull T selected);
}
