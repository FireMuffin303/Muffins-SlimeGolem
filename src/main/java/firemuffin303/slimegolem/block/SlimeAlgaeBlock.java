package firemuffin303.slimegolem.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LichenGrower;
import net.minecraft.block.MultifaceGrowthBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;

public class SlimeAlgaeBlock extends MultifaceGrowthBlock {
    public SlimeAlgaeBlock(Settings settings) {
        super(settings);

    }

    @Override
    public LichenGrower getGrower() {
        return null;
    }

}
