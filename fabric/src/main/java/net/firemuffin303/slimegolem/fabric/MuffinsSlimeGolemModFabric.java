package net.firemuffin303.slimegolem.fabric;

import com.google.common.collect.ImmutableList;
import com.mojang.logging.LogUtils;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.firemuffin303.slimegolem.ModConfig;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.fabricmc.api.ModInitializer;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.firemuffin303.slimegolem.mixin.LootPoolAccessor;
import net.firemuffin303.slimegolem.mixin.LootTableAccessor;
import net.firemuffin303.slimegolem.mixin.LootTableBuilderAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntry;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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


        LootTableEvents.MODIFY.register(new LootTableEvents.Modify() {
            @Override
            public void modifyLootTable(ResourceKey<LootTable> key, LootTable.Builder tableBuilder, LootTableSource source, HolderLookup.Provider registries) {
                if(key.equals(BuiltInLootTables.SPAWNER_TRIAL_ITEMS_TO_DROP_WHEN_OMINOUS) && source.isBuiltin()){
                    List<LootPool> list = new ArrayList<>(((LootTableBuilderAccessor)tableBuilder).getPools().build());
                    LogUtils.getLogger().info(registries.listRegistries().toList().toString());
                    LootTable injectingLootTable = LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1)).add(LootItem.lootTableItem(ModItem.SLIME_CHARGE.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0f,5.0f))))).build();
                    LootPool lootPool = list.get(1);
                    LootPool lootPool1 = ((LootTableAccessor)injectingLootTable).getPools().get(0);
                    List<LootPoolEntryContainer> originalEntries =new ArrayList<>(lootPool.entries);
                    LogUtils.getLogger().info(originalEntries.toString());
                    originalEntries.addAll(new ArrayList<>(lootPool1.entries));
                    LogUtils.getLogger().info(originalEntries.toString());
                    ((LootPoolAccessor)lootPool).setEntries(originalEntries);

                    list.set(1,lootPool);
                    ImmutableList.Builder<LootPool> newLootPool = new ImmutableList.Builder<LootPool>().addAll(list.iterator());
                    ((LootTableBuilderAccessor) tableBuilder).setPools(newLootPool);
                }
            }
        });

        if(FabricLoader.getInstance().isModLoaded("cloth-config")){
            AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
            MuffinsSlimeGolemMod.isClothConfigLoaded = true;
        }
    }
}
