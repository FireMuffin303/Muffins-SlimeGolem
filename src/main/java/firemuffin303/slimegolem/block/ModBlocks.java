package firemuffin303.slimegolem.block;

import firemuffin303.slimegolem.Slimegolem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block SLIME_ALGAE = new SlimeAlgaeBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).noCollision().strength(0.2F));
    public static final Block PACKED_SLIME_BLOCK = new SolidSlimeBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT, MapColor.PALE_GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque().strength(0.6F));

    public static void init(){
        addBlock("slime_algae",SLIME_ALGAE);
        addBlock("packed_slime_block", PACKED_SLIME_BLOCK);
    }

    private static void addBlock(String id,Block block){
        Registry.register(Registry.BLOCK, new Identifier(Slimegolem.MODID,id),block);
    }
}
