package socialize.tracing;

import java.util.UUID;
import java.util.concurrent.Future;
import java.util.function.Consumer;

import org.jglrxavpok.hephaistos.nbt.NBTCompound;

public interface OriginRegistry {
	public UUID registerOrigin(NBTCompound origin);
	
	public void retrieveOrigin(UUID reference, Consumer<NBTCompound> consumer);
	public Future<NBTCompound> retrieveOrigin(UUID reference);
	
	public UUID getRootOrigin();
}
