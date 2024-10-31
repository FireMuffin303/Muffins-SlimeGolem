package net.firemuffin303.slimegolem.common.integration.category;

import com.google.common.collect.ImmutableList;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.builder.ITooltipBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

import java.util.Collections;
import java.util.List;

public class SlimeDanceRecipeCategory implements IRecipeCategory<SlimeDanceRecipeDummy> {
    private final ResourceLocation CONTAINER_LOCATION = ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"textures/gui/jei/slime_dance.png");

    private final Component title;
    private final IDrawable icon;
    private final IDrawable background;
    SlimeGolemEntity slimeGolemEntity;

    public SlimeDanceRecipeCategory(IGuiHelper iGuiHelper){
        this.title = Component.translatable("jei.muffins_slimegolem.slime_dance.title");
        this.icon = iGuiHelper.createDrawableItemStack(new ItemStack(ModItem.SLIME_PIE.get()));
        this.background = iGuiHelper.createDrawable(this.CONTAINER_LOCATION,0,0,154,65);

        this.slimeGolemEntity = new SlimeGolemEntity(ModEntityTypes.SLIME_GOLEM.get(),Minecraft.getInstance().level);
        this.slimeGolemEntity.setDancing(true);

    }

    @Override
    public RecipeType<SlimeDanceRecipeDummy> getRecipeType() {
        return MuffinsSlimeGolemMod.SLIME_DANCING;
    }

    @Override
    public Component getTitle() {
        return this.title;
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public @Nullable IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, SlimeDanceRecipeDummy recipe, IFocusGroup focuses) {
            builder.addSlot(RecipeIngredientRole.INPUT,14,8).addItemStack(new ItemStack(ModItem.SLIME_PIE.get()));
        builder.addSlot(RecipeIngredientRole.RENDER_ONLY,35,40).addItemStack(new ItemStack(Blocks.JUKEBOX));
        builder.addSlot(RecipeIngredientRole.OUTPUT,124,8).addItemStack(new ItemStack(ModItem.MUSIC_DISC_BOUNCYSLIME.get()));
    }

    @Override
    public void draw(SlimeDanceRecipeDummy recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        InventoryScreen.renderEntityInInventory(guiGraphics,76,45,25.0f,new Vector3f(),new Quaternionf().rotationXYZ(0.23633232F, -2.7F, 3.1415927F),null,this.slimeGolemEntity);

    }


    @Override
    public void getTooltip(ITooltipBuilder tooltip, SlimeDanceRecipeDummy recipe, IRecipeSlotsView recipeSlotsView, double mouseX, double mouseY) {
        if((34 <= mouseX && 25 <= mouseY && mouseX < 35+18 && mouseY < 25+14) || (60 <= mouseX && 8 <= mouseY && mouseX < 60+34 && mouseY < 60+48)){
            tooltip.add(Component.translatable("jei."+MuffinsSlimeGolemMod.MOD_ID+".slime_dance.music"));
        }
    }
}
