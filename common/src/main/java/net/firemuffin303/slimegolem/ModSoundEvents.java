package net.firemuffin303.slimegolem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class ModSoundEvents {
    public static final Supplier<SoundEvent> MUSIC_DISC_BOUNCYSLIME = ModPlatform.registerSoundEvent("music_disc.bouncyslime",() -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"music_disc.bouncyslime")));
    public static void init(){}
}
