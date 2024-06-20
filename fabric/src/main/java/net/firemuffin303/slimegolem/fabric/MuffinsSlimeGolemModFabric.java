package net.firemuffin303.slimegolem.fabric;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
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

public class MuffinsSlimeGolemModFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        MuffinsSlimeGolemMod.init();

        FabricDefaultAttributeRegistry.register(ModEntityTypes.SLIME_GOLEM.get(), SlimeGolemEntity.createAttributes());

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
                new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"main"),
                FabricItemGroup.builder().title(Component.translatable("itemGroup."+MuffinsSlimeGolemMod.MOD_ID+".main"))
                        .icon(() -> new ItemStack(ModItem.SLIME_PIE.get()))
                        .displayItems(MuffinsSlimeGolemMod::displayItem).build());

    }
}
