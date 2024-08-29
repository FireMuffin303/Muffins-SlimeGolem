package net.firemuffin303.slimegolem.common.integration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.helpers.IModIdHelper;
import mezz.jei.api.registration.IRecipeRegistration;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

@JeiPlugin
public class JEIIntegration implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"jei");
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(new ItemStack(ModItem.SLIME_PIE.get()), VanillaTypes.ITEM_STACK, Component.translatable("jei.muffins_slimegolem.info.slime_pie"));
    }
}
