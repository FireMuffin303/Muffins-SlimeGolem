package net.firemuffin303.slimegolem.forge;


import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.forge.client.SlimeGolemClientModForge;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

@Mod(MuffinsSlimeGolemMod.MOD_ID)
public class SlimeGolemModNeoForge {
    public SlimeGolemModNeoForge(IEventBus iEventBus) {
        // Submit our event bus to let architectury register our content on the right time
        MuffinsSlimeGolemMod.init();

        if(FMLEnvironment.dist.isClient()){
            SlimeGolemClientModForge.init();
        }

        iEventBus.addListener(this::registerAttribute);
    }

    public void registerAttribute(EntityAttributeCreationEvent event){
        ModEntityTypes.registerAttrbutes(((supplier, builderSupplier) -> event.put(supplier.get(),builderSupplier.get().build())));
    }


}
