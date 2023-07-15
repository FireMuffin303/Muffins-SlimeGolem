package net.firemuffin303.slimegolem.forge.datagen.provider;

import net.firemuffin303.slimegolem.MuffinsSlimeGolemMod;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.stream.Collectors;

public class ModItemModelProvider extends ItemModelProvider {
    public static final String GENERATED = "item/generated";
    public static final String HANDHELD = "item/handheld";
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MuffinsSlimeGolemMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Set<Item> items = ForgeRegistries.ITEMS.getValues().stream().filter(i -> MuffinsSlimeGolemMod.MOD_ID.equals(ForgeRegistries.ITEMS.getKey(i).getNamespace())).collect(Collectors.toSet());
        items.forEach((item) ->createItemModel(item,new ResourceLocation(MuffinsSlimeGolemMod.MOD_ID,"item/"+ForgeRegistries.ITEMS.getKey(item).getPath())));
    }

    public void createItemModel(Item item, ResourceLocation resourceLocation){
        withExistingParent(ForgeRegistries.ITEMS.getKey(item).getPath(),GENERATED).texture("layer0",resourceLocation);
    }
}
