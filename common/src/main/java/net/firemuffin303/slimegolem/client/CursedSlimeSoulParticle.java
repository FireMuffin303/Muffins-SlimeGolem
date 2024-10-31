package net.firemuffin303.slimegolem.client;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class CursedSlimeSoulParticle extends TextureSheetParticle {
    private final SpriteSet sprites;
    protected CursedSlimeSoulParticle(ClientLevel clientLevel, double d, double e, double f,double g, double h,double i,SpriteSet spriteSet) {
        super(clientLevel, d, e, f);
        this.lifetime = clientLevel.random.nextInt(50)+80;
        this.scale(1.8f);
        this.sprites = spriteSet;
        this.setSpriteFromAge(spriteSet);

        this.gravity = 3.0E-6F;
        this.xd = g;
        this.yd = h + (double)(this.random.nextFloat() / 500.0F);
        this.zd = i;
    }

    @Override
    public void tick() {
        this.xo = this.x;
        this.yo = this.y;
        this.zo = this.z;
        if (this.age++ < this.lifetime && !(this.alpha <= 0.0F)) {
            this.xd += (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.zd += (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.yd -= (double)this.gravity;
            this.move(this.xd, this.yd, this.zd);
            if (this.age >= this.lifetime - 60 && this.alpha > 0.01F) {
                this.alpha -= 0.015F;
            }
            this.setSpriteFromAge(this.sprites);

        } else {
            this.remove();
        }
    }

    @Override
    protected int getLightColor(float f) {
        return 240;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType>{
        private final SpriteSet sprites;
        public Provider(SpriteSet sprites){
            this.sprites = sprites;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType particleOptions, ClientLevel clientLevel, double d, double e, double f, double g, double h, double i) {
            CursedSlimeSoulParticle cursedSlimeSoulParticle = new CursedSlimeSoulParticle(clientLevel,d,e,f,g,h,i,sprites);
            cursedSlimeSoulParticle.setAlpha(0.95f);
            return cursedSlimeSoulParticle;
        }
    }

}
