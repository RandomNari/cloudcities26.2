package cloudcities.random.nari.Item;

import cloudcities.random.nari.ModItemIds;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class ModItems {
    public static Item register(ResourceKey<Item> ItemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {

        Item item = itemFactory.apply(settings.setId(ItemKey));

        Registry.register(BuiltInRegistries.ITEM, ItemKey, item);

        return item;
    }
    public static final Item cotton_candy = register(ModItemIds.COTTON_CANDY, Item::new, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(4).build()));
    public static final Item red_cotton_candy = register(ModItemIds.RED_COTTON_CANDY, Item::new, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(4).build()));
    public static final Item blue_cotton_candy = register(ModItemIds.BLUE_COTTON_CANDY, Item::new, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(4).build()));
    public static final Item yellow_cotton_candy = register(ModItemIds.YELLOW_COTTON_CANDY, Item::new, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(4).build()));
    public static final Item pink_cotton_candy = register(ModItemIds.PINK_COTTON_CANDY, Item::new, new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationModifier(4).build()));
    public static final Item breeze_infused_stick = register(ModItemIds.BREEZE_INFUSED_STICK, Item::new, new Item.Properties());

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((creativeTab) -> creativeTab.accept(ModItems.cotton_candy));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((creativeTab) -> creativeTab.accept(ModItems.red_cotton_candy));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((creativeTab) -> creativeTab.accept(ModItems.blue_cotton_candy));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((creativeTab) -> creativeTab.accept(ModItems.pink_cotton_candy));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((creativeTab) -> creativeTab.accept(ModItems.yellow_cotton_candy));
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
                .register((creativeTab) -> creativeTab.accept(ModItems.breeze_infused_stick));
    }

}
