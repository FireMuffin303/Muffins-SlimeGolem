package net.firemuffin303.slimegolem.fabric.datagen.provider;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        coloredBlock(ModItem.WHITE_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(), Items.WHITE_DYE,exporter);
        coloredBlock(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.LIGHT_GRAY_DYE,exporter);
        coloredBlock(ModItem.GRAY_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.GRAY_DYE,exporter);
        coloredBlock(ModItem.BLACK_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.BLACK_DYE,exporter);
        coloredBlock(ModItem.BROWN_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.BROWN_DYE,exporter);
        coloredBlock(ModItem.RED_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.RED_DYE,exporter);
        coloredBlock(ModItem.ORANGE_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.ORANGE_DYE,exporter);
        coloredBlock(ModItem.YELLOW_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.YELLOW_DYE,exporter);
        coloredBlock(ModItem.LIME_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.LIME_DYE,exporter);
        coloredBlock(ModItem.GREEN_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.GREEN_DYE,exporter);
        coloredBlock(ModItem.CYAN_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.CYAN_DYE,exporter);
        coloredBlock(ModItem.LIGHT_BLUE_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.LIGHT_BLUE_DYE,exporter);
        coloredBlock(ModItem.BLUE_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.BLUE_DYE,exporter);
        coloredBlock(ModItem.PURPLE_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.PURPLE_DYE,exporter);
        coloredBlock(ModItem.MAGENTA_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.MAGENTA_DYE,exporter);
        coloredBlock(ModItem.PINK_PACKED_SLIME_BLOCK.get(),ModItem.PACKED_SLIME_BLOCK.get(),Items.PINK_DYE,exporter);

        coloredBlock(ModItem.WHITE_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(), Items.WHITE_DYE,exporter);
        coloredBlock(ModItem.LIGHT_GRAY_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.LIGHT_GRAY_DYE,exporter);
        coloredBlock(ModItem.GRAY_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.GRAY_DYE,exporter);
        coloredBlock(ModItem.BLACK_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.BLACK_DYE,exporter);
        coloredBlock(ModItem.BROWN_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.BROWN_DYE,exporter);
        coloredBlock(ModItem.RED_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.RED_DYE,exporter);
        coloredBlock(ModItem.ORANGE_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.ORANGE_DYE,exporter);
        coloredBlock(ModItem.YELLOW_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.YELLOW_DYE,exporter);
        coloredBlock(ModItem.LIME_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.LIME_DYE,exporter);
        coloredBlock(ModItem.GREEN_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.GREEN_DYE,exporter);
        coloredBlock(ModItem.CYAN_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.CYAN_DYE,exporter);
        coloredBlock(ModItem.LIGHT_BLUE_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.LIGHT_BLUE_DYE,exporter);
        coloredBlock(ModItem.BLUE_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.BLUE_DYE,exporter);
        coloredBlock(ModItem.PURPLE_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.PURPLE_DYE,exporter);
        coloredBlock(ModItem.MAGENTA_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.MAGENTA_DYE,exporter);
        coloredBlock(ModItem.PINK_PACKED_SLIME_BRICKS.get(),ModItem.PACKED_SLIME_BRICKS.get(),Items.PINK_DYE,exporter);

        /*slimeFamily(Ingredient.of(ModBlock.PACKED_SLIME_BLOCK.get()),exporter,new ItemLike[]{ModBlock.PACKED_SLIME_BRICKS.get(),
                ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),
                ModBlock.PACKED_SLIME_SLAB.get(),
                ModBlock.PACKED_SLIME_STAIR.get(),
                ModBlock.PACKED_SLIME_WALL.get(),
                ModBlock.PACKED_SLIME_BRICK_SLAB.get(),
                ModBlock.PACKED_SLIME_BRICK_STAIR.get(),
                ModBlock.PACKED_SLIME_BRICK_WALL.get()});*/

        stoneCutFamily(ModItem.PACKED_SLIME_BLOCK,
                ModItem.PACKED_SLIME_BRICKS,
                ModItem.CHISELED_PACKED_SLIME_BLOCK,
                ModItem.PACKED_SLIME_SLAB,
                ModItem.PACKED_SLIME_STAIR,
                ModItem.PACKED_SLIME_WALL,
                ModItem.PACKED_SLIME_BRICK_SLAB,
                ModItem.PACKED_SLIME_BRICK_STAIR,
                ModItem.PACKED_SLIME_BRICK_WALL,exporter);


        stoneCutFamily(ModItem.WHITE_PACKED_SLIME_BLOCK,
                ModItem.WHITE_PACKED_SLIME_BRICKS,
                ModItem.WHITE_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.WHITE_PACKED_SLIME_SLAB,
                ModItem.WHITE_PACKED_SLIME_STAIR,
                ModItem.WHITE_PACKED_SLIME_WALL,
                ModItem.WHITE_PACKED_SLIME_BRICK_SLAB,
                ModItem.WHITE_PACKED_SLIME_BRICK_STAIR,
                ModItem.WHITE_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,
                ModItem.LIGHT_GRAY_PACKED_SLIME_BRICKS,
                ModItem.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.LIGHT_GRAY_PACKED_SLIME_SLAB,
                ModItem.LIGHT_GRAY_PACKED_SLIME_STAIR,
                ModItem.LIGHT_GRAY_PACKED_SLIME_WALL,
                ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB,
                ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR,
                ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.GRAY_PACKED_SLIME_BLOCK,
                ModItem.GRAY_PACKED_SLIME_BRICKS,
                ModItem.GRAY_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.GRAY_PACKED_SLIME_SLAB,
                ModItem.GRAY_PACKED_SLIME_STAIR,
                ModItem.GRAY_PACKED_SLIME_WALL,
                ModItem.GRAY_PACKED_SLIME_BRICK_SLAB,
                ModItem.GRAY_PACKED_SLIME_BRICK_STAIR,
                ModItem.GRAY_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.BLACK_PACKED_SLIME_BLOCK,
                ModItem.BLACK_PACKED_SLIME_BRICKS,
                ModItem.BLACK_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.BLACK_PACKED_SLIME_SLAB,
                ModItem.BLACK_PACKED_SLIME_STAIR,
                ModItem.BLACK_PACKED_SLIME_WALL,
                ModItem.BLACK_PACKED_SLIME_BRICK_SLAB,
                ModItem.BLACK_PACKED_SLIME_BRICK_STAIR,
                ModItem.BLACK_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.BROWN_PACKED_SLIME_BLOCK,
                ModItem.BROWN_PACKED_SLIME_BRICKS,
                ModItem.BROWN_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.BROWN_PACKED_SLIME_SLAB,
                ModItem.BROWN_PACKED_SLIME_STAIR,
                ModItem.BROWN_PACKED_SLIME_WALL,
                ModItem.BROWN_PACKED_SLIME_BRICK_SLAB,
                ModItem.BROWN_PACKED_SLIME_BRICK_STAIR,
                ModItem.BROWN_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.RED_PACKED_SLIME_BLOCK,
                ModItem.RED_PACKED_SLIME_BRICKS,
                ModItem.RED_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.RED_PACKED_SLIME_SLAB,
                ModItem.RED_PACKED_SLIME_STAIR,
                ModItem.RED_PACKED_SLIME_WALL,
                ModItem.RED_PACKED_SLIME_BRICK_SLAB,
                ModItem.RED_PACKED_SLIME_BRICK_STAIR,
                ModItem.RED_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.ORANGE_PACKED_SLIME_BLOCK,
                ModItem.ORANGE_PACKED_SLIME_BRICKS,
                ModItem.ORANGE_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.ORANGE_PACKED_SLIME_SLAB,
                ModItem.ORANGE_PACKED_SLIME_STAIR,
                ModItem.ORANGE_PACKED_SLIME_WALL,
                ModItem.ORANGE_PACKED_SLIME_BRICK_SLAB,
                ModItem.ORANGE_PACKED_SLIME_BRICK_STAIR,
                ModItem.ORANGE_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.YELLOW_PACKED_SLIME_BLOCK,
                ModItem.YELLOW_PACKED_SLIME_BRICKS,
                ModItem.YELLOW_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.YELLOW_PACKED_SLIME_SLAB,
                ModItem.YELLOW_PACKED_SLIME_STAIR,
                ModItem.YELLOW_PACKED_SLIME_WALL,
                ModItem.YELLOW_PACKED_SLIME_BRICK_SLAB,
                ModItem.YELLOW_PACKED_SLIME_BRICK_STAIR,
                ModItem.YELLOW_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.LIME_PACKED_SLIME_BLOCK,
                ModItem.LIME_PACKED_SLIME_BRICKS,
                ModItem.LIME_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.LIME_PACKED_SLIME_SLAB,
                ModItem.LIME_PACKED_SLIME_STAIR,
                ModItem.LIME_PACKED_SLIME_WALL,
                ModItem.LIME_PACKED_SLIME_BRICK_SLAB,
                ModItem.LIME_PACKED_SLIME_BRICK_STAIR,
                ModItem.LIME_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.GREEN_PACKED_SLIME_BLOCK,
                ModItem.GREEN_PACKED_SLIME_BRICKS,
                ModItem.GREEN_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.GREEN_PACKED_SLIME_SLAB,
                ModItem.GREEN_PACKED_SLIME_STAIR,
                ModItem.GREEN_PACKED_SLIME_WALL,
                ModItem.GREEN_PACKED_SLIME_BRICK_SLAB,
                ModItem.GREEN_PACKED_SLIME_BRICK_STAIR,
                ModItem.GREEN_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.CYAN_PACKED_SLIME_BLOCK,
                ModItem.CYAN_PACKED_SLIME_BRICKS,
                ModItem.CYAN_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.CYAN_PACKED_SLIME_SLAB,
                ModItem.CYAN_PACKED_SLIME_STAIR,
                ModItem.CYAN_PACKED_SLIME_WALL,
                ModItem.CYAN_PACKED_SLIME_BRICK_SLAB,
                ModItem.CYAN_PACKED_SLIME_BRICK_STAIR,
                ModItem.CYAN_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.LIGHT_BLUE_PACKED_SLIME_BLOCK,
                ModItem.LIGHT_BLUE_PACKED_SLIME_BRICKS,
                ModItem.LIGHT_BLUE_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.LIGHT_BLUE_PACKED_SLIME_SLAB,
                ModItem.LIGHT_BLUE_PACKED_SLIME_STAIR,
                ModItem.LIGHT_BLUE_PACKED_SLIME_WALL,
                ModItem.LIGHT_BLUE_PACKED_SLIME_BRICK_SLAB,
                ModItem.LIGHT_BLUE_PACKED_SLIME_BRICK_STAIR,
                ModItem.LIGHT_BLUE_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.BLUE_PACKED_SLIME_BLOCK,
                ModItem.BLUE_PACKED_SLIME_BRICKS,
                ModItem.BLUE_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.BLUE_PACKED_SLIME_SLAB,
                ModItem.BLUE_PACKED_SLIME_STAIR,
                ModItem.BLUE_PACKED_SLIME_WALL,
                ModItem.BLUE_PACKED_SLIME_BRICK_SLAB,
                ModItem.BLUE_PACKED_SLIME_BRICK_STAIR,
                ModItem.BLUE_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.PURPLE_PACKED_SLIME_BLOCK,
                ModItem.PURPLE_PACKED_SLIME_BRICKS,
                ModItem.PURPLE_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.PURPLE_PACKED_SLIME_SLAB,
                ModItem.PURPLE_PACKED_SLIME_STAIR,
                ModItem.PURPLE_PACKED_SLIME_WALL,
                ModItem.PURPLE_PACKED_SLIME_BRICK_SLAB,
                ModItem.PURPLE_PACKED_SLIME_BRICK_STAIR,
                ModItem.PURPLE_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.MAGENTA_PACKED_SLIME_BLOCK,
                ModItem.MAGENTA_PACKED_SLIME_BRICKS,
                ModItem.MAGENTA_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.MAGENTA_PACKED_SLIME_SLAB,
                ModItem.MAGENTA_PACKED_SLIME_STAIR,
                ModItem.MAGENTA_PACKED_SLIME_WALL,
                ModItem.MAGENTA_PACKED_SLIME_BRICK_SLAB,
                ModItem.MAGENTA_PACKED_SLIME_BRICK_STAIR,
                ModItem.MAGENTA_PACKED_SLIME_BRICK_WALL,exporter);

        stoneCutFamily(
                ModItem.PINK_PACKED_SLIME_BLOCK,
                ModItem.PINK_PACKED_SLIME_BRICKS,
                ModItem.PINK_CHISELED_PACKED_SLIME_BLOCK,
                ModItem.PINK_PACKED_SLIME_SLAB,
                ModItem.PINK_PACKED_SLIME_STAIR,
                ModItem.PINK_PACKED_SLIME_WALL,
                ModItem.PINK_PACKED_SLIME_BRICK_SLAB,
                ModItem.PINK_PACKED_SLIME_BRICK_STAIR,
                ModItem.PINK_PACKED_SLIME_BRICK_WALL,exporter);
    }

    private void coloredBlock(Item item,Item baseMaterial,Item colorDye, Consumer<FinishedRecipe> consumer){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, item,8)
                .define('A',baseMaterial).define('B',colorDye)
                .pattern("AAA").pattern("ABA").pattern("AAA").group("packed_slime_block").unlockedBy(getHasName(baseMaterial),has(baseMaterial)).save(consumer);

    }



    private void stonecut(RegistryEntry<Item> ingredient, RegistryEntry<Item> result, int i, Consumer<FinishedRecipe> consumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient.get()),RecipeCategory.DECORATIONS,result.get(),i).unlockedBy(getHasName(ingredient.get()),has(ingredient.get())).save(consumer,result.getId().withSuffix("_from_%s_stonecutting".formatted(ingredient.getId().getPath())));

    }

    private void stoneCutFamily(RegistryEntry<Item> block,RegistryEntry<Item> brick,RegistryEntry<Item> chiseled,RegistryEntry<Item> slab,RegistryEntry<Item> stair,RegistryEntry<Item> wall,RegistryEntry<Item> brick_slab,RegistryEntry<Item> brick_stair,RegistryEntry<Item> brick_wall,Consumer<FinishedRecipe> exporter){
        stonecut(block,brick,1,exporter);
        stonecut(block,chiseled,1,exporter);
        stonecut(block,stair,1,exporter);
        stonecut(block,slab,2,exporter);
        stonecut(block,wall,1,exporter);
        stonecut(block,brick_slab,2,exporter);
        stonecut(block,brick_stair,1,exporter);
        stonecut(block,brick_wall,1,exporter);

        stonecut(brick,chiseled,1,exporter);
        stonecut(brick,brick_slab,2,exporter);
        stonecut(brick,brick_stair,1,exporter);
        stonecut(brick,brick_wall,1,exporter);
    }
}
