package cloudcities.random.nari;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

import static cloudcities.random.nari.Cloudcities.MOD_ID;

public class CloudBiomes
{
    public static final ResourceKey<Biome> CLOUDFUL = register("cloudful");

    private static ResourceKey<Biome> register(String name)
    {
        return ResourceKey.create(Registries.BIOME, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }
}
