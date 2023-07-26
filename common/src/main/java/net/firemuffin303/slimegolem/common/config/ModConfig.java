package net.firemuffin303.slimegolem.common.config;

import com.teamresourceful.resourcefulconfig.common.annotations.*;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;
import com.teamresourceful.resourcefulconfig.web.annotations.Gradient;
import com.teamresourceful.resourcefulconfig.web.annotations.Link;
import com.teamresourceful.resourcefulconfig.web.annotations.WebInfo;
import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;

@Config(MuffinsSlimeGolemMod.MOD_ID)
@WebInfo(
        title = "Muffin's Slimegolem",
        description = "Add Slime Golem to Minecraft. A good ally for finding Slime Chunks!",
        gradient = @Gradient(value = "90deg",first = "#4aac75", second = "#91fa85"),

        links = {
             @Link(value = "https://modrinth.com/mod/muffins-slime-golem", icon = "", title = "Modrinth"),
             @Link(value = "https://www.curseforge.com/minecraft/mc-mods/muffins-slime-golem", icon = "", title = "Curseforge"),

             @Link(value = "https://github.com/FireMuffin303/SlimeGolem", icon = "", title = "Github"),
             @Link(value = "https://github.com/FireMuffin303/SlimeGolem/issues",icon = "", title = "Issue")
        }
)
public final class ModConfig {
    @ConfigEntry(id="showHoneyOnSlimeGolem",
            type = EntryType.BOOLEAN,
            translation = "text.resourcefulconfig.muffins_slimegolem.client.showHoneyOnSlimeGolem")
    @Comment(value = "Show honey on slime golem, if true.",
            translation = "text.resourcefulconfig.muffins_slimegolem.client.showHoneyOnSlimeGolem.comment")
    public static boolean showHoneyOnSlimeGolem = true;
}
