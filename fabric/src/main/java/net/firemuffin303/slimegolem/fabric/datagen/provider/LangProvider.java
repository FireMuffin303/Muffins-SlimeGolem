package net.firemuffin303.slimegolem.fabric.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.firemuffin303.slimegolem.common.registry.ModParticleTypes;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class LangProvider extends FabricLanguageProvider {
    public LangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.muffins_slimegolem.main","Muffin's Slime Golem");

        //--- JEI ---
        translationBuilder.add("jei.muffins_slimegolem.slime_dance.title","Slime Golem Dance");
        translationBuilder.add("jei.muffins_slimegolem.slime_dance.music","Play any music from a jukebox\nto make them dance,\nthen give them a Slime Pie");
        translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.title","Cursed Slime Soul Campfire");
        translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.description","Place Soul Campfire above any Packed Slime Block to prevent Slimes spawn in the chunk");
        translationBuilder.add("jukebox_song.muffins_slimegolem.bouncyslime","FireMuffin303 - bouncyslime");

        //--- Cloth Config
        translationBuilder.add("text.autoconfig.muffins_slimegolem.title","Muffin's Slime Golem");
        translationBuilder.add("text.autoconfig.muffins_slimegolem.option.showHoneyLayer","Slime Golems show honey layer when waxed");

        //--- Mod Menu ---
        translationBuilder.add("modmenu.nameTranslation.muffins_slimegolem","Muffin's Slime Golem");
        translationBuilder.add("modmenu.descriptionTranslation.muffins_slimegolem","Add Slime Golem to Minecraft. A good ally for finding Slime Chunks!");
        translationBuilder.add("modmenu.summaryTranslation.muffins_slimegolem","Add Slime Golem to Minecraft. A good ally for finding Slime Chunks!");

        translationBuilder.add(ModBlock.PACKED_SLIME_BLOCK.get(),"Packed Slime Block");
        translationBuilder.add(ModBlock.PACKED_SLIME_BRICKS.get(),"Packed Slime Bricks");
        translationBuilder.add(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),"Chiseled Packed Slime Block");
        translationBuilder.add(ModBlock.PACKED_SLIME_STAIR.get(),"Packed Slime Stair");
        translationBuilder.add(ModBlock.PACKED_SLIME_SLAB.get(),"Packed Slime Slab");
        translationBuilder.add(ModBlock.PACKED_SLIME_WALL.get(),"Packed Slime Wall");
        translationBuilder.add(ModBlock.PACKED_SLIME_BRICK_STAIR.get(),"Packed Slime Bricks Stair");
        translationBuilder.add(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),"Packed Slime Bricks Slab");
        translationBuilder.add(ModBlock.PACKED_SLIME_BRICK_WALL.get(),"Packed Slime Bricks Wall");
        translationBuilder.add(ModBlock.SLIME_ALGAE.get(),"Slime Algae");
        translationBuilder.add(ModItem.SLIME_PIE.get(),"Slime Pie");
        translationBuilder.add(ModItem.SLIME_GOLEM_SPAWN_EGG.get(),"Slime Golem Spawn Egg");
        translationBuilder.add(ModItem.MUSIC_DISC_BOUNCYSLIME.get(),"Music Disc");
        translationBuilder.add(ModItem.SLIME_CHARGE.get(), "Slime Charge");
        translationBuilder.add(ModEntityTypes.SLIME_GOLEM.get(),"Slime Golem");
        translationBuilder.add("effect.muffins_slimegolem.bounce","Bounce");
    }

    public static class ThaiLangProvider extends FabricLanguageProvider{

        public ThaiLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
            super(dataOutput,"th_th", registryLookup);
        }

        @Override
        public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
            translationBuilder.add("itemGroup.muffins_slimegolem.main","Muffin's Slime Golem");

            //--- JEI ---
            translationBuilder.add("jei.muffins_slimegolem.slime_dance.title","สไลม์โกเลมเต้น");
            translationBuilder.add("jei.muffins_slimegolem.slime_dance.music","เล่นเพลงใดก็ได้จากกล่องเพลง\nจากนั้นค่อยให้พายสไลม์");
            translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.title","แคมป์ไฟวิญญาณสไลม์ต้องสาป");
            translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.description","วางแคมป์ไฟวิญญาณบนบล๊อคสไลม์อัดใด ๆ ก็ได้\nเพื่อไม่ให้สไลม์เกิดใน Chunk นั้น ๆ");
            //--- Cloth Config ---
            translationBuilder.add("text.autoconfig.muffins_slimegolem.title","Muffin's Slime Golem");
            translationBuilder.add("text.autoconfig.muffins_slimegolem.option.showHoneyLayer","สไลม์โกเลมแสดงชั้นน้ำผึ้งเมื่อเคลือบขี้ผึ้ง");
            //--- Mod Menu ---
            translationBuilder.add("modmenu.nameTranslation.muffins_slimegolem","Muffin's Slime Golem");
            translationBuilder.add("modmenu.descriptionTranslation.muffins_slimegolem","เพิ่มสไลม์โกเลมให้ Minecraft มิตรสหายที่ดีในการหาพื้นที่สไลม์!");
            translationBuilder.add("modmenu.summaryTranslation.muffins_slimegolem","เพิ่มสไลม์โกเลมให้ Minecraft มิตรสหายที่ดีในการหาพื้นที่สไลม์!");


            translationBuilder.add("jukebox_song.muffins_slimegolem.bouncyslime","FireMuffin303 - bouncyslime");
            translationBuilder.add(ModBlock.PACKED_SLIME_BLOCK.get(),"บล๊อกสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.PACKED_SLIME_BRICKS.get(),"อิฐสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.CHISELED_PACKED_SLIME_BLOCK.get(),"บล็อกสไลม์อัดแน่นสลัก");
            translationBuilder.add(ModBlock.PACKED_SLIME_STAIR.get(),"บันไดสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.PACKED_SLIME_SLAB.get(),"แผ่นสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.PACKED_SLIME_WALL.get(),"กำแพงสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.PACKED_SLIME_BRICK_STAIR.get(),"บันไดอิฐสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.PACKED_SLIME_BRICK_SLAB.get(),"แผ่นอิฐสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.PACKED_SLIME_BRICK_WALL.get(),"กำแพงอิฐสไลม์อัดแน่น");
            translationBuilder.add(ModBlock.SLIME_ALGAE.get(),"ตะไคร่สไลม์");
            translationBuilder.add(ModItem.SLIME_PIE.get(),"พายสไลม์");
            translationBuilder.add(ModItem.SLIME_GOLEM_SPAWN_EGG.get(),"ไข่เกิดสไลม์โกเลม");
            translationBuilder.add(ModItem.MUSIC_DISC_BOUNCYSLIME.get(),"แผ่นเพลง");
            translationBuilder.add(ModEntityTypes.SLIME_GOLEM.get(),"สไลม์โกเลม");
            translationBuilder.add(ModItem.SLIME_CHARGE.get(), "ประจุสไลม์");
            translationBuilder.add("effect.muffins_slimegolem.bounce","เด้ง");

        }
    }
}
