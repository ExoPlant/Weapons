package net.zestyblaze.weapons;

import net.fabricmc.api.ModInitializer;
import net.zestyblaze.weapons.init.WeaponInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Weapons implements ModInitializer {

	public static String MODID = "weapons";

	public static Logger LOGGER = LogManager.getLogger(MODID);

	@Override
	public void onInitialize() {
		LOGGER.info("Weapons is installed correctly, loading now! Thanks for installing! <3");
		WeaponInit.register();
	}
}
