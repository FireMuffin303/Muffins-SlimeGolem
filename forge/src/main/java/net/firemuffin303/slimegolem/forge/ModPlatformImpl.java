package net.firemuffin303.slimegolem.forge;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderers;
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
import net.minecraftforge.common.CreativeModeTabRegistry;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;
import java.util.function.Supplier;

public class ModPlatformImpl {
    /**
     * This is our actual method to {@link ModPlatform#getConfigDirectory()}.
     */


    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }

    public static void registerRenderLayer(Supplier<Block> blockSupplier, RenderType renderType) {
        ItemBlockRenderTypes.setRenderLayer(blockSupplier.get(),renderType);
    }

    public static <T extends Entity> void registerEntityRenderer(Supplier<EntityType<T>> entityTypeSupplier, EntityRendererProvider<T> entityRendererProvider) {
        EntityRenderers.register(entityTypeSupplier.get(), entityRendererProvider);
    }




}
