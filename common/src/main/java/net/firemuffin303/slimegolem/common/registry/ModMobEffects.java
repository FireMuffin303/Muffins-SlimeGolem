package net.firemuffin303.slimegolem.common.registry;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.common.ModMobEffect;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

import java.util.function.Supplier;

public class ModMobEffects {
    public static final Supplier<Holder<MobEffect>> BOUNCE = ModPlatform.registerEffect("bounce",() -> new ModMobEffect(MobEffectCategory.BENEFICIAL,0x73c262, ModParticleTypes.BOUNCE_EFFECT.get()));

    public static void init(){}
}
