package net.firemuffin303.slimegolem.common.item;

import net.firemuffin303.slimegolem.common.entity.SlimeChargeProjectile;
import net.firemuffin303.slimegolem.common.registry.ModEntityTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.Position;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class SlimeChargeItem extends Item implements ProjectileItem {
    private static final int COOLDOWN = 10;
    public SlimeChargeItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        if (!level.isClientSide()) {
            SlimeChargeProjectile slimeChargeProjectile = ModEntityTypes.SLIME_CHARGE.get().create(level);
            if(slimeChargeProjectile == null){
                return InteractionResultHolder.fail(itemStack);
            }
            slimeChargeProjectile.setPos(player.getX(),player.getEyePosition().y(),player.getZ());
            slimeChargeProjectile.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(slimeChargeProjectile);
            level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.WIND_CHARGE_THROW, SoundSource.NEUTRAL, 0.5F, 0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F));
            player.getCooldowns().addCooldown(this, COOLDOWN);
            player.awardStat(Stats.ITEM_USED.get(this));
            itemStack.consume(1, player);
        }
        return super.use(level, player, interactionHand);
    }

    @Override
    public void shoot(Projectile projectile, double d, double e, double f, float g, float h) {
    }

    @Override
    public Projectile asProjectile(Level level, Position position, ItemStack itemStack, Direction direction) {
        RandomSource randomSource = level.getRandom();
        double d = randomSource.triangle(direction.getStepX(), 0.11485000000000001);
        double e = randomSource.triangle(direction.getStepY(), 0.11485000000000001);
        double f = randomSource.triangle(direction.getStepZ(), 0.11485000000000001);
        Vec3 vec3 = new Vec3(d, e, f);
        SlimeChargeProjectile slimeChargeProjectile = ModEntityTypes.SLIME_CHARGE.get().create(level);
        if(slimeChargeProjectile == null){
            return null;
        }
        slimeChargeProjectile.setPos(position.x(),position.y(),position.z());
        slimeChargeProjectile.setDeltaMovement(vec3);
        return slimeChargeProjectile;
    }
}
