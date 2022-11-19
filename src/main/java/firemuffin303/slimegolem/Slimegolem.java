package firemuffin303.slimegolem;

import firemuffin303.slimegolem.block.ModBlocks;
import firemuffin303.slimegolem.entity.ModEntity;
import firemuffin303.slimegolem.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Slimegolem implements ModInitializer {
    public static String MODID = "slimegolem";

    public static ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(MODID,"main"),() -> new ItemStack(ModItems.SLIME_PIE));

    @Override
    public void onInitialize() {
        ModEntity.init();
        ModItems.init();
        ModBlocks.init();
    }
}
