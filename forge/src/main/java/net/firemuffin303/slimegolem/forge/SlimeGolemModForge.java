package net.firemuffin303.slimegolem.forge;


import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModEntity;
import net.firemuffin303.slimegolem.common.entity.SlimeGolemEntity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(MuffinsSlimeGolemMod.MOD_ID)
public class SlimeGolemModForge {


    public SlimeGolemModForge() {
        // Submit our event bus to let architectury register our content on the right time
        MuffinsSlimeGolemMod.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT,ModForgeConfig.CLIENT_CONFIG);

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::registerAttribute);
    }

    public void registerAttribute(EntityAttributeCreationEvent event){
        ModEntity.registerAttrbutes(((supplier, builderSupplier) -> event.put(supplier.get(),builderSupplier.get().build())));
    }


}
