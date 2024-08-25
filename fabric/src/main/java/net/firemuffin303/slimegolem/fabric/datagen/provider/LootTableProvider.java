package net.firemuffin303.slimegolem.fabric.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;

import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LootTableProvider extends FabricBlockLootTableProvider {


    public LootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        var blocksEntries = new HashSet<>(ModBlock.BLOCKS);
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
