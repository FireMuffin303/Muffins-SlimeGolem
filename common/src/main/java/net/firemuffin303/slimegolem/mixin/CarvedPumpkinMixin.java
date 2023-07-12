package net.firemuffin303.slimegolem.mixin;

import net.firemuffin303.slimegolem.registry.block.ModBlock;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.firemuffin303.slimegolem.registry.entity.SlimeGolemEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Equipable;
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
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

@Mixin(CarvedPumpkinBlock.class)
public class CarvedPumpkinMixin extends HorizontalDirectionalBlock implements Equipable {
    @Shadow @Final
    private static Predicate<BlockState> PUMPKINS_PREDICATE;
    private static Predicate<BlockState> PACKED_SLIME_PREDICATE;
    private BlockPattern slimeGolemFull;

    protected CarvedPumpkinMixin(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Inject(method = "trySpawnGolem",at = @At("HEAD"))
    private void trySpawnGolem(Level level, BlockPos blockPos, CallbackInfo ci) {
        spawnSlimeGolem(level, blockPos);
    }


    private void spawnSlimeGolem(Level level,BlockPos blockPos){
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
            BlockState blockState = blockPatternMatch.getBlock(0,1,0).getState();

            byte color = getPackedSlimeBlock().get(blockState.getBlock());

            BlockPos blockPos2 = blockPatternMatch.getBlock(0, 1, 0).getPos();
            slimeGolemEntity.moveTo((double)blockPos2.getX() + 0.5D, (double)blockPos2.getY() + 0.05D, (double)blockPos2.getZ() + 0.5D, 0.0F, 0.0F);
            slimeGolemEntity.setColor(DyeColor.byId(color));
            level.addFreshEntity(slimeGolemEntity);


            for(j = 0; j < this.getOrCreateSlimeGolemFull().getHeight(); ++j) {
                BlockInWorld blockInWorld2 = blockPatternMatch.getBlock(0, j, 0);
                level.blockUpdated(blockInWorld2.getPos(), Blocks.AIR);
            }
        }
    }

    private BlockPattern getOrCreateSlimeGolemFull() {
        if (this.slimeGolemFull == null) {
            this.slimeGolemFull = BlockPatternBuilder.start().aisle(new String[]{"^", "#"}).where('^', BlockInWorld.hasState(PUMPKINS_PREDICATE)).where('#', BlockInWorld.hasState(PACKED_SLIME_PREDICATE)).build();
        }
        return this.slimeGolemFull;
    }

    private Map<Block,Byte> getPackedSlimeBlock(){
        Map<Block,Byte> packedSlimeBlock = new HashMap<>();
        packedSlimeBlock.put(ModBlock.WHITE_PACKED_SLIME_BLOCK.get(), (byte) 0);
        packedSlimeBlock.put(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get(), (byte) 1);
        packedSlimeBlock.put(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get(), (byte) 2);
        packedSlimeBlock.put(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(), (byte) 3);
        packedSlimeBlock.put(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get(), (byte) 4);
        packedSlimeBlock.put(ModBlock.LIME_PACKED_SLIME_BLOCK.get(), (byte) 5);
        packedSlimeBlock.put(ModBlock.PACKED_SLIME_BLOCK.get(), (byte) 5);
        packedSlimeBlock.put(ModBlock.PINK_PACKED_SLIME_BLOCK.get(), (byte) 6);
        packedSlimeBlock.put(ModBlock.GRAY_PACKED_SLIME_BLOCK.get(), (byte) 7);
        packedSlimeBlock.put(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(), (byte) 8);
        packedSlimeBlock.put(ModBlock.CYAN_PACKED_SLIME_BLOCK.get(), (byte) 9);
        packedSlimeBlock.put(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get(), (byte) 10);
        packedSlimeBlock.put(ModBlock.BLUE_PACKED_SLIME_BLOCK.get(), (byte) 11);
        packedSlimeBlock.put(ModBlock.BROWN_PACKED_SLIME_BLOCK.get(), (byte) 12);
        packedSlimeBlock.put(ModBlock.GREEN_PACKED_SLIME_BLOCK.get(), (byte) 13);
        packedSlimeBlock.put(ModBlock.RED_PACKED_SLIME_BLOCK.get(), (byte) 14);
        packedSlimeBlock.put(ModBlock.BLACK_PACKED_SLIME_BLOCK.get(), (byte) 15);
        return packedSlimeBlock;
    }

    static {
        PACKED_SLIME_PREDICATE = (blockState) -> {
          return blockState != null && (blockState.is(ModBlock.PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.WHITE_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.ORANGE_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.MAGENTA_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.LIGHT_BLUE_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.YELLOW_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.LIME_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.PINK_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.GRAY_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.LIGHT_GRAY_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.CYAN_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.PURPLE_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.BLUE_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.BROWN_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.GREEN_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.RED_PACKED_SLIME_BLOCK.get()) ||
                  blockState.is(ModBlock.BLACK_PACKED_SLIME_BLOCK.get()));
        };
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.HEAD;
    }
}