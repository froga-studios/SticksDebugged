package com.frogastudios.sticksdebugged.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DebugStickItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerEntity.class)
public class MixinPlayerEntity
{
    @Inject(at = @At("HEAD"), method = "isCreativeLevelTwoOp", cancellable = true)
    private void modifyHeightLimit(CallbackInfoReturnable<Boolean> cir) {
        // Use coordinates in tag to determine the position of the chunk
        cir.setReturnValue(true);
    }
}