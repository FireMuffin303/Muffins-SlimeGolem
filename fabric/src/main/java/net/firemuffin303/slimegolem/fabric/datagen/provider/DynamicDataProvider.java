package net.firemuffin303.slimegolem.fabric.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.firemuffin303.slimegolem.ModSoundEvents;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.Util;
import net.minecraft.core.HolderLookup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.JukeboxSong;

import java.util.concurrent.CompletableFuture;

public class DynamicDataProvider extends FabricDynamicRegistryProvider {
    public DynamicDataProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(HolderLookup.Provider registries, Entries entries) {
        entries.add(MuffinsSlimeGolemMod.BOUNCY_SLIME,new JukeboxSong(ModSoundEvents.MUSIC_DISC_BOUNCYSLIME.get(), Component.translatable(Util.makeDescriptionId("jukebox_song",MuffinsSlimeGolemMod.BOUNCY_SLIME.location())),134,7));

    }

    @Override
    public String getName() {
        return MuffinsSlimeGolemMod.MOD_ID+"_dynamicProvider";
    }
}
