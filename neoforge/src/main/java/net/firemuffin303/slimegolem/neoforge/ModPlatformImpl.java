package net.firemuffin303.slimegolem.neoforge;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;
import java.util.function.Supplier;

public class ModPlatformImpl {


    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier){
       return SlimeGolemModNeoForge.BLOCKS.register(id,supplier);
    }

    public static <T extends Item> Supplier<T> registerItem(String id,Supplier<T> supplier){
        return SlimeGolemModNeoForge.ITEMS.register(id,supplier);
    }

    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String id,Supplier<EntityType.Builder<T>> supplier){
        return SlimeGolemModNeoForge.ENTITY_TYPE.register(id,() -> supplier.get().build(MuffinsSlimeGolemMod.MOD_ID));
    }

    public static Supplier<SoundEvent> registerSoundEvent(String id, Supplier<SoundEvent> event) {
        return SlimeGolemModNeoForge.SOUND_EVENT.register(id,event);
    }

    public static void registerRenderLayer(Supplier<Block> blockSupplier, RenderType renderType) {
        ItemBlockRenderTypes.setRenderLayer(blockSupplier.get(),renderType);
    }

    public static <T extends Entity> void registerEntityRenderer(Supplier<EntityType<T>> entityTypeSupplier, EntityRendererProvider<T> entityRendererProvider) {
        EntityRenderers.register(entityTypeSupplier.get(), entityRendererProvider);
    }

    public static <T extends Mob> Supplier<Item> registerSpawnEgg(Supplier<EntityType<T>> entityType, int primaryColor, int secondaryColor, Item.Properties properties) {
        return () -> new SpawnEggItem(entityType.get(),primaryColor,secondaryColor,properties);
    }

    /*public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String id, ModBlockEntityTypes.BlockEntitySupplier<T> blockEntityTypeSupplier, Block block) {
    }*/





}
