package socialize.tracing;

import java.util.UUID;
import java.util.concurrent.Future;
import java.util.function.Consumer;

import org.jglrxavpok.hephaistos.nbt.NBTCompound;

public interface OriginRegistry {
	public UUID registerOrigin(NBTCompound origin);
	
	public void getOrigin(UUID reference, Consumer<NBTCompound> consumer);
	public Future<NBTCompound> getOrigin(UUID reference);
	
	public NBTCompound getRootOrigin();
	
	public UUID getRootUUID();
}
