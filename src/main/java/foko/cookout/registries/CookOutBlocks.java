package foko.cookout.registries;

import foko.cookout.CookOut;
import foko.cookout.blocks.custom.VialRack;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

//this is 100% rebranded toast code lmfao
public class CookOutBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    // -- Containers --
    public static final Block VIAL_RACK = registerBlock("vial_rack", new VialRack(FabricBlockSettings.create()));


    public static void registerColoredBlocks() {
        for (DyeColor color : DyeColor.values()) {
            /*Block PLATE = registerBlock(color + "_plate", new Plate(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT)));
            Block LARGE_PLATE = registerBlock(color + "_large_plate", new Plate(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT)));
            Block BOWL = registerBlock(color + "_bowl", new Bowl(FabricBlockSettings.create().sounds(BlockSoundGroup.DECORATED_POT)));
            PLATES.add((Plate) PLATE);
            PLATES.add((Plate) LARGE_PLATE);
            BOWLS.add((Bowl) BOWL);*/
        }
    }
    public static void registerWoodenBlocks() {

        /*for (String woodType : SUPPORTED_WOOD_TYPES) {
            Block CUTTING_BOARD = registerBlock(woodType + "_cutting_board", new CuttingBoard(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));
            CUTTING_BOARDS.add(CUTTING_BOARD);
        }*/
    }
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        BLOCKS.add(block);
        return Registry.register(Registries.BLOCK, new Identifier(CookOut.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CookOut.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        registerColoredBlocks();
        registerWoodenBlocks();
    }


}