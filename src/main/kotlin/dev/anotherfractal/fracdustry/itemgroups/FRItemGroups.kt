package dev.anotherfractal.fracdustry.itemgroups

import dev.anotherfractal.fracdustry.blocks.machines.FRThermalGeneratorBlock
import dev.anotherfractal.fracdustry.items.materials.FRIngotItem
import dev.anotherfractal.fracdustry.registry.FRBlockRegistry
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder
import net.minecraft.item.ItemStack
import net.minecraft.util.Identifier

object FRItemGroups {
    val FRACDUSTRY_MATERIALS = FabricItemGroupBuilder.build(
        Identifier("fracdustry", "material")
    ) { ItemStack(FRIngotItem.ALUMINUM_INGOT) }

    val FRACDUSTRY_MACHINERY = FabricItemGroupBuilder.build(
        Identifier("fracdustry", "machinery")
    ) { ItemStack(FRBlockRegistry.THERMAL_GENERATOR_BLOCK) }
}