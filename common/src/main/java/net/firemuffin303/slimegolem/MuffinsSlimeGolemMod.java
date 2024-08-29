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
        output.accept(ModItem.SLIME_PIE.get());
        output.accept(ModItem.SLIME_GOLEM_SPAWN_EGG.get());
        output.accept(ModItem.MUSIC_DISC_BOUNCYSLIME.get());
        output.accept(ModItem.MUSIC_DISC_BOUNCE_TIL_THE_END.get());
        output.accept(ModItem.SLIME_ALGAE.get());

        output.accept(ModItem.PACKED_SLIME_BLOCK.get());
        output.accept(ModItem.PACKED_SLIME_STAIR.get());
        output.accept(ModItem.PACKED_SLIME_SLAB.get());
        output.accept(ModItem.PACKED_SLIME_WALL.get());
        output.accept(ModItem.PACKED_SLIME_BRICKS.get());
        output.accept(ModItem.CHISELED_PACKED_SLIME_BLOCK.get());
        output.accept(ModItem.PACKED_SLIME_BRICK_SLAB.get());
        output.accept(ModItem.PACKED_SLIME_BRICK_STAIR.get());
        output.accept(ModItem.PACKED_SLIME_BRICK_WALL.get());

    }

}
