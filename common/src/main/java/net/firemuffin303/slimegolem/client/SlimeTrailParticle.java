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
    private final int maxLifeTime;
    protected SlimeTrailParticle(ClientLevel clientLevel, double d, double e, double f,SpriteSet sprites) {
        super(clientLevel, d, e, f);
        this.maxLifeTime = 200;
        this.lifetime = this.maxLifeTime;
        this.sprites = sprites;
        this.scale(3.5f);
        this.setSpriteFromAge(this.sprites);
    }

    @Override
    public void tick() {
        super.tick();
        float f = (Math.abs(((float)this.age - (float)this.lifetime)) / (float)this.lifetime) * 0.75f;
        this.setAlpha(f);
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