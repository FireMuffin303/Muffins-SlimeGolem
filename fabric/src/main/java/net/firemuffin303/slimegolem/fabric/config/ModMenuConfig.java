package net.firemuffin303.slimegolem.fabric.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;

public class ModMenuConfig implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory(){
        return parent ->{
            return null;
        };
    }
}
