package net.firemuffin303.slimegolem;

import net.firemuffin303.slimegolem.common.SlimeChunkPlacement;
import net.firemuffin303.slimegolem.common.registry.*;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.JukeboxSong;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.function.Supplier;

public class MuffinsSlimeGolemMod {
    public static final String MOD_ID = "muffins_slimegolem";
    public static boolean isClothConfigLoaded = false;

    public static final ResourceKey<JukeboxSong> BOUNCY_SLIME = ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"bouncyslime"));
    public static final ResourceKey<ConfiguredFeature<?,?>> SLIME_ALGAE_FEATURE = ResourceKey.create(Registries.CONFIGURED_FEATURE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"slime_algae_feature"));
    public static final ResourceKey<PlacedFeature> SLIME_ALGAE_PLACED_FEATURE = ResourceKey.create(Registries.PLACED_FEATURE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,"slime_algae_placed_feature"));
    public static final ResourceKey<DamageType> SLIME_CHARGE = ResourceKey.create(Registries.DAMAGE_TYPE,ResourceLocation.fromNamespaceAndPath(MOD_ID,"slime_charge"));
    public static final ResourceKey<LootTable> INJECT_TRIAL_CHAMBERS = ResourceKey.create(Registries.LOOT_TABLE,ResourceLocation.fromNamespaceAndPath(MOD_ID,"inject/spawners/trial_chamber/items_to_drop_when_ominous"));

    public static void init() {
        ModSoundEvents.init();
        ModLootTables.init();
        ModBlock.init();
        ModEntityTypes.init();
        ModItem.init();
        ModTags.init();
        ModParticleTypes.init();
        ModMobEffects.init();
        SlimeChunkPlacement.init();
        DispenserBlock.registerProjectileBehavior(ModItem.SLIME_CHARGE.get());
    }

    public static void displayItem(CreativeModeTab.ItemDisplayParameters itemDisplayParameters, CreativeModeTab.Output output){
        output.accept(ModItem.SLIME_PIE.get());
        output.accept(ModItem.SLIME_GOLEM_SPAWN_EGG.get());
        output.accept(ModItem.MUSIC_DISC_BOUNCYSLIME.get());
        output.accept(ModItem.SLIME_ALGAE.get());
        output.accept(ModItem.SLIME_CHARGE.get());

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
