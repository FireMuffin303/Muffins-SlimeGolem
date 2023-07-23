package net.firemuffin303.slimegolem.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;

import java.util.HashMap;
import java.util.Map;

public class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(BlockModelProvider::new);
    }

    private class BlockModelProvider extends FabricModelProvider {
        public BlockModelProvider(FabricDataOutput output) {
            super(output);
        }

        @Override
        public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
            blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlock.PACKED_SLIME_BLOCK.get(), ModelTemplates.CUBE_ALL.create(ModBlock.PACKED_SLIME_BLOCK.get(), TextureMapping.cube(ModelLocationUtils.getModelLocation(Blocks.SLIME_BLOCK)), blockStateModelGenerator.modelOutput)));
            //blockStateModelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(),ModelLocationUtils.getModelLocation(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get())));
            ModBlock.SLIME_BLOCKS.getEntries().forEach((block) -> {cubeall(block.get(),blockStateModelGenerator);});

            slab(Blocks.SLIME_BLOCK,blockStateModelGenerator, (SlabBlock) ModBlock.PACKED_SLIME_SLAB.get());
            slabBlockMapping().forEach(((block, slabBlock) -> slab(block,blockStateModelGenerator,slabBlock)));

            stairs(Blocks.SLIME_BLOCK,blockStateModelGenerator, (StairBlock) ModBlock.PACKED_SLIME_STAIR.get());
            stairBlockMapping().forEach((block, stairBlock) -> stairs(block,blockStateModelGenerator,stairBlock));

            wallBlockMapping().forEach((block, wallBlock) -> wall(block,blockStateModelGenerator,wallBlock));
        }

        @Override
        public void generateItemModels(ItemModelGenerators itemModelGenerator) {

        }

        private void cubeall(Block block,BlockModelGenerators blockModelGenerators){
            blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, ModelTemplates.CUBE_ALL.create(block, TextureMapping.cube(ModelLocationUtils.getModelLocation(block)), blockModelGenerators.modelOutput)));
        }

        private void slab(Block block, BlockModelGenerators blockModelGenerators, SlabBlock slabBlock){
            ResourceLocation fullBlock = ModelLocationUtils.getModelLocation(block);
            TexturedModel texturedModel = TexturedModel.CUBE.get(block);
            ResourceLocation slabBottom = ModelTemplates.SLAB_BOTTOM.create(slabBlock, texturedModel.getMapping(), blockModelGenerators.modelOutput);
            ResourceLocation slabTop = ModelTemplates.SLAB_TOP.create(slabBlock, texturedModel.getMapping(), blockModelGenerators.modelOutput);
            blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSlab(slabBlock,slabBottom,slabTop,fullBlock));
        }

        public void stairs(Block block, BlockModelGenerators blockModelGenerators, StairBlock stairBlock) {
            TexturedModel texturedModel = TexturedModel.CUBE.get(block);
            ResourceLocation resourceLocation = ModelTemplates.STAIRS_INNER.create(stairBlock,texturedModel.getMapping(), blockModelGenerators.modelOutput);
            ResourceLocation resourceLocation2 = ModelTemplates.STAIRS_STRAIGHT.create(stairBlock,texturedModel.getMapping(), blockModelGenerators.modelOutput);
            ResourceLocation resourceLocation3 = ModelTemplates.STAIRS_OUTER.create(stairBlock,texturedModel.getMapping(), blockModelGenerators.modelOutput);
            blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createStairs(stairBlock, resourceLocation, resourceLocation2, resourceLocation3));
            //blockModelGenerators.delegateItemModel(block, resourceLocation2);
        }

        public void wall(Block block, BlockModelGenerators blockModelGenerators, WallBlock wallBlock) {
            TexturedModel texturedModel = TexturedModel.CUBE.get(block);
            ResourceLocation resourceLocation = ModelTemplates.WALL_POST.create(wallBlock, texturedModel.getMapping(), blockModelGenerators.modelOutput);
            ResourceLocation resourceLocation2 = ModelTemplates.WALL_LOW_SIDE.create(wallBlock, texturedModel.getMapping(), blockModelGenerators.modelOutput);
            ResourceLocation resourceLocation3 = ModelTemplates.WALL_TALL_SIDE.create(wallBlock, texturedModel.getMapping(), blockModelGenerators.modelOutput);
            blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createWall(wallBlock, resourceLocation, resourceLocation2, resourceLocation3));
            ResourceLocation resourceLocation4 = ModelTemplates.WALL_INVENTORY.create(wallBlock, texturedModel.getMapping(), blockModelGenerators.modelOutput);
            blockModelGenerators.delegateItemModel(wallBlock, resourceLocation4);
        }

        private Map<Block,SlabBlock> slabBlockMapping(){
            Map<Block,SlabBlock> map = new HashMap<>();
            map.put(ModBlock.PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.WHITE_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.WHITE_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.WHITE_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.LIGHT_GRAY_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.GRAY_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.GRAY_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.GRAY_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.BLACK_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.BLACK_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.BLACK_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.BROWN_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.BROWN_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.BROWN_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.RED_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.RED_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.RED_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.RED_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.ORANGE_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.ORANGE_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.ORANGE_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.YELLOW_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.YELLOW_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.YELLOW_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.LIME_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.LIME_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.LIME_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.LIME_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.GREEN_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.GREEN_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.GREEN_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.CYAN_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.CYAN_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.CYAN_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.LIGHT_BLUE_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.BLUE_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.BLUE_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.BLUE_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.PURPLE_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.PURPLE_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.MAGENTA_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.MAGENTA_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.MAGENTA_PACKED_SLIME_BRICK_SLAB.get());

            map.put(ModBlock.PINK_PACKED_SLIME_BLOCK.get(), (SlabBlock) ModBlock.PINK_PACKED_SLIME_SLAB.get());
            map.put(ModBlock.PINK_PACKED_SLIME_BRICKS.get(), (SlabBlock) ModBlock.PINK_PACKED_SLIME_BRICK_SLAB.get());

            return map;
        }

        private Map<Block,StairBlock> stairBlockMapping(){
            Map<Block,StairBlock> map = new HashMap<>();
            map.put(ModBlock.PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.WHITE_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.WHITE_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.WHITE_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.LIGHT_GRAY_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.GRAY_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.GRAY_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.GRAY_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.BLACK_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.BLACK_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.BLACK_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.BROWN_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.BROWN_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.BROWN_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.RED_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.RED_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.RED_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.RED_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.ORANGE_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.ORANGE_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.ORANGE_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.YELLOW_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.YELLOW_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.YELLOW_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.LIME_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.LIME_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.LIME_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.LIME_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.GREEN_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.GREEN_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.GREEN_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.CYAN_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.CYAN_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.CYAN_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.LIGHT_BLUE_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.BLUE_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.BLUE_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.BLUE_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.PURPLE_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.PURPLE_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.MAGENTA_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.MAGENTA_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.MAGENTA_PACKED_SLIME_BRICK_STAIR.get());

            map.put(ModBlock.PINK_PACKED_SLIME_BLOCK.get(), (StairBlock) ModBlock.PINK_PACKED_SLIME_STAIR.get());
            map.put(ModBlock.PINK_PACKED_SLIME_BRICKS.get(), (StairBlock) ModBlock.PINK_PACKED_SLIME_BRICK_STAIR.get());

            return map;
        }

        private Map<Block,WallBlock> wallBlockMapping(){
            Map<Block,WallBlock> map = new HashMap<>();
            map.put(Blocks.SLIME_BLOCK, (WallBlock) ModBlock.PACKED_SLIME_WALL.get());
            map.put(ModBlock.PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.WHITE_PACKED_SLIME_WALL.get());
            map.put(ModBlock.WHITE_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.WHITE_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.LIGHT_GRAY_PACKED_SLIME_WALL.get());
            map.put(ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.GRAY_PACKED_SLIME_WALL.get());
            map.put(ModBlock.GRAY_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.GRAY_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.BLACK_PACKED_SLIME_WALL.get());
            map.put(ModBlock.BLACK_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.BLACK_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.BROWN_PACKED_SLIME_WALL.get());
            map.put(ModBlock.BROWN_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.BROWN_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.RED_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.RED_PACKED_SLIME_WALL.get());
            map.put(ModBlock.RED_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.RED_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.ORANGE_PACKED_SLIME_WALL.get());
            map.put(ModBlock.ORANGE_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.ORANGE_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.YELLOW_PACKED_SLIME_WALL.get());
            map.put(ModBlock.YELLOW_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.YELLOW_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.LIME_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.LIME_PACKED_SLIME_WALL.get());
            map.put(ModBlock.LIME_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.LIME_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.GREEN_PACKED_SLIME_WALL.get());
            map.put(ModBlock.GREEN_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.GREEN_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.CYAN_PACKED_SLIME_WALL.get());
            map.put(ModBlock.CYAN_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.CYAN_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.LIGHT_BLUE_PACKED_SLIME_WALL.get());
            map.put(ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.LIGHT_BLUE_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.BLUE_PACKED_SLIME_WALL.get());
            map.put(ModBlock.BLUE_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.BLUE_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.PURPLE_PACKED_SLIME_WALL.get());
            map.put(ModBlock.PURPLE_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.PURPLE_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.MAGENTA_PACKED_SLIME_WALL.get());
            map.put(ModBlock.MAGENTA_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.MAGENTA_PACKED_SLIME_BRICK_WALL.get());

            map.put(ModBlock.PINK_PACKED_SLIME_BLOCK.get(), (WallBlock) ModBlock.PINK_PACKED_SLIME_WALL.get());
            map.put(ModBlock.PINK_PACKED_SLIME_BRICKS.get(), (WallBlock) ModBlock.PINK_PACKED_SLIME_BRICK_WALL.get());

            return map;
        }

    }
}
