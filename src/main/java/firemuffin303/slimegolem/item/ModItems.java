package firemuffin303.slimegolem.item;

import firemuffin303.slimegolem.Slimegolem;
import firemuffin303.slimegolem.block.ModBlocks;
import firemuffin303.slimegolem.entity.ModEntity;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static Item SLIME_PIE = new Item(new FabricItemSettings().food(ModFoods.SLIME_PIE).group(Slimegolem.TAB));
    public static Item SLIME_GOLEM_SPAWN_EGG = new SpawnEggItem(ModEntity.SLIME_GOLEM,1619264,16044889, new FabricItemSettings().group(Slimegolem.TAB));
    public static Item SLIME_ALGAE = new BlockItem(ModBlocks.SLIME_ALGAE,new Item.Settings().group(Slimegolem.TAB));
    public static Item PACKED_SLIME_BLOCK = new BlockItem(ModBlocks.PACKED_SLIME_BLOCK,new Item.Settings().group(Slimegolem.TAB));


    public static void init(){
        register("slime_pie",SLIME_PIE);
        register("slime_golem_spawn_egg", SLIME_GOLEM_SPAWN_EGG);
        register("slime_algae",SLIME_ALGAE);
        register("packed_slime_block", PACKED_SLIME_BLOCK);
    }

    private static void register(String id,Item item){
        Registry.register(Registry.ITEM,new Identifier(Slimegolem.MODID,id),item);
    }

    private static Item register(String id, Block block){
        return Registry.register(Registry.ITEM, new Identifier(Slimegolem.MODID,id),new BlockItem(block,new FabricItemSettings().group(Slimegolem.TAB)));
    }
}
