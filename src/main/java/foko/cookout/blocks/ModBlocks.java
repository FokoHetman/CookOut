package foko.cookout.blocks;

import foko.cookout.CookOut;
import foko.cookout.blocks.custom.VialRack;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBlocks {
//MOVED TO REGISTRIES
    /*
    public static final Block VIAL_RACK = registerBlock("vial_rack", new VialRack(FabricBlockSettings.create().strength(4.0f).nonOpaque().luminance(4)));
    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CookOut.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CookOut.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    private static void creativeEntries(FabricItemGroupEntries entries) {
        entries.add(VIAL_RACK);
    }
    public static void registerBlockItems() {
        ItemGroupEvents.modifyEntriesEvent(RegistryKey.of(Registries.ITEM_GROUP.getKey(), new Identifier(CookOut.MOD_ID, "lab_equipment"))).register(ModBlocks::creativeEntries);
    }
    public static void init() { }
*/
}
