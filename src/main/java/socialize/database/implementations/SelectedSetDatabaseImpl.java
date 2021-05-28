package socialize.database.implementations;

import java.util.Set;

import socialize.data.OriginData;
import socialize.database.SelectedSetDatabase;

public class SelectedSetDatabaseImpl<T extends OriginData> extends SetDatabaseImpl<T>
		implements SelectedSetDatabase<T> {

	T selected;

	public SelectedSetDatabaseImpl(Set<T> set, T selected) {
		super(set);

		this.selected = selected;
	}

	@Override
	public T getSelected() {
		return selected;
	}

	@Override
	public void setSelected(T selected) {
		this.selected = selected;
	}
}
