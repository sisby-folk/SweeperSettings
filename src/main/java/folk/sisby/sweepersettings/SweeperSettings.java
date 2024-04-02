package folk.sisby.sweepersettings;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SweeperSettings implements ModInitializer {
    public static final String ID = "sweepersettings";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);
    public static final SweeperSettingsConfig CONFIG = SweeperSettingsConfig.createToml(FabricLoader.getInstance().getConfigDir(), "", ID, SweeperSettingsConfig.class);

    @Override
    public void onInitialize() {
        LOGGER.info("[Sweeper Settings] Initialized!");

    }
}
