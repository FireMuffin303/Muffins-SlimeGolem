package net.firemuffin303.slimegolem.fabric.config;

import com.teamresourceful.resourcefulconfig.client.ConfigScreen;
import com.teamresourceful.resourcefulconfig.common.config.ResourcefulConfig;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.config.ModConfig;

public class ModMenuConfig implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory(){
        return parent ->{
            ResourcefulConfig config = MuffinsSlimeGolemMod.CONFIGURATOR.getConfig(ModConfig.class);
            if(config == null){
                return null;
            }
            return new ConfigScreen(null,config);
        };
    }
}
