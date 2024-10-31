package net.firemuffin303.slimegolem.fabric.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;

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

        this.dropSelf(ModBlock.PACKED_SLIME_BLOCK.get());
        this.dropSelf(ModBlock.PACKED_SLIME_BRICKS.get());
        this.dropSelf(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get());
        this.dropSelf(ModBlock.PACKED_SLIME_STAIR.get());
        this.add(ModBlock.PACKED_SLIME_SLAB.get(),this.createSlabItemTable(ModBlock.PACKED_SLIME_SLAB.get()));
        this.dropSelf(ModBlock.PACKED_SLIME_WALL.get());
        this.dropSelf(ModBlock.PACKED_SLIME_BRICK_STAIR.get());
        this.add(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),this.createSlabItemTable(ModBlock.PACKED_SLIME_BRICK_SLAB.get()));
        this.dropSelf(ModBlock.PACKED_SLIME_BRICK_WALL.get());

        this.add(ModBlock.SLIME_ALGAE.get(), this.createSilkTouchOrShearsDispatchTable(ModBlock.SLIME_ALGAE.get(),
                this.applyExplosionCondition(ModBlock.SLIME_ALGAE.get(), LootItem.lootTableItem(Items.SLIME_BALL))
                        .when(BonusLevelTableCondition.bonusLevelFlatChance(registries.lookup(Registries.ENCHANTMENT).get().getOrThrow(Enchantments.FORTUNE), 0.05F, 0.0625F, 0.083333336F, 0.1F))
        ));



        blocksEntries.forEach((block) ->{
            if(block.get() instanceof SlabBlock){
                this.add(block.get(),this.createSlabItemTable(block.get()));
            }else{
                this.add(block.get(),this.createSingleItemTable(block.get()));
            }

        });

    }

}
