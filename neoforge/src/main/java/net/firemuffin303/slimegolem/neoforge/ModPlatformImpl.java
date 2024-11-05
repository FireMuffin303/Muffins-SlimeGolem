package net.firemuffin303.slimegolem.neoforge;

import com.mojang.serialization.MapCodec;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.ModSimpleParticleType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
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
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.neoforged.fml.loading.FMLPaths;
import net.neoforged.neoforge.registries.DeferredHolder;

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

    public static Supplier<Holder.Reference<SoundEvent>> registerSoundEvent(String id, Supplier<SoundEvent> event) {
        DeferredHolder<SoundEvent,SoundEvent> soundEventReference = SlimeGolemModNeoForge.SOUND_EVENT.register(id,event);
        return () -> (Holder.Reference<SoundEvent>) soundEventReference.getDelegate();
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

    public static Supplier<SimpleParticleType> registerParticleType(String id, boolean bl) {
        return SlimeGolemModNeoForge.PARTICLE_TYPE.register(id,() -> new ModSimpleParticleType(bl));
    }

    public static <T extends PlacementModifier> Supplier<PlacementModifierType<T>> registerPlacementType(String id, MapCodec<T> mapCodec) {
        return SlimeGolemModNeoForge.PLACEMENT_TYPE.register(id,() ->  () -> mapCodec);

    }

}
