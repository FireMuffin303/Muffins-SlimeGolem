package net.firemuffin303.slimegolem;

import dev.architectury.injectables.annotations.ExpectPlatform;
//import dev.architectury.platform.Platform;
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

import java.nio.file.Path;
import java.util.function.Supplier;

public class ModPlatform {

    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }



    @ExpectPlatform
    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> supplier){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String id, Supplier<EntityType<T>> supplier){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void registerRenderLayer(Supplier<Block> blockSupplier, RenderType renderType) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Entity> void registerEntityRenderer(Supplier<EntityType<T>> entityTypeSupplier, EntityRendererProvider<T> entityRendererProvider){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Block> TagKey<T> registerBlockTag(ResourceKey<Registry<T>> blockRegistry, String id) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Item> TagKey<T> registerItemTag(ResourceKey<Registry<T>> itemRegistry, String id) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<SoundEvent> registerSoundEvent(String id) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static ResourceLocation registerLootTable(ResourceLocation resourceLocation){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean getShowHoneyLayer(){
        throw new AssertionError();
    }
}
