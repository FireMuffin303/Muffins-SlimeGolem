package net.firemuffin303.slimegolem.fabric;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.firemuffin303.slimegolem.ModConfig;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.fabricmc.api.ModInitializer;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.GenerationStep;

public class MuffinsSlimeGolemModFabric implements ModInitializer {

    @Override
    public void onInitialize() {

        MuffinsSlimeGolemMod.init();

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.VEGETAL_DECORATION,MuffinsSlimeGolemMod.SLIME_ALGAE_PLACED_FEATURE);

        FabricDefaultAttributeRegistry.register(ModEntityTypes.SLIME_GOLEM.get(), SlimeGolemEntity.createAttributes());

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                ResourceLocation.fromNamespaceAndPath(MuffinsSlimeGolemMod.MOD_ID, "main"),
                FabricItemGroup.builder()
                        .title(Component.translatable("itemGroup."+MuffinsSlimeGolemMod.MOD_ID+".main"))
                        .icon(() -> new ItemStack(ModItem.SLIME_PIE.get()))
                        .displayItems(MuffinsSlimeGolemMod::displayItem).build());


        if(FabricLoader.getInstance().isModLoaded("cloth-config")){
            AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
            MuffinsSlimeGolemMod.isClothConfigLoaded = true;
        }
    }
}
