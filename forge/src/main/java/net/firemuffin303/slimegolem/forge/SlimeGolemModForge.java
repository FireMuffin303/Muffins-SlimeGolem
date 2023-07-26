package net.firemuffin303.slimegolem.forge;


import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.forge.client.SlimeGolemClientModForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(MuffinsSlimeGolemMod.MOD_ID)
public class SlimeGolemModForge {
    public SlimeGolemModForge() {
        // Submit our event bus to let architectury register our content on the right time
        MuffinsSlimeGolemMod.init();

        if(FMLEnvironment.dist.isClient()){
            SlimeGolemClientModForge.init();
        }


        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::registerAttribute);
    }

    public void registerAttribute(EntityAttributeCreationEvent event){
        ModEntityTypes.registerAttrbutes(((supplier, builderSupplier) -> event.put(supplier.get(),builderSupplier.get().build())));
    }


}
