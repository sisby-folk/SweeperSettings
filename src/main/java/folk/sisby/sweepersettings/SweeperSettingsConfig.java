package folk.sisby.sweepersettings;

import folk.sisby.kaleido.api.WrappedConfig;
import folk.sisby.kaleido.lib.quiltconfig.api.annotations.Comment;

public class SweeperSettingsConfig extends WrappedConfig {
    @Comment("The size of the play area as a power of 2. Default represents 1024x1024.")
    @Comment("Only produces a playable result between 5 and 11")
    @Comment("walk up and left to reach the play area on lower values.")
    public final Integer areaSize = 10;

    @Comment("The maximum speed of the player. Will cause clipping issues, obviously.")
    public final Double speedCap = 6.0;
}
