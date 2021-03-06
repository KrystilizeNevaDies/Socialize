package socialize.database;

import socialize.data.OriginData;

/**
 * This database is the same as {@link SetDatabase} except one of the entries
 * are marked as selected
 *
 * @author Krystilize
 */
public interface SelectedSetDatabase<T extends OriginData> extends IDatabase<T> {
	/**
	 * Gets the data that is currently selected in this database
	 *
	 * @return
	 */
	public T getSelected();

	/**
	 * Sets the data that is currently selected in this database
	 *
	 * @return
	 */
	public void setSelected(T selected);
}
