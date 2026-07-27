package cloudcities.random.nari;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import static cloudcities.random.nari.Cloudcities.MOD_ID;

public class ModItemIds {


    public static ResourceKey<Item> create (String name)
    {


    return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
}
    public static final ResourceKey<Item> COTTON_CANDY = create("cotton_candy");
}
