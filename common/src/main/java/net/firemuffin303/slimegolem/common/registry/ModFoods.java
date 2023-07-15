package net.firemuffin303.slimegolem.common.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SLIME_PIE = new FoodProperties.Builder().nutrition(2).saturationMod(2).effect(new MobEffectInstance(MobEffects.CONFUSION,200,0),1.0F).build();

}
