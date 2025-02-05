package net.firemuffin303.slimegolem.client;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionf;

public class SlimeSplashParticle extends TextureSheetParticle {
    private final SpriteSet sprites;
    protected SlimeSplashParticle(ClientLevel clientLevel, double d, double e, double f,SpriteSet sprites) {
        super(clientLevel, d, e, f);
        this.sprites = sprites;
        this.alpha = 1f;
        this.setSpriteFromAge(this.sprites);
        this.lifetime = 12 + this.random.nextInt(4);
    }


    @Override
    public void tick() {
        if (this.age++ >= this.lifetime) {
            this.remove();
        } else {
            this.setSpriteFromAge(this.sprites);
        }
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType>{
        private final SpriteSet spriteSet;
        public Provider(SpriteSet spriteSet){
            this.spriteSet = spriteSet;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType particleOptions, ClientLevel clientLevel, double d, double e, double f, double g, double h, double i) {
            SlimeSplashParticle slimeSplashParticle = new SlimeSplashParticle(clientLevel,d,e,f,this.spriteSet);
            slimeSplashParticle.scale(16.0f);
            return slimeSplashParticle;
        }
    }
}
