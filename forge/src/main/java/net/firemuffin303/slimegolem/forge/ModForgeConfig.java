package net.firemuffin303.slimegolem.forge;

import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.config.ModConfigEvent;

public class ModForgeConfig {
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static final ForgeConfigSpec.BooleanValue SHOW_HONEY_ON_GOLEM;

    static {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
        CLIENT_BUILDER.comment("Slime Golem").push("slimegolem");
        SHOW_HONEY_ON_GOLEM = CLIENT_BUILDER.comment("Show honey layer on Slime Golem when waxed.").define("showHoneyLayer",true);

        CLIENT_BUILDER.pop();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    @SubscribeEvent
    public static void onLoad(final ModConfigEvent.Loading configEvent){
    }

    @SubscribeEvent
    public static void onReload(final ModConfigEvent.Reloading configEvent){

    }
}
