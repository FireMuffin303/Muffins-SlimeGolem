package net.firemuffin303.slimegolem.fabric.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
import net.firemuffin303.slimegolem.ModConfig;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;

public class ModMenuConfig implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory(){
        return parent ->{
            var config =  AutoConfig.getConfigScreen(ModConfig.class,parent).get();
            if(config != null){
                return config;
            }
            return null;
        };
    }
}
