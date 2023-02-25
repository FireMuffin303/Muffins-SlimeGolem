package net.firemuffin303.slimegolem.fabric;


import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.firemuffin303.slimegolem.fabric.utils.ModFabricConfig;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class ModPlatformImpl {


    public static void registerRenderLayer(Supplier<Block> blockSupplier, RenderType renderType) {
        BlockRenderLayerMap.INSTANCE.putBlock(blockSupplier.get(),renderType);
    }

    public static <T extends Entity> void registerEntityRenderer(Supplier<EntityType<T>> entityTypeSupplier, EntityRendererProvider<T> entityRendererProvider) {
        EntityRendererRegistry.register(entityTypeSupplier.get(),entityRendererProvider);
    }

    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier) {
        T register = Registry.register(Registry.ITEM,new ResourceLocation(SlimeGolemMod.MOD_ID,id),supplier.get());
        return () -> register;
    }

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier) {
        T register = Registry.register(Registry.BLOCK, new ResourceLocation(SlimeGolemMod.MOD_ID,id),supplier.get());
        return () -> register;
    }

    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String id, Supplier<EntityType<T>> supplier) {
        EntityType<T> register = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(SlimeGolemMod.MOD_ID,id),supplier.get());
        return () -> register;
    }

    public static CreativeModeTab registerCreativeTab(ResourceLocation resourceLocation, Supplier<ItemStack> icon) {
        return FabricItemGroupBuilder.build(resourceLocation,() -> icon.get());
    }

    public static <T extends Block> TagKey<T> registerBlockTag(ResourceKey<Registry<T>> blockRegistry, String id) {
        return TagKey.create(blockRegistry,new ResourceLocation(SlimeGolemMod.MOD_ID,id));
    }

    public static <T extends Item> TagKey<T> registerItemTag(ResourceKey<Registry<T>> itemRegistry, String id) {
        return TagKey.create(itemRegistry,new ResourceLocation(SlimeGolemMod.MOD_ID,id));
    }

    public static Supplier<SoundEvent> registerSoundEvent(String id) {
        SoundEvent soundEvent = Registry.register(Registry.SOUND_EVENT,id,new SoundEvent(new ResourceLocation(SlimeGolemMod.MOD_ID,id)));
        return () -> soundEvent;
    }

    public static boolean getShowHoneyLayer() {
        return SlimeGolemModFabric.CONFIG.client.showHoneyLayerOnSlimeGolem;
    }

    public static ResourceLocation registerLootTable(ResourceLocation resourceLocation) {
        return resourceLocation;
    }


}
