package io.github.bd103.ticklowerperm.mixin;

import net.minecraft.server.command.TickCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(TickCommand.class)
public abstract class TickCommandMixin {
    // Replace the constant representing the permission level from 3 to 2, allowing command blocks to run it.
    @ModifyConstant(
            method = "method_54709(Lnet/minecraft/server/command/ServerCommandSource;)Z",
            constant = @Constant(intValue = 3)
    )
    private static int permissionLevel(int _value) {
        return 2;
    }
}
