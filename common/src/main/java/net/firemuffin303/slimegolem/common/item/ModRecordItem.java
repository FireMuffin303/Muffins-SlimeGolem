package net.firemuffin303.slimegolem.common.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.RecordItem;

public class ModRecordItem extends RecordItem {
    //useless inherit since superclass is protected.
    public ModRecordItem(int i, SoundEvent soundEvent, Properties properties, int j) {
        super(i, soundEvent, properties, j);
    }
}
