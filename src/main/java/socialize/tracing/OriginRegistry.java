package socialize.tracing;

import java.util.concurrent.Future;
import java.util.function.Consumer;

import org.jglrxavpok.hephaistos.nbt.NBTCompound;

public interface OriginRegistry {
	public OriginReference registerOrigin(NBTCompound origin);
	
	public void getOrigin(OriginReference reference, Consumer<NBTCompound> consumer);
	public Future<NBTCompound> getOrigin(OriginReference reference);
	
	public NBTCompound getRootOrigin();
	
	public OriginReference getRootOriginReference();
}
