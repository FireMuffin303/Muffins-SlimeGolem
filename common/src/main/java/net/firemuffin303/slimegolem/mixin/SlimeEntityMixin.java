package net.firemuffin303.slimegolem.mixin;

import net.firemuffin303.slimegolem.common.registry.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.ai.village.poi.PoiManager;
import net.minecraft.world.entity.ai.village.poi.PoiRecord;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CampfireBlock;
import net.minecraft.world.level.chunk.ChunkAccess;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

@Mixin(Slime.class)
public abstract class SlimeEntityMixin {

    @Inject(method = "checkSlimeSpawnRules",at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/LevelAccessor;getDifficulty()Lnet/minecraft/world/Difficulty;"), cancellable = true)
    private static void muffin_slimegolem$checkSlimeSpawnRules(EntityType<Slime> entityType, LevelAccessor levelAccessor, MobSpawnType mobSpawnType, BlockPos blockPos, RandomSource randomSource, CallbackInfoReturnable<Boolean> cir){
        ChunkAccess chunkAccess = levelAccessor.getChunk(blockPos);
        AtomicBoolean bl = new AtomicBoolean(false);
        chunkAccess.findBlocks(blockState -> blockState.is(Blocks.SOUL_CAMPFIRE) && blockState.getValue(CampfireBlock.LIT),(blockPos1, blockState) -> {
            bl.set(levelAccessor.getBlockState(blockPos1.below()).is(ModTags.PACKED_SLIME_BLOCK));
            });
        if(bl.get()){
            cir.setReturnValue(false);
        }
    }
}
