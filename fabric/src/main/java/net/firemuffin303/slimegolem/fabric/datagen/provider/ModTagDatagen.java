package net.firemuffin303.slimegolem.fabric.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.firemuffin303.slimegolem.common.registry.ModBlockTags;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.firemuffin303.slimegolem.common.registry.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModTagDatagen {
    public static class BlockTagDatagen extends FabricTagProvider.BlockTagProvider {
        public BlockTagDatagen(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {
            this.getOrCreateTagBuilder(ModBlockTags.PACKED_SLIME_BLOCK)
                    .add(ModBlock.PACKED_SLIME_BLOCK.get())
                    .add(ModBlock.PACKED_SLIME_BRICKS.get())
                    .add(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get())
                    .add(ModBlock.PACKED_SLIME_STAIR.get())
                    .add(ModBlock.PACKED_SLIME_SLAB.get())
                    .add(ModBlock.PACKED_SLIME_WALL.get())
                    .add(ModBlock.PACKED_SLIME_BRICK_STAIR.get())
                    .add(ModBlock.PACKED_SLIME_BRICK_SLAB.get())
                    .add(ModBlock.PACKED_SLIME_BRICK_WALL.get());

            this.getOrCreateTagBuilder(ModBlockTags.SLIME_GOLEM_BLOCKS)
                    .add(Blocks.SLIME_BLOCK)
                    .forceAddTag(ModBlockTags.PACKED_SLIME_BLOCK);

            this.getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                    .forceAddTag(ModBlockTags.PACKED_SLIME_BLOCK);

            this.getOrCreateTagBuilder(BlockTags.WALLS)
                    .add(ModBlock.PACKED_SLIME_WALL.get())
                    .add(ModBlock.PACKED_SLIME_BRICK_WALL.get());
        }
    }

    public static class ItemTagProvider extends FabricTagProvider.ItemTagProvider{

        public ItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
            super(output, completableFuture, null);
        }

        @Override
        protected void addTags(HolderLookup.Provider wrapperLookup) {
            this.getOrCreateTagBuilder(ModItemTags.PACKED_SLIME_BLOCK)
                    .add(ModItem.PACKED_SLIME_BLOCK.get())
                    .add(ModItem.PACKED_SLIME_BRICKS.get())
                    .add(ModItem.CHISELED_PACKED_SLIME_BLOCK.get())
                    .add(ModItem.PACKED_SLIME_STAIR.get())
                    .add(ModItem.PACKED_SLIME_SLAB.get())
                    .add(ModItem.PACKED_SLIME_WALL.get())
                    .add(ModItem.PACKED_SLIME_BRICK_STAIR.get())
                    .add(ModItem.PACKED_SLIME_BRICK_SLAB.get())
                    .add(ModItem.PACKED_SLIME_BRICK_WALL.get());

        }
    }
}
