package net.firemuffin303.slimegolem.common;

import com.mojang.serialization.MapCodec;
import net.firemuffin303.slimegolem.ModPlatform;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public class SlimeChunkPlacement extends PlacementFilter {
    private static final SlimeChunkPlacement INSTANCE = new SlimeChunkPlacement();
    public static final MapCodec<SlimeChunkPlacement> CODEC = MapCodec.unit(() -> INSTANCE);

    private static final Supplier<PlacementModifierType<SlimeChunkPlacement>> SLIME_CHUNK_PLACEMENT = ModPlatform.registerPlacementType("slime_chunk",SlimeChunkPlacement.CODEC);

    public static void init() {
    }

    public SlimeChunkPlacement(){}

    public boolean isInSlimeChunk(PlacementContext placementContext,BlockPos blockPos) {
        ChunkPos chunkPos = placementContext.getLevel().getChunk(blockPos).getPos();
        return WorldgenRandom.seedSlimeChunk(chunkPos.x,chunkPos.z,placementContext.getLevel().getSeed(),987234911L).nextInt(10) == 0;
    }

    public static SlimeChunkPlacement placement(){
        return INSTANCE;
    }

    @Override
    public @NotNull PlacementModifierType<?> type() {
        return SlimeChunkPlacement.SLIME_CHUNK_PLACEMENT.get();
    }

    @Override
    protected boolean shouldPlace(PlacementContext placementContext, RandomSource randomSource, BlockPos blockPos) {
        return isInSlimeChunk(placementContext,blockPos);
    }
}
