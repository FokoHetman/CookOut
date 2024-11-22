package foko.cookout.registries;

import foko.cookout.CookOut;
import foko.cookout.blocks.entity.VialRackEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CookOutBlockEntities {
    public static BlockEntityType<VialRackEntity> VIAL_RACK_ENTITY;

    public static void registerEntities() {
        VIAL_RACK_ENTITY = registerBlockEntities("vial_rack", VialRackEntity::new, new Block[]{CookOutBlocks.VIAL_RACK});
    }

    public static <T extends BlockEntity> BlockEntityType<T> registerBlockEntities(String name, FabricBlockEntityTypeBuilder.Factory<T> factory, Block[] block) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(CookOut.MOD_ID, name), FabricBlockEntityTypeBuilder.create(factory, block).build());
    }
}