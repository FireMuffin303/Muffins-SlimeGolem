package net.firemuffin303.slimegolem.fabric;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.ModSimpleParticleType;
import net.firemuffin303.slimegolem.common.registry.ModBlockEntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class ModPlatformImpl {


    public static void registerRenderLayer(Supplier<Block> blockSupplier, RenderType renderType) {
        BlockRenderLayerMap.INSTANCE.putBlock(blockSupplier.get(),renderType);
    }

    public static <T extends Entity> void registerEntityRenderer(Supplier<EntityType<T>> entityTypeSupplier, EntityRendererProvider<T> entityRendererProvider) {
        EntityRendererRegistry.register(entityTypeSupplier.get(),entityRendererProvider);
    }

    public static <T extends Mob> Supplier<Item> registerSpawnEgg(Supplier<EntityType<T>> entityType, int primaryColor, int secondaryColor, Item.Properties properties){
        return () -> new SpawnEggItem(entityType.get(),primaryColor,secondaryColor,properties);
    }

    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String id, ModBlockEntityTypes.BlockEntitySupplier<T> blockEntityTypeSupplier, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,id),BlockEntityType.Builder.of(blockEntityTypeSupplier::create,block).build(null));
    }

    public static Supplier<Holder.Reference<SoundEvent>> registerSoundEvent(String id, Supplier<SoundEvent> event) {
        Holder.Reference<SoundEvent> soundEventReference = Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,id),event.get());
        return () -> soundEventReference;
    }

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier) {
        T block = Registry.register(BuiltInRegistries.BLOCK,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,id),supplier.get());
        return () -> block;
    }

    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item) {
        T itemvar = Registry.register(BuiltInRegistries.ITEM,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,id),item.get());
        return () -> itemvar;
    }

    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String id, Supplier<EntityType.Builder<T>> supplier) {
        EntityType<T> entityType =  Registry.register(BuiltInRegistries.ENTITY_TYPE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,id),supplier.get().build(MuffinsSlimeGolemMod.MOD_ID));
        return () -> entityType;
    }

    public static Supplier<SimpleParticleType> registerParticleType(String id,boolean bl) {
        SimpleParticleType simpleParticleType =Registry.register(BuiltInRegistries.PARTICLE_TYPE,ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID,id),new ModSimpleParticleType(bl));
        return () -> simpleParticleType;
    }

}
