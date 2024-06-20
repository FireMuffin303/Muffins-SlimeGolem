package net.firemuffin303.slimegolem;

import net.firemuffin303.slimegolem.common.registry.*;
import net.minecraft.world.item.CreativeModeTab;

public class MuffinsSlimeGolemMod {
    public static final String MOD_ID = "muffins_slimegolem";

    public static void init() {

        ModSoundEvents.init();
        ModLootTables.init();
        ModBlock.init();
        ModEntityTypes.init();
        ModItem.init();
        ModItemTags.init();
        ModBlockTags.init();


    }

    public static void displayItem(CreativeModeTab.ItemDisplayParameters itemDisplayParameters, CreativeModeTab.Output output){
        ModItem.ITEMS.forEach((itemSupplier) -> output.accept(itemSupplier.get()));

    }
}
