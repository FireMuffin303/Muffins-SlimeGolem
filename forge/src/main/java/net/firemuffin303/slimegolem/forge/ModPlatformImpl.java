package net.firemuffin303.slimegolem.forge;

import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.SlimeGolemMod;
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

    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier) {
        return SlimeGolemModForge.ITEMS.register(id,supplier);
    }

    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier) {
        return SlimeGolemModForge.BLOCK.register(id,supplier);
    }

    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String id, Supplier<EntityType<T>> supplier) {
        return SlimeGolemModForge.ENTITY_TYPE.register(id,supplier);
    }

    public static CreativeModeTab registerCreativeTab(ResourceLocation resourceLocation, Supplier<ItemStack> icon) {
        return CreativeModeTabRegistry.create (resourceLocation.toString()).icon(icon).build();
    }

    public static <T extends Block> TagKey<T> registerBlockTag(ResourceKey<Registry<T>> blockRegistry, String id) {
        return TagKey.create(blockRegistry,new ResourceLocation(SlimeGolemMod.MOD_ID,id));
    }

    public static <T extends Item> TagKey<T> registerItemTag(ResourceKey<Registry<T>> itemRegistry, String id) {
        return TagKey.create(itemRegistry,new ResourceLocation(SlimeGolemMod.MOD_ID,id));
    }

    public static Supplier<SoundEvent> registerSoundEvent(String id) {
        return SlimeGolemModForge.SOUND_EVENT.register(id,() -> SoundEvent.createVariableRangeEvent(new ResourceLocation(SlimeGolemMod.MOD_ID,id)));
    }

    public static boolean getShowHoneyLayer() {
        return ModForgeConfig.SHOW_HONEY_ON_GOLEM.get();
    }

    public static ResourceLocation registerLootTable(ResourceLocation resourceLocation) {
        return resourceLocation;
    }


}
