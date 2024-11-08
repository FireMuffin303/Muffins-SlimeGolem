package net.firemuffin303.slimegolem.neoforge;


import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.firemuffin303.slimegolem.neoforge.client.SlimeGolemClientModForge;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(MuffinsSlimeGolemMod.MOD_ID)
public class SlimeGolemModNeoForge {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(BuiltInRegistries.BLOCK,MuffinsSlimeGolemMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(MuffinsSlimeGolemMod.MOD_ID);
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE,MuffinsSlimeGolemMod.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENT = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT,MuffinsSlimeGolemMod.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB,MuffinsSlimeGolemMod.MOD_ID);
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPE = DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE,MuffinsSlimeGolemMod.MOD_ID);
    public static final DeferredRegister<PlacementModifierType<?>> PLACEMENT_TYPE = DeferredRegister.create(BuiltInRegistries.PLACEMENT_MODIFIER_TYPE,MuffinsSlimeGolemMod.MOD_ID);

    public SlimeGolemModNeoForge(IEventBus iEventBus) {
        // Submit our event bus to let architectury register our content on the right time
        MuffinsSlimeGolemMod.init();

        BLOCKS.register(iEventBus);
        ITEMS.register(iEventBus);
        ENTITY_TYPE.register(iEventBus);
        SOUND_EVENT.register(iEventBus);
        PARTICLE_TYPE.register(iEventBus);
        PLACEMENT_TYPE.register(iEventBus);


        CREATIVE_MODE_TAB.register("main",
                () -> CreativeModeTab.builder()
                        .title(Component.translatable("itemGroup."+MuffinsSlimeGolemMod.MOD_ID+".main"))
                        .icon(() -> new ItemStack(ModItem.SLIME_PIE.get()))
                        .displayItems(MuffinsSlimeGolemMod::displayItem)
                        .build());

        CREATIVE_MODE_TAB.register(iEventBus);


        if(FMLEnvironment.dist.isClient()){
            SlimeGolemClientModForge.init();
        }


        iEventBus.addListener(this::registerAttribute);
    }


    public void registerAttribute(EntityAttributeCreationEvent event){
        ModEntityTypes.registerAttrbutes(((supplier, builderSupplier) -> event.put(supplier.get(),builderSupplier.get().build())));
    }


}
