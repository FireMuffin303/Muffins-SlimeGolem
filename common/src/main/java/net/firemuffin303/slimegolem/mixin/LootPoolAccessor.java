package net.firemuffin303.slimegolem.mixin;

import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(LootPool.class)
public interface LootPoolAccessor {
    @Accessor("entries") @Mutable
    List<LootPoolEntryContainer> getEntries();

    @Accessor("entries") @Mutable
    void setEntries(List<LootPoolEntryContainer> list);
}
