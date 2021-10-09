package com.frogastudios.sticksdebugged.mixin;

import net.minecraft.item.DebugStickItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(DebugStickItem.class)
public class MixinDebugStickItem
{
    @ModifyConstant(method = "use", constant = @Constant(intValue = 3))
    private static int modifyHeightLimit(int i) {
        // Use coordinates in tag to determine the position of the chunk
        return 256;
    }
}
© 2021 GitHub, Inc.
        Terms
        Priva