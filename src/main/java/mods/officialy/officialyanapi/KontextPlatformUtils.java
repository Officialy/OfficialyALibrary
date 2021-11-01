package mods.officialy.officialyanapi;

import net.minecraft.resources.ResourceLocation;

public class KontextPlatformUtils {
    @ExpectPlatform
    public static ResourceLocation getRegistryName(Object obj) {
        return new ResourceLocation("invalid");
    }
}