package net.firemuffin303.slimegolem.neoforge.loot;

import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class OminousItemLootModifier extends LootModifier {
    private final ResourceKey<LootTable> table;
    protected OminousItemLootModifier(LootItemCondition[] conditionsIn,ResourceKey<LootTable> lootTableResourceKey) {
        super(conditionsIn);
        this.table = lootTableResourceKey;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> objectArrayList, @NotNull LootContext lootContext) {
        Optional<Holder.Reference<LootTable>> lootTableOptional = lootContext.getResolver().get(Registries.LOOT_TABLE,this.table);
        if(lootTableOptional.isPresent()){
            LootTable injectingLootTable = lootTableOptional.get().value();
            injectingLootTable.getRandomItems(lootContext,objectArrayList::add);

        }
        return objectArrayList;
    }

    @Override
    public MapCodec<? extends IGlobalLootModifier> codec() {
        return null;
    }
}
