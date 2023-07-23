package net.firemuffin303.slimegolem;

import net.firemuffin303.slimegolem.common.registry.ModLootTables;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.firemuffin303.slimegolem.common.registry.ModBlockTags;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.firemuffin303.slimegolem.common.registry.ModItemTags;

public class MuffinsSlimeGolemMod {
    public static final String MOD_ID = "muffins_slimegolem";

    public static void init() {
        ModSoundEvents.SOUND_EVENT.init();
        ModLootTables.init();
        ModBlock.BLOCKS.init();
        ModEntityTypes.ENTITY_TYPE.init();
        ModItem.ITEMS.init();
        ModItemTags.init();
        ModBlockTags.init();


    }

}
