package cloudcities.random.nari;

import net.minecraft.core.HolderGetter;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import terrablender.api.SurfaceRuleManager;

public class CloudSurfaceRuleData
{
    private static final SurfaceRules.RuleSource DIRT = makeStateRule(Blocks.DIRT);
    private static final SurfaceRules.RuleSource CLOUD = makeStateRule(ModBlocks.CLOUD);

    protected static SurfaceRuleManager.RuleBuilder makeRules()
    {
        return biomes -> {
            SurfaceRules.ConditionSource isAtOrAboveWaterLevel =
                    SurfaceRules.waterBlockCheck(-1, 0);

            SurfaceRules.RuleSource grassSurface =
                    SurfaceRules.sequence(
                            SurfaceRules.ifTrue(isAtOrAboveWaterLevel, CLOUD),
                            DIRT
                    );

            return SurfaceRules.sequence(
                    SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, grassSurface)
            );
        };
    }

    private static SurfaceRules.RuleSource makeStateRule(Block block)
    {
        return SurfaceRules.state(block.defaultBlockState());
    }
}
