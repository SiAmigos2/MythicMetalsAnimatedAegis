package nourl.mythicmetals.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.DefaultedRegistry;
import nourl.mythicmetals.MythicMetals;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

    @Mixin(DefaultedRegistry.class)
    public class DefaultedRegistryMixin {
        @ModifyVariable(at = @At("HEAD"), method = "get(Lnet/minecraft/util/Identifier;)Ljava/lang/Object;", ordinal = 0)
        Identifier fixMissingFromRegistry(@Nullable Identifier id) {
            Identifier copper = new Identifier(MythicMetals.MOD_ID, "copper_ore");
            if(id != null) {
                if(id.getNamespace().equals("mm_decorations")) return new Identifier(MythicMetals.MOD_ID, id.getPath());
                if(id.getPath().equals("unobtainium_dust")) return new Identifier(MythicMetals.MOD_ID, "unobtainium");
                if(id.equals(copper)) return new Identifier("minecraft","copper_ore");
            }
            return id;
        }
    }
