package folk.sisby.sweepersettings.mixin.client;

import blue.endless.minesweeper.client.MinesweeperClient;
import folk.sisby.sweepersettings.SweeperSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = MinesweeperClient.class, remap = false)
public class MixinMinesweeperClient {
    @ModifyArg(method = "tick", at = @At(value = "INVOKE", target = "Lblue/endless/minesweeper/client/MinesweeperClient;addWithSoftCap(DDD)D"), index = 2)
    private static double changeMaxSpeed(double input) {
        return SweeperSettings.CONFIG.speedCap;
    }
}
