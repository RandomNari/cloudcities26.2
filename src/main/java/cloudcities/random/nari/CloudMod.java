package cloudcities.random.nari;

import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class CloudMod implements ModInitializer, TerraBlenderApi
{
    public static final String MOD_ID = "cloudcities";

    @Override
    public void onInitialize()
    {

    }

    @Override
    public void onTerraBlenderInitialized()
    {
        // Weights are kept intentionally low as we add minimal biomes
        Regions.register(new CloudRegion1(Identifier.fromNamespaceAndPath(MOD_ID, "overworld_1"), 2));

        // Register our surface rules
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, MOD_ID, CloudSurfaceRuleData.makeRules());
    }
}