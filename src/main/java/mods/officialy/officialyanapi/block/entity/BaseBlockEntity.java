package mods.officialy.officialyanapi.block.entity;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class BaseBlockEntity extends BlockEntity {

    public BaseBlockEntity(BlockEntityType<?> blockEntityType) {
        super(blockEntityType, null, null);
    }

}
