package com.lucasbarros.aridwilds;

import com.lucasbarros.aridwilds.block.ModBlocks;
import com.lucasbarros.aridwilds.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AridWilds implements ModInitializer {
	public static final String MOD_ID = "aridwilds";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing mod: " + MOD_ID);
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}