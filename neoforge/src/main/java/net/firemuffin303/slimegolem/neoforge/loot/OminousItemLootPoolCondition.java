package net.firemuffin303.slimegolem.neoforge.loot;

import net.firemuffin303.slimegolem.mixin.LootTableAccessor;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OminousItemLootPoolCondition implements LootItemCondition {
    @Override
    public LootItemConditionType getType() {
        return null;
    }

    @Override
    public boolean test(LootContext lootContext) {
        Optional<Holder.Reference<LootTable>> optional = lootContext.getResolver().get(Registries.LOOT_TABLE, BuiltInLootTables.SPAWNER_TRIAL_ITEMS_TO_DROP_WHEN_OMINOUS);
        if(optional.isPresent()){
            LootTable lootTable = optional.get().value();
            List<LootPool> list = new ArrayList<>(((LootTableAccessor)lootTable).getPools());
        }
        return false;
    }
}
