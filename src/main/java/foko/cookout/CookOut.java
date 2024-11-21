package foko.cookout;

import foko.cookout.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookOut implements ModInitializer {
	public static final String MOD_ID = "cookout";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final ItemGroup LAB_EQUIPMENT = FabricItemGroup.builder()
			.icon(() -> new ItemStack(ModBlocks.VIAL_RACK))
			.displayName(Text.translatable("itemGroup.cookout.lab_equipment"))
			.entries((context, entries) -> {
			})
			.build();
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModBlocks.init();
		ModBlocks.registerBlockItems();

		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "lab_equipment"), LAB_EQUIPMENT);


		LOGGER.info("Hello Fabric world!");
	}
}