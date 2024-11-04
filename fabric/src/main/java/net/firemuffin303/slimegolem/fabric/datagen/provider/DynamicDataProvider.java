package net.firemuffin303.slimegolem.fabric.datagen.provider;

import com.mojang.logging.LogUtils;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.firemuffin303.slimegolem.ModSoundEvents;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.SlimeChunkPlacement;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.MultifaceGrowthConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DynamicDataProvider extends FabricDynamicRegistryProvider {
    public DynamicDataProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        entries.add(MuffinsSlimeGolemMod.BOUNCY_SLIME,new JukeboxSong(ModSoundEvents.MUSIC_DISC_BOUNCYSLIME.get(), Component.translatable(Util.makeDescriptionId("jukebox_song",MuffinsSlimeGolemMod.BOUNCY_SLIME.location())),134,7));

        entries.add(registries.lookupOrThrow(Registries.CONFIGURED_FEATURE),MuffinsSlimeGolemMod.SLIME_ALGAE_FEATURE);
        entries.add(registries.lookupOrThrow(Registries.PLACED_FEATURE),MuffinsSlimeGolemMod.SLIME_ALGAE_PLACED_FEATURE);

        /*
        Holder<ConfiguredFeature<?,?>> holder = entries.add(MuffinsSlimeGolemMod.SLIME_ALGAE_FEATURE, new ConfiguredFeature<>(Feature.MULTIFACE_GROWTH,new MultifaceGrowthConfiguration((MultifaceBlock) ModBlock.SLIME_ALGAE.get(),20,true,true,true,0.5f, HolderSet.direct(Block::builtInRegistryHolder,new Block[]{
                Blocks.STONE,
                Blocks.ANDESITE,
                Blocks.DIORITE,
                Blocks.GRANITE,
                Blocks.DRIPSTONE_BLOCK,
                Blocks.CALCITE,
                Blocks.TUFF,
                Blocks.DEEPSLATE,
                Blocks.MOSS_BLOCK,
                Blocks.CLAY
        }))));

        //Holder<ConfiguredFeature<?,?>> featureHolder = Holder.Reference.createStandAlone(registries.lookupOrThrow(Registries.CONFIGURED_FEATURE),MuffinsSlimeGolemMod.SLIME_ALGAE_FEATURE);


        entries.add(MuffinsSlimeGolemMod.SLIME_ALGAE_PLACED_FEATURE,new PlacedFeature(holder,
                List.of(
                        RarityFilter.onAverageOnceEvery(100),
                        InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(),VerticalAnchor.absolute(40)),
                        SlimeChunkPlacement.placement()
                )));

         */
    }

    @Override
    public String getName() {
        return MuffinsSlimeGolemMod.MOD_ID+"_dynamicProvider";
    }


}
