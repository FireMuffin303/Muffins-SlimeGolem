package net.firemuffin303.slimegolem.forge.datagen;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.forge.datagen.provider.ModBlockStateProvider;
import net.firemuffin303.slimegolem.forge.datagen.provider.ModItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MuffinsSlimeGolemMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator dataGenerator = event.getGenerator();
        dataGenerator.addProvider(event.includeClient(), new ModBlockStateProvider(dataGenerator.getPackOutput(),event.getExistingFileHelper()));
    }
}
