package net.firemuffin303.slimegolem.forge;

import dev.architectury.platform.forge.EventBuses;
import net.firemuffin303.slimegolem.ModPlatform;
import net.firemuffin303.slimegolem.SlimeGolemMod;
import net.firemuffin303.slimegolem.registry.entity.ModEntity;
import net.firemuffin303.slimegolem.registry.entity.SlimeGolemEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(SlimeGolemMod.MOD_ID)
public class SlimeGolemModForge {

    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS,SlimeGolemMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,SlimeGolemMod.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES,SlimeGolemMod.MOD_ID);


    public SlimeGolemModForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(SlimeGolemMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SlimeGolemMod.init();
        BLOCK.register(modEventBus);
        ITEMS.register(modEventBus);
        ENTITY_TYPE.register(modEventBus);
        modEventBus.addListener(this::registerAttribute);
    }

    public void registerAttribute(EntityAttributeCreationEvent event){
        event.put(ModEntity.SLIME_GOLEM.get(), SlimeGolemEntity.createAttributes().build());
    }
}
