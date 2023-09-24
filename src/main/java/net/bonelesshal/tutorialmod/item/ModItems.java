package net.bonelesshal.tutorialmod.item;

import net.bonelesshal.tutorialmod.TutorialMod;
import net.bonelesshal.tutorialmod.entity.ModEntityTypes;
import net.bonelesshal.tutorialmod.item.custom.SquelchItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> COOM = ITEMS.register("coom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_COOM = ITEMS.register("raw_coom",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> SQUELCH = ITEMS.register("squelch",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> PRINGLES = ITEMS.register("pringles",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> RUBBER_GLOVE = ITEMS.register("rubber_glove",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> COOMER_EGG = ITEMS.register("coomer_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.COOMER, 0xffffff, 0x000000,
                    new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
