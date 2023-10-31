package io.github.bd103.ticklowerperm;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TickLowerPerm implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ticklowerperm");

	@Override
	public void onInitialize() {
		LOGGER.info("Initialized TickLowerPerm");
	}
}
