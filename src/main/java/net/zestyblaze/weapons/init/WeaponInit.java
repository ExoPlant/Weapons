package net.zestyblaze.weapons.init;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.weapons.Weapons;
import net.zestyblaze.weapons.weapons.NetheriteSpear;

public class WeaponInit {
    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(Weapons.MODID, "netherite_spear"), NetheriteSpear.NETHERITE_SPEAR);
    }
}
