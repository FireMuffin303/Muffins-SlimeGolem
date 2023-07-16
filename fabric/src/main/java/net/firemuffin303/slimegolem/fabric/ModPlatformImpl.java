package net.firemuffin303.slimegolem.fabric;


import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.block.Block;

import java.util.Properties;
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

}
