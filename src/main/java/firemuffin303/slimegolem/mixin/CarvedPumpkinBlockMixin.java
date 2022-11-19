package firemuffin303.slimegolem.mixin;

import firemuffin303.slimegolem.block.ModBlocks;
import firemuffin303.slimegolem.entity.ModEntity;
import firemuffin303.slimegolem.entity.SlimeGolemEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarvedPumpkinBlock;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.item.Wearable;
import net.minecraft.predicate.block.BlockStatePredicate;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Predicate;

@Mixin(CarvedPumpkinBlock.class)
public class CarvedPumpkinBlockMixin extends HorizontalFacingBlock implements Wearable {
    private static final Predicate<BlockState> IS_GOLEM_HEAD_PREDICATE;
    private BlockPattern tuffGolemPattern;
    protected CarvedPumpkinBlockMixin(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.NORTH));
    }

    @Inject(method = "trySpawnEntity",at = @At("HEAD"))
    private void trySpawnEntity(World world, BlockPos pos, CallbackInfo ci){
        BlockPattern.Result result = getSlimeGolemPattern().searchAround(world,pos);
        if (result != null){
            for(int i = 0; i < this.getSlimeGolemPattern().getHeight(); ++i){
                CachedBlockPosition cachedBlockPosition = result.translate(0,i,0);
                world.setBlockState(cachedBlockPosition.getBlockPos(),Blocks.AIR.getDefaultState(),2);
            }

            SlimeGolemEntity slimeGolemEntity = ModEntity.SLIME_GOLEM.create(world);
            BlockPos blockPos = result.translate(0,1,0).getBlockPos();
            slimeGolemEntity.refreshPositionAndAngles((double) blockPos.getX()+0.5D,(double) blockPos.getY()+0.05D,(double) blockPos.getZ()+0.5D,0.0F,0.0F);
            world.spawnEntity(slimeGolemEntity);

            for(int j = 0; j < this.getSlimeGolemPattern().getHeight(); ++j) {
                CachedBlockPosition cachedBlockPosition2 = result.translate(0, j, 0);
                world.updateNeighbors(cachedBlockPosition2.getBlockPos(), Blocks.AIR);
            }
        }

    }

    private BlockPattern getSlimeGolemPattern() {
        if (this.tuffGolemPattern == null) {
            this.tuffGolemPattern = BlockPatternBuilder.start().aisle(new String[]{"^", "#"}).where('^', CachedBlockPosition.matchesBlockState(IS_GOLEM_HEAD_PREDICATE)).where('#',CachedBlockPosition.matchesBlockState(BlockStatePredicate.forBlock(ModBlocks.PACKED_SLIME_BLOCK))).build();
        }

        return this.tuffGolemPattern;
    }

    static{
        IS_GOLEM_HEAD_PREDICATE = (state) -> {
            return state != null && (state.isOf(Blocks.CARVED_PUMPKIN) || state.isOf(Blocks.JACK_O_LANTERN));
        };
    }
}
