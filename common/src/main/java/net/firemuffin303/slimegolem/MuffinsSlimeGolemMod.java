package net.firemuffin303.slimegolem;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import mezz.jei.api.recipe.RecipeType;
import net.firemuffin303.slimegolem.common.SlimeChunkPlacement;
import net.firemuffin303.slimegolem.common.integration.category.CursedSlimeSoulRecipeDummy;
import net.firemuffin303.slimegolem.common.integration.category.SlimeDanceRecipeDummy;
import net.firemuffin303.slimegolem.common.registry.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

import java.util.function.Supplier;

public class MuffinsSlimeGolemMod {
    public static final String MOD_ID = "muffins_slimegolem";
    public static final RecipeType<SlimeDanceRecipeDummy> SLIME_DANCING = RecipeType.create(MuffinsSlimeGolemMod.MOD_ID,"slime_dance",SlimeDanceRecipeDummy.class);
    public static final RecipeType<CursedSlimeSoulRecipeDummy> CURSED_SLIME_SOUL = RecipeType.create(MuffinsSlimeGolemMod.MOD_ID,"cursed_slime_soul",CursedSlimeSoulRecipeDummy.class);

    public static final ResourceKey<JukeboxSong> BOUNCY_SLIME = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"bouncyslime"));
    public static final ResourceKey<ConfiguredFeature<?,?>> SLIME_ALGAE_FEATURE = ResourceKey.create(Registries.CONFIGURED_FEATURE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"slime_algae_feature"));
    public static final ResourceKey<PlacedFeature> SLIME_ALGAE_PLACED_FEATURE = ResourceKey.create(Registries.PLACED_FEATURE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"slime_algae_placed_feature"));



    public static void init() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        ModSoundEvents.init();
        ModLootTables.init();
        ModBlock.init();
        ModEntityTypes.init();
        ModItem.init();
        ModItemTags.init();
        ModBlockTags.init();
        ModParticleTypes.init();
        SlimeChunkPlacement.init();


    }

    public static void displayItem(CreativeModeTab.ItemDisplayParameters itemDisplayParameters, CreativeModeTab.Output output){
        output.accept(ModItem.SLIME_PIE.get());
        output.accept(ModItem.SLIME_GOLEM_SPAWN_EGG.get());
        output.accept(ModItem.MUSIC_DISC_BOUNCYSLIME.get());
        output.accept(ModItem.SLIME_ALGAE.get());

        output.accept(ModItem.PACKED_SLIME_BLOCK.get());
        output.accept(ModItem.PACKED_SLIME_STAIR.get());
        output.accept(ModItem.PACKED_SLIME_SLAB.get());
        output.accept(ModItem.PACKED_SLIME_WALL.get());
        output.accept(ModItem.PACKED_SLIME_BRICKS.get());
        output.accept(ModItem.CHISELED_PACKED_SLIME_BLOCK.get());
        output.accept(ModItem.PACKED_SLIME_BRICK_SLAB.get());
        output.accept(ModItem.PACKED_SLIME_BRICK_STAIR.get());
        output.accept(ModItem.PACKED_SLIME_BRICK_WALL.get());

    }

}
