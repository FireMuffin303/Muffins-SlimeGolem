package net.firemuffin303.slimegolem.forge.datagen.provider;

import cpw.mods.util.LambdaExceptionUtils;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModBlockStateProvider extends BlockStateProvider {
        public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
                super(output, MuffinsSlimeGolemMod.MOD_ID, exFileHelper);
        }

        @Override
        protected void registerStatesAndModels() {
                blockItem(ModBlock.PACKED_SLIME_BRICKS.get());
                blockItem(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get());
                slabBlockItem((SlabBlock) ModBlock.PACKED_SLIME_BRICK_SLAB.get());
        }

        private void blockItem(Block block){
                simpleBlockWithItem(block,cubeAll(block));
        }

        private void slabBlockItem(SlabBlock block){
                String replace = "";
                if(!block.getName().toString().contains("brick")){
                        replace = "block";
                }
                ResourceLocation resourceLocation = new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,block.getName().toString().replace("_slab",replace));
                slabBlock(block,resourceLocation,resourceLocation);
        }
}
