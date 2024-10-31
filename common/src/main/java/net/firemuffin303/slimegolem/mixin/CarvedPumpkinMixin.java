package net.firemuffin303.slimegolem.mixin;

import com.mojang.serialization.MapCodec;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.firemuffin303.slimegolem.common.registry.ModBlockTags;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.pattern.BlockPattern;
import net.minecraft.world.level.block.state.pattern.BlockPatternBuilder;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Predicate;

@Mixin(CarvedPumpkinBlock.class)
public class CarvedPumpkinMixin extends HorizontalDirectionalBlock {
    @Shadow @Final
    private static Predicate<BlockState> PUMPKINS_PREDICATE;
    private static Predicate<BlockState> PACKED_SLIME_PREDICATE;
    private BlockPattern slimeGolemFull;

    protected CarvedPumpkinMixin(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Shadow
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }

    @Inject(at = @At("HEAD"), method = "trySpawnGolem")
    private void trySpawnGolem(Level level, BlockPos blockPos, CallbackInfo ci) {
        muffins_slimegolem$spawnSlimeGolem(level, blockPos);
    }


    @Unique
    private void muffins_slimegolem$spawnSlimeGolem(Level level, BlockPos blockPos){
        BlockPattern.BlockPatternMatch blockPatternMatch = this.muffins_slimegolem$getOrCreateSlimeGolemFull().find(level, blockPos);
        int i;
        int j;
        if (blockPatternMatch != null) {
            for(i = 0; i < this.muffins_slimegolem$getOrCreateSlimeGolemFull().getHeight(); ++i) {
                BlockInWorld blockInWorld = blockPatternMatch.getBlock(0, i, 0);
                level.setBlock(blockInWorld.getPos(), Blocks.AIR.defaultBlockState(), 2);
                level.levelEvent(2001, blockInWorld.getPos(), Block.getId(blockInWorld.getState()));
            }

            SlimeGolemEntity slimeGolemEntity = ModEntityTypes.SLIME_GOLEM.get().create(level);
            BlockState blockState = blockPatternMatch.getBlock(0,1,0).getState();


            BlockPos blockPos2 = blockPatternMatch.getBlock(0, 1, 0).getPos();
            slimeGolemEntity.moveTo((double)blockPos2.getX() + 0.5D, (double)blockPos2.getY() + 0.05D, (double)blockPos2.getZ() + 0.5D, 0.0F, 0.0F);
            level.addFreshEntity(slimeGolemEntity);


            for(j = 0; j < this.muffins_slimegolem$getOrCreateSlimeGolemFull().getHeight(); ++j) {
                BlockInWorld blockInWorld2 = blockPatternMatch.getBlock(0, j, 0);
                level.blockUpdated(blockInWorld2.getPos(), Blocks.AIR);
            }
        }
    }

    @Unique
    private BlockPattern muffins_slimegolem$getOrCreateSlimeGolemFull() {
        if (this.slimeGolemFull == null) {
            this.slimeGolemFull = BlockPatternBuilder.start().aisle("^", "#").where('^', BlockInWorld.hasState(PUMPKINS_PREDICATE)).where('#', BlockInWorld.hasState(PACKED_SLIME_PREDICATE)).build();
        }
        return this.slimeGolemFull;
    }

    static {
        PACKED_SLIME_PREDICATE = (blockState) -> blockState != null && (blockState.is(ModBlockTags.SLIME_GOLEM_BLOCKS));
    }

}