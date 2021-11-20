package dev.anotherfractal.fracdustry.registry

import dev.anotherfractal.fracdustry.blockentities.machines.FRThermalGeneratorBlockEntity
import dev.anotherfractal.fracdustry.registry.FRBlockRegistry.THERMAL_GENERATOR_BLOCK
import net.fabricmc.fabric.api.`object`.builder.v1.block.entity.FabricBlockEntityTypeBuilder
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.util.registry.Registry


object FRBlockEntityRegistry {
    var THERMAL_GENERATOR_BLOCK_ENTITY : BlockEntityType<FRThermalGeneratorBlockEntity>? = null


    fun RegisterAll() {
        Registry.register(
            Registry.BLOCK_ENTITY_TYPE,
            "fracdustry:thermal_generator_block_entity",
            FabricBlockEntityTypeBuilder.create(::FRThermalGeneratorBlockEntity, THERMAL_GENERATOR_BLOCK ).build(null)
        )
    }
}
