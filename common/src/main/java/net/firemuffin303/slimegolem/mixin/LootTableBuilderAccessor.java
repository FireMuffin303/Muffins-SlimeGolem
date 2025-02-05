package net.firemuffin303.slimegolem.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LootTable.Builder.class)
public interface LootTableBuilderAccessor {
    @Accessor("pools") @Mutable
    ImmutableList.Builder<LootPool> getPools();

    @Accessor("pools")
    void setPools(ImmutableList.Builder<LootPool> builder);
}
