package net.firemuffin303.slimegolem.mixin;

import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.firemuffin303.slimegolem.registry.entity.SlimeGolemEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Wearable;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.pattern.BlockPattern;
import net.minecraft.world.level.block.state.pattern.BlockPatternBuilder;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Predicate;

@Mixin(CarvedPumpkinBlock.class)
public class CarvedPumpkinMixin extends HorizontalDirectionalBlock implements Wearable {
    private static final Predicate<BlockState> PUMPKINS_PREDICATE;
    private BlockPattern slimeGolemFull;

    protected CarvedPumpkinMixin(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Inject(method = "trySpawnGolem",at = @At("TAIL"))
    private void trySpawnGolem(Level level, BlockPos blockPos, CallbackInfo ci) {
        BlockPattern.BlockPatternMatch blockPatternMatch = this.getOrCreateSlimeGolemFull().find(level, blockPos);
        int i;
        int j;
        if (blockPatternMatch != null) {
            for(i = 0; i < this.getOrCreateSlimeGolemFull().getHeight(); ++i) {
                BlockInWorld blockInWorld = blockPatternMatch.getBlock(0, i, 0);
                level.setBlock(blockInWorld.getPos(), Blocks.AIR.defaultBlockState(), 2);
                level.levelEvent(2001, blockInWorld.getPos(), Block.getId(blockInWorld.getState()));
            }

            SlimeGolemEntity slimeGolemEntity = ModEntity.SLIME_GOLEM.get().create(level);
            BlockPos blockPos2 = blockPatternMatch.getBlock(0, 1, 0).getPos();
            slimeGolemEntity.moveTo((double)blockPos2.getX() + 0.5D, (double)blockPos2.getY() + 0.05D, (double)blockPos2.getZ() + 0.5D, 0.0F, 0.0F);
            level.addFreshEntity(slimeGolemEntity);


            for(j = 0; j < this.getOrCreateSlimeGolemFull().getHeight(); ++j) {
                BlockInWorld blockInWorld2 = blockPatternMatch.getBlock(0, j, 0);
                level.blockUpdated(blockInWorld2.getPos(), Blocks.AIR);
            }
        }
    }

    public boolean canSpawnGolem(LevelReader levelReader, BlockPos blockPos) {
        return this.getOrCreateSlimeGolemFull().find(levelReader, blockPos) != null;
    }

    private BlockPattern getOrCreateSlimeGolemFull() {
        if (this.slimeGolemFull == null) {
            this.slimeGolemFull = BlockPatternBuilder.start().aisle(new String[]{"^", "#"}).where('^', BlockInWorld.hasState(PUMPKINS_PREDICATE)).where('#', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlock.PACKED_SLIME_BLOCK.get()))).build();
        }

        return this.slimeGolemFull;
    }

    static {
        PUMPKINS_PREDICATE = (blockState) -> {
            return blockState != null && (blockState.is(Blocks.CARVED_PUMPKIN) || blockState.is(Blocks.JACK_O_LANTERN));
        };
    }
}