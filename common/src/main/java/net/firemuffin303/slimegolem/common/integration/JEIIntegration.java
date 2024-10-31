package net.firemuffin303.slimegolem.common.integration;

import com.google.common.collect.ImmutableList;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.integration.category.CursedSlimeSoulRecipeCategory;
import net.firemuffin303.slimegolem.common.integration.category.CursedSlimeSoulRecipeDummy;
import net.firemuffin303.slimegolem.common.integration.category.SlimeDanceRecipeCategory;
import net.firemuffin303.slimegolem.common.integration.category.SlimeDanceRecipeDummy;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class JEIIntegration implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"jei");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new SlimeDanceRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
        registration.addRecipeCategories(new CursedSlimeSoulRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addRecipes(MuffinsSlimeGolemMod.SLIME_DANCING, ImmutableList.of(new SlimeDanceRecipeDummy()));
        registration.addRecipes(MuffinsSlimeGolemMod.CURSED_SLIME_SOUL, ImmutableList.of(new CursedSlimeSoulRecipeDummy()));

    }
}
