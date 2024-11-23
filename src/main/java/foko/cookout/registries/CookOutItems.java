package foko.cookout.registries;

import foko.cookout.CookOut;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static foko.cookout.registries.CookOutBlocks.BLOCKS;

public class CookOutItems {
    public static final List<Item> ITEMS = new ArrayList<>();
    public static final Item VIAL = registerItem("vial", new Item(new FabricItemSettings()));

    //public static final Item SPRINKLES = registerItem("sprinkles", new Item(new FabricItemSettings()));
    // public static final Item MILK = registerItem("milk", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        CookOutItems.ITEMS.add(item);

        return Registry.register(Registries.ITEM, new Identifier(CookOut.MOD_ID, name), item);
    }
    public static void registerItems() {

    }
    public static final ItemGroup LAB_EQUIPMENT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(CookOutBlocks.VIAL_RACK))
            .displayName(Text.translatable("itemGroup.cookout.lab_equipment"))
            .entries((context, entries) -> {
                for (Item item : ITEMS) {
                    entries.add(item);
                }
                for (Block block : BLOCKS) {
                    entries.add(block);
                }
            })
            .build();
}
