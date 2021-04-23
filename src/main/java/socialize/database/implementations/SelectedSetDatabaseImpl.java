package socialize.database.implementations;

import java.util.Set;

import org.jetbrains.annotations.NotNull;

import socialize.database.SelectedSetDatabase;

public class SelectedSetDatabaseImpl<T> extends SetDatabaseImpl<T> implements SelectedSetDatabase<T> {
	
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
	public void setSelected(@NotNull T selected) {
		this.selected = selected;
	}
}
