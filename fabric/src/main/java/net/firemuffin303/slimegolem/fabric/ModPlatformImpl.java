package net.firemuffin303.slimegolem.fabric;

import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.nio.file.Path;
import java.util.function.Supplier;

public class ModPlatformImpl {
    /**
     * This is our actual method to {@link ModPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }

    public static void registerRenderLayer(Supplier<Block> blockSupplier, RenderType renderType) {
        BlockRenderLayerMap.INSTANCE.putBlock(blockSupplier.get(),renderType);
    }

    public static <T extends Entity> void registerEntityRenderer(Supplier<EntityType<T>> entityTypeSupplier, EntityRendererProvider<T> entityRendererProvider) {
        EntityRendererRegistry.register(entityTypeSupplier,entityRendererProvider);
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


}
