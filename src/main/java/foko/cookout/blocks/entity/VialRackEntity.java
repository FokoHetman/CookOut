package foko.cookout.blocks.entity;

import foko.cookout.blocks.templates.StandBlockEntity;
import foko.cookout.registries.CookOutBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;

public class VialRackEntity extends StandBlockEntity {
    private static final int INPUT_SLOT = 0;


    public VialRackEntity(BlockPos pos, BlockState state) {
        super(CookOutBlockEntities.VIAL_RACK_ENTITY, pos, state, 3);
    }
}
