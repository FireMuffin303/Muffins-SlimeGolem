package net.firemuffin303.slimegolem.fabric.utils;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.firemuffin303.slimegolem.SlimeGolemMod;

@Config(name = SlimeGolemMod.MOD_ID)
public class ModFabricConfig implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    public Client client = new Client();

    public static class Client{
        @Comment("Show honey layer on Slime Golem when waxed.")
        public boolean showHoneyLayerOnSlimeGolem = true;
    }



}
