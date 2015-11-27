package com.aaron1011.blocktunneling;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class PassableBlock extends Block {

    public PassableBlock(Material materialIn) {
        super(materialIn);
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state) {
        return null;
    }

    @Override
    public boolean isNormalCube() {
        return false;
    }

    @Override
    public boolean isFullCube() {
        return false;
    }
}
