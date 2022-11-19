package firemuffin303.slimegolem.entity;

import firemuffin303.slimegolem.Slimegolem;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntity {
    public static EntityType<SlimeGolemEntity> SLIME_GOLEM;

    public static void init(){
        FabricDefaultAttributeRegistry.register(SLIME_GOLEM,SlimeGolemEntity.createAttributes());
    }

    static {
        SLIME_GOLEM = Registry.register(Registry.ENTITY_TYPE,new Identifier(Slimegolem.MODID,"slime_golem"), FabricEntityTypeBuilder.create(SpawnGroup.MISC, SlimeGolemEntity::new).dimensions(EntityDimensions.changing(0.7F,1.2F)).build());
    }
}
