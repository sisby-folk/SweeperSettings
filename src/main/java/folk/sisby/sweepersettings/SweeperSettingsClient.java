package folk.sisby.sweepersettings;

import net.fabricmc.api.ClientModInitializer;

import static com.mojang.text2speech.Narrator.LOGGER;

public class SweeperSettingsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        LOGGER.info("[Sweeper Settings Client] Initialized!");
    }
}
