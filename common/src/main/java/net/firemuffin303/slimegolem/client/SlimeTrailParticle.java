package net.firemuffin303.slimegolem.client;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;

public class SlimeTrailParticle extends TextureSheetParticle {
    private final SpriteSet sprites;
    protected SlimeTrailParticle(ClientLevel clientLevel, double d, double e, double f,SpriteSet sprites) {
        super(clientLevel, d, e, f);
        this.lifetime = 200;
        this.sprites = sprites;
        this.scale(3.5f);
        this.setSpriteFromAge(this.sprites);
    }

    @Override
    public void render(VertexConsumer vertexConsumer, Camera camera, float f) {
        Quaternionf quaternionf = new Quaternionf();
        quaternionf.rotateX(-1.5708f);

        this.renderRotatedQuad(vertexConsumer, camera, quaternionf, f);
    }

    @Override
    public @NotNull ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType>{
        private final SpriteSet sprites;
        public Provider(SpriteSet sprites){
            this.sprites = sprites;
        }
        @Override
        public @Nullable Particle createParticle(SimpleParticleType particleOptions, ClientLevel clientLevel, double d, double e, double f, double g, double h, double i) {
            SlimeTrailParticle slimeTrailParticle = new SlimeTrailParticle(clientLevel,d,e,f,this.sprites);
            slimeTrailParticle.setAlpha(0.75f);
            return slimeTrailParticle;
        }
    }
}
