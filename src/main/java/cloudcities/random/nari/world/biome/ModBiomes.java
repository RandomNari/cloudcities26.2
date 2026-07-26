package cloudcities.random.nari.world.biome;


import net.fabricmc.fabric.impl.biome.modification.BuiltInResourceKeys;
import net.minecraft.core.Holder;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModBiomes {

    public static final ResourceKey<Biome> Cloudy = ResourceKey.create(
            Registries.BIOME, Identifier.fromNamespaceAndPath("cloudcities.random.nari","cloudy")
    );
    public static void boostrap (BootstrapContext<Biome>context)
    {
        context.register(Cloudy, cloudyBiome(context));
    }
    public static void globalOverworldGeneration(BiomeGenerationSettings.PlainBuilder builder)
    {

    }
    public static Biome cloudyBiome(BootstrapContext<Biome> context) {
        MobSpawnSettings.Builder MobSpawnBuilder = new MobSpawnSettings.Builder();

        BiomeGenerationSettings.PlainBuilder biomeBuilder =
                new BiomeGenerationSettings
                        .PlainBuilder();
        globalOverworldGeneration(biomeBuilder);
        //Decoration.VEGETAL_DECORATION, VegetationPlacements.TREES_PLAINS
        //biomeBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, );
        return new Biome.BiomeBuilder()
                .hasPrecipitation(true)
                .downfall(0.4f)
                .temperature(0.7f)
                .generationSettings(new BiomeGenerationSettings.PlainBuilder()
                        .build())
                .mobSpawnSettings(new MobSpawnSettings.Builder()
                        .build())
                .specialEffects(new BiomeSpecialEffects.Builder()
                        .waterColor(0xe82e3b)

                        .build())
                .build();

    }

}