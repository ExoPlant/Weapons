package net.zestyblaze.weapons.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zestyblaze.weapons.Weapons;
import net.zestyblaze.weapons.entities.NetheriteSpearEntity;

public class EntityInit {

    public static final EntityType<NetheriteSpearEntity> NetheriteSpearEntityType = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(Weapons.MODID, "netherite_spear"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, NetheriteSpearEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f))
                    .trackRangeBlocks(4).trackedUpdateRate(10)
                    .build()
    );

}
