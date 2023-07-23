package net.firemuffin303.slimegolem.fabric.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.minecraft.world.level.block.SlabBlock;

import java.util.stream.Collectors;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        var blocksEntries = ModBlock.BLOCKS.getEntries().stream().collect(Collectors.toSet());
        blocksEntries.remove(ModBlock.SLIME_ALGAE);

        blocksEntries.forEach((block) ->{
            if(block.get() instanceof SlabBlock){
                this.add(block.get(),this.createSlabItemTable(block.get()));
            }else{
                this.add(block.get(),this.createSingleItemTable(block.get()));
            }

        });

    }
}
