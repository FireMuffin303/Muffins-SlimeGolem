package net.firemuffin303.slimegolem;

import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.block.ModBlockTags;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.firemuffin303.slimegolem.registry.item.ModItem;
import net.firemuffin303.slimegolem.registry.item.ModItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class SlimeGolemMod {
    public static final String MOD_ID = "slimegolem";
    public static final CreativeModeTab TAB = ModPlatform.registerCreativeTab(new ResourceLocation(MOD_ID, "main"), () -> new ItemStack(Items.SLIME_BALL));

    public static void init() {
        ModSoundEvents.init();
        ModBlock.init();
        ModItem.init();
        ModEntity.init();
        ModItemTags.init();
        ModBlockTags.init();
    }
}
