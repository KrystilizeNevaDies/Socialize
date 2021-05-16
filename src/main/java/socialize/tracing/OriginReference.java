package socialize.tracing;

import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import org.jglrxavpok.hephaistos.nbt.NBTCompound;

import socialize.PlayerSocialsSystem;

/**
 * Represents a reference to a specific origin.
 * 
 * @author Krystilize
 */
public class OriginReference {
	
	public OriginReference() {}
	
	/**
	 * Gets the origin without blocking this thread.
	 * 
	 * @return NBTCompound origin
	 */
	public void acquire(Consumer<NBTCompound> consumer) {
		PlayerSocialsSystem.getOriginRegistry().getOrigin(this, consumer);
	}
	
	/**
	 * Gets the origin while blocking this thread.
	 * <br><br>
	 * This may result in delay in very rare cases, try to use {@link #acquire(Consumer)} when possible.
	 * 
	 * @return NBTCompound origin
	 */
	public NBTCompound get() {
		
		try {
			return PlayerSocialsSystem.getOriginRegistry().getOrigin(this).get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
