package net.firemuffin303.slimegolem.common.integration.category;

import com.mojang.blaze3d.vertex.PoseStack;
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
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.firemuffin303.slimegolem.common.registry.ModBlockTags;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.FormattedCharSequence;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;

import java.util.List;

public class CursedSlimeSoulRecipeCategory implements IRecipeCategory<CursedSlimeSoulRecipeDummy> {
    private final BlockState SOUL_CAMPFIRE = Blocks.SOUL_CAMPFIRE.defaultBlockState();
    private final BakedModel SOUL_CAMPFIRE_MODEL = Minecraft.getInstance().getBlockRenderer().getBlockModel(SOUL_CAMPFIRE);
    private final BakedModel PACKED_SLIME_BLOCK_MODEL = Minecraft.getInstance().getBlockRenderer().getBlockModel(ModBlock.PACKED_SLIME_BLOCK.get().defaultBlockState());
    private final ResourceLocation CONTAINER_LOCATION = ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"textures/gui/jei/cursed_slime_soul_campfire.png");


    private final IDrawable icon;
    private final IDrawable background;
    private final Component TITLE = Component.translatable("jei.muffins_slimegolem.cursed_slime_soul_fire.title");
    private final List<ItemStack> itemStacks;
    private final List<FormattedCharSequence> formattedCharSequences;
    //private final List<BlockState> blockStates;

    public CursedSlimeSoulRecipeCategory(IGuiHelper iGuiHelper){
        this.icon = iGuiHelper.createDrawableItemStack(new ItemStack(ModBlock.PACKED_SLIME_BLOCK.get()));
        this.background = iGuiHelper.createDrawable(CONTAINER_LOCATION,0,0,154,65);
        var blocks = BuiltInRegistries.BLOCK.stream().filter(block -> block.defaultBlockState().is(ModBlockTags.PACKED_SLIME_BLOCK)).toList();
        this.itemStacks = blocks.stream().map(block -> new ItemStack(block.asItem())).toList();
        this.formattedCharSequences = Minecraft.getInstance().font.split(Component.translatable("jei.muffins_slimegolem.cursed_slime_soul_fire.description"),102);
        //this.blockStates = blocks.stream().map(Block::defaultBlockState).toList();
    }



    @Override
    public RecipeType<CursedSlimeSoulRecipeDummy> getRecipeType() {
        return MuffinsSlimeGolemMod.CURSED_SLIME_SOUL;
    }

    @Override
    public Component getTitle() {
        return this.TITLE;
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
    public void setRecipe(IRecipeLayoutBuilder builder, CursedSlimeSoulRecipeDummy recipe, IFocusGroup focuses) {
        builder.addInvisibleIngredients(RecipeIngredientRole.INPUT).addItemStack(new ItemStack(Items.SOUL_CAMPFIRE));
        builder.addInvisibleIngredients(RecipeIngredientRole.INPUT).addItemStacks(this.itemStacks);
        builder.addInvisibleIngredients(RecipeIngredientRole.OUTPUT).addItemStack(new ItemStack(Items.SOUL_CAMPFIRE));
        builder.addInvisibleIngredients(RecipeIngredientRole.OUTPUT).addItemStacks(this.itemStacks);

    }

    @Override
    public void draw(CursedSlimeSoulRecipeDummy recipe, IRecipeSlotsView recipeSlotsView, GuiGraphics guiGraphics, double mouseX, double mouseY) {
        PoseStack poseStack = guiGraphics.pose();
        poseStack.pushPose();
        poseStack.scale(20,20,20);
        poseStack.translate(0.5,0.7,-1);
        poseStack.rotateAround(new Quaternionf().rotateXYZ(0.23633232F, -2.7F, 3.1415927F),1,1,1);

        Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(
                guiGraphics.pose().last(),
                guiGraphics.bufferSource().getBuffer(Sheets.cutoutBlockSheet()),
                ModBlock.PACKED_SLIME_BLOCK.get().defaultBlockState(), this.PACKED_SLIME_BLOCK_MODEL,1,1,1, LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();

        poseStack.pushPose();

        poseStack.scale(20,20,20);
        poseStack.translate(0.5,-0.3,0);
        poseStack.rotateAround(new Quaternionf().rotateXYZ(0.23633232F, -2.7F, 3.1415927F),1,1,1);
        Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(
                guiGraphics.pose().last(),
                guiGraphics.bufferSource().getBuffer(Sheets.cutoutBlockSheet()),
                SOUL_CAMPFIRE,SOUL_CAMPFIRE_MODEL,1,1,1, LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY);
        poseStack.popPose();

        int y = 6;
        for (FormattedCharSequence formattedText: this.formattedCharSequences){
            guiGraphics.drawString(Minecraft.getInstance().font, formattedText,50,y,0x252525,false);
            y += 12;
        }

    }

    @Override
    public void getTooltip(ITooltipBuilder tooltip, CursedSlimeSoulRecipeDummy recipe, IRecipeSlotsView recipeSlotsView, double mouseX, double mouseY) {

    }
}
