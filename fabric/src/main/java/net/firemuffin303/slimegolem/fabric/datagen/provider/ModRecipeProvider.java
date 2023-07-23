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

        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.PACKED_SLIME_BRICKS,1,exporter);
        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.PACKED_SLIME_SLAB,2,exporter);
        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.PACKED_SLIME_STAIR,1,exporter);
        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.PACKED_SLIME_WALL,1,exporter);
        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.PACKED_SLIME_BLOCK,ModItem.PACKED_SLIME_BRICK_WALL,1,exporter);

        stonecut(ModItem.PACKED_SLIME_BRICKS,ModItem.CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.PACKED_SLIME_BRICKS,ModItem.PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.PACKED_SLIME_BRICKS,ModItem.PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.PACKED_SLIME_BRICKS,ModItem.PACKED_SLIME_BRICK_WALL,1,exporter);


        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_PACKED_SLIME_BRICKS,1,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_PACKED_SLIME_SLAB,2,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_PACKED_SLIME_STAIR,1,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_PACKED_SLIME_WALL,1,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BLOCK,ModItem.WHITE_PACKED_SLIME_BRICK_WALL,1,exporter);

        stonecut(ModItem.WHITE_PACKED_SLIME_BRICKS,ModItem.WHITE_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BRICKS,ModItem.WHITE_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BRICKS,ModItem.WHITE_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.WHITE_PACKED_SLIME_BRICKS,ModItem.WHITE_PACKED_SLIME_BRICK_WALL,1,exporter);


        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_PACKED_SLIME_BRICKS,1,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_PACKED_SLIME_SLAB,2,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_PACKED_SLIME_STAIR,1,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_PACKED_SLIME_WALL,1,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BLOCK,ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL,1,exporter);

        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BRICKS,ModItem.LIGHT_GRAY_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BRICKS,ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BRICKS,ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.LIGHT_GRAY_PACKED_SLIME_BRICKS,ModItem.LIGHT_GRAY_PACKED_SLIME_BRICK_WALL,1,exporter);

        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_PACKED_SLIME_BRICKS,1,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_PACKED_SLIME_SLAB,2,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_PACKED_SLIME_STAIR,1,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_PACKED_SLIME_WALL,1,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BLOCK,ModItem.GRAY_PACKED_SLIME_BRICK_WALL,1,exporter);

        stonecut(ModItem.GRAY_PACKED_SLIME_BRICKS,ModItem.GRAY_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BRICKS,ModItem.GRAY_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BRICKS,ModItem.GRAY_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.GRAY_PACKED_SLIME_BRICKS,ModItem.GRAY_PACKED_SLIME_BRICK_WALL,1,exporter);


        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_PACKED_SLIME_BRICKS,1,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_PACKED_SLIME_SLAB,2,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_PACKED_SLIME_STAIR,1,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_PACKED_SLIME_WALL,1,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BLOCK,ModItem.BLACK_PACKED_SLIME_BRICK_WALL,1,exporter);

        stonecut(ModItem.BLACK_PACKED_SLIME_BRICKS,ModItem.BLACK_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BRICKS,ModItem.BLACK_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BRICKS,ModItem.BLACK_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.BLACK_PACKED_SLIME_BRICKS,ModItem.BLACK_PACKED_SLIME_BRICK_WALL,1,exporter);


        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_PACKED_SLIME_BRICKS,1,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_PACKED_SLIME_SLAB,2,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_PACKED_SLIME_STAIR,1,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_PACKED_SLIME_WALL,1,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BLOCK,ModItem.ORANGE_PACKED_SLIME_BRICK_WALL,1,exporter);

        stonecut(ModItem.ORANGE_PACKED_SLIME_BRICKS,ModItem.ORANGE_CHISELED_PACKED_SLIME_BLOCK,1,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BRICKS,ModItem.ORANGE_PACKED_SLIME_BRICK_SLAB,2,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BRICKS,ModItem.ORANGE_PACKED_SLIME_BRICK_STAIR,1,exporter);
        stonecut(ModItem.ORANGE_PACKED_SLIME_BRICKS,ModItem.ORANGE_PACKED_SLIME_BRICK_WALL,1,exporter);
    }

    private void coloredBlock(Item item,Item baseMaterial,Item colorDye, Consumer<FinishedRecipe> consumer){
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, item,8)
                .define('A',baseMaterial).define('B',colorDye)
                .pattern("AAA").pattern("ABA").pattern("AAA").group("packed_slime_block").unlockedBy(getHasName(baseMaterial),has(baseMaterial)).save(consumer);

    }



    private void stonecut(RegistryEntry<Item> ingredient, RegistryEntry<Item> result, int i, Consumer<FinishedRecipe> consumer){
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient.get()),RecipeCategory.DECORATIONS,result.get(),i).unlockedBy(getHasName(ingredient.get()),has(ingredient.get())).save(consumer,result.getId().withSuffix("_from_%s_stonecutting".formatted(ingredient.getId().getPath())));

    }
}
