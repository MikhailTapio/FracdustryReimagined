package dev.anotherfractal.fracdustry.blockentities.machines

import dev.anotherfractal.fracdustry.registry.FRBlockEntityRegistry.THERMAL_GENERATOR_BLOCK_ENTITY
import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.util.math.BlockPos

class FRThermalGeneratorBlockEntity(pos: BlockPos?, state: BlockState?) :
    BlockEntity(THERMAL_GENERATOR_BLOCK_ENTITY, pos, state)
