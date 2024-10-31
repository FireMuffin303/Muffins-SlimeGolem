package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;

import java.util.function.Supplier;

public class ModParticleTypes {

    public static final Supplier<SimpleParticleType> CURSED_SLIME_SOUL = ModPlatform.registerParticleType("cursed_slime_soul",true);

    public static void init() {

    }
}
