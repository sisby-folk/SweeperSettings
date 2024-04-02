package folk.sisby.sweepersettings.mixin;

import blue.endless.minesweeper.world.Area;
import folk.sisby.sweepersettings.SweeperSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = Area.class, remap = false)
public class MixinArea {
    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lblue/endless/minesweeper/world/Patch;<init>(II)V"), index = 0)
    private int changeAreaWidth(int width) {
        return 2 << SweeperSettings.CONFIG.areaSize;
    }

    @ModifyArg(method = "<init>", at = @At(value = "INVOKE", target = "Lblue/endless/minesweeper/world/Patch;<init>(II)V"), index = 1)
    private int changeAreaHeight(int height) {
        return 2 << SweeperSettings.CONFIG.areaSize;
    }
}
