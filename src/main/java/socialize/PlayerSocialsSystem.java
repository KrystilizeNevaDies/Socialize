package socialize;

import socialize.tracing.OriginRegistry;

/*
 * This class is used to store the origin registry and provide access to it.
 */
public class PlayerSocialsSystem {

	private static OriginRegistry registry;

	public static void init(OriginRegistry registry) {
		PlayerSocialsSystem.registry = registry;
	}

	public static OriginRegistry getOriginRegistry() {
		return PlayerSocialsSystem.registry;
	}
}
