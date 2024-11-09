package net.firemuffin303.slimegolem.common.integration;

import com.google.common.collect.ImmutableList;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
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
    public static final RecipeType<SlimeDanceRecipeDummy> SLIME_DANCING = RecipeType.create(MuffinsSlimeGolemMod.MOD_ID,"slime_dance",SlimeDanceRecipeDummy.class);
    public static final RecipeType<CursedSlimeSoulRecipeDummy> CURSED_SLIME_SOUL = RecipeType.create(MuffinsSlimeGolemMod.MOD_ID,"cursed_slime_soul",CursedSlimeSoulRecipeDummy.class);


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
        registration.addRecipes(SLIME_DANCING, ImmutableList.of(new SlimeDanceRecipeDummy()));
        registration.addRecipes(CURSED_SLIME_SOUL, ImmutableList.of(new CursedSlimeSoulRecipeDummy()));

    }
}
