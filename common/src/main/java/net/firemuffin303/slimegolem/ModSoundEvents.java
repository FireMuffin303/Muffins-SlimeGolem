package net.firemuffin303.slimegolem;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.client.sounds.SoundEngine;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class ModSoundEvents {
    public static final ResourcefulRegistry<SoundEvent> SOUND_EVENT = ResourcefulRegistries.create(BuiltInRegistries.SOUND_EVENT,MuffinsSlimeGolemMod.MOD_ID);

    public static final RegistryEntry<SoundEvent> MUSIC_DISC_BOUNCYSLIME = SOUND_EVENT.register("music_disc.bouncyslime",() -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"music_disc.bouncyslime")));
    public static void init(){}
}
