package net.firemuffin303.slimegolem;

import com.ibm.icu.impl.Assert;
import dev.architectury.injectables.annotations.ExpectPlatform;
//import dev.architectury.platform.Platform;
import net.firemuffin303.slimegolem.common.registry.ModBlockEntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.nio.file.Path;
import java.util.function.Supplier;

public class ModPlatform {

    @ExpectPlatform
    public static Path getConfigDirectory() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> supplier){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntity(String id,ModBlockEntityTypes.BlockEntitySupplier<T> blockEntityTypeSupplier, Block block){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static <T extends Entity> Supplier<EntityType<T>> registerEntityType(String id, Supplier<EntityType.Builder<T>> supplier){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<Holder.Reference<SoundEvent>> registerSoundEvent(String id, Supplier<SoundEvent> event){
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
    public static <T extends Mob> Supplier<Item> registerSpawnEgg(Supplier<EntityType<T>> entityType, int primaryColor, int secondaryColor, Item.Properties properties){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Supplier<SimpleParticleType> registerParticleType(String id,boolean bl){
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
    public static ResourceLocation registerLootTable(ResourceLocation resourceLocation){
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean getShowHoneyLayer(){
        throw new AssertionError();
    }
}
