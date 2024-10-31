package net.firemuffin303.slimegolem.fabric.datagen.provider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.firemuffin303.slimegolem.common.registry.ModBlock;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.firemuffin303.slimegolem.common.registry.ModItem;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class LangProvider extends FabricLanguageProvider {
    public LangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("itemGroup.muffins_slimegolem.main","Muffin's Slime Golem");

        translationBuilder.add("jei.muffins_slimegolem.slime_dance.title","Slime Golem Dance");
        translationBuilder.add("jei.muffins_slimegolem.slime_dance.music","Play any music from a jukebox\nto make them dance,\nthen give them a Slime Pie");
        translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.title","Cursed Slime Soul Campfire");
        translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.description","Place Soul Campfire above any Packed Slime Block to prevent Slimes spawn in the chunk");
        translationBuilder.add("jukebox_song.muffins_slimegolem.bouncyslime","FireMuffin303 - bouncyslime");

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
        translationBuilder.add(ModItem.MUSIC_DISC_BOUNCYSLIME.get(),"Music Disc");
        translationBuilder.add(ModItem.MUSIC_DISC_BOUNCE_TIL_THE_END.get(),"Music Disc");
        translationBuilder.add(ModEntityTypes.SLIME_GOLEM.get(),"Slime Golem");

    }

    public static class ThaiLangProvider extends FabricLanguageProvider{

        public ThaiLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
            super(dataOutput,"th_th", registryLookup);
        }

        @Override
        public void generateTranslations(HolderLookup.Provider registryLookup, TranslationBuilder translationBuilder) {
            translationBuilder.add("itemGroup.muffins_slimegolem.main","Muffin's Slime Golem");

            translationBuilder.add("jei.muffins_slimegolem.slime_dance.title","สไลม์โกเลมเต้น");
            translationBuilder.add("jei.muffins_slimegolem.slime_dance.music","เล่นเพลงใดก็ได้จากกล่องเพลง\nจากนั้นค่อยให้พายสไลม์");
            translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.title","แคมป์ไฟวิญญาณสไลม์ต้องสาป");
            translationBuilder.add("jei.muffins_slimegolem.cursed_slime_soul_fire.description","วางแคมป์ไฟวิญญาณบนบล๊อคสไลม์อัดใด ๆ ก็ได้\nเพื่อไม่ให้สไลม์เกิดใน Chunk นั้น ๆ");
            translationBuilder.add("jukebox_song.muffins_slimegolem.bouncyslime","FireMuffin303 - bouncyslime");

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
            translationBuilder.add(ModItem.SLIME_PIE.get(),"พายสไลม์");
            translationBuilder.add(ModItem.MUSIC_DISC_BOUNCYSLIME.get(),"แผ่นเพลง");
            translationBuilder.add(ModItem.MUSIC_DISC_BOUNCE_TIL_THE_END.get(),"แผ่นเพลง");
            translationBuilder.add(ModEntityTypes.SLIME_GOLEM.get(),"สไลม์โกเลม");

        }
    }
}
