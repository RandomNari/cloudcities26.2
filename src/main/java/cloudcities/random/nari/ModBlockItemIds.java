package cloudcities.random.nari;

import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static cloudcities.random.nari.Cloudcities.MOD_ID;


public class ModBlockItemIds {

    private static BlockItemId create(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MOD_ID, name);
        return BlockItemId.create(id, id);
    }
    public static final BlockItemId CLOUD = create("cloud");
    public static final BlockItemId BLUE_CLOUD = create("blue_cloud");
    public static final BlockItemId BREEZE_INFUSED_DIAMOND_CLOUD = create("breeze_infused_diamond_cloud");
}
