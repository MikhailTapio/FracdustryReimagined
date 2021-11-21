package dev.anotherfractal.fracdustry.registry

import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.BAUXITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.CASSITERITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_BAUXITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_CASSITERITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_ILMENITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_SPODUMENE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.ILMENITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.SPODUMENE_ORE
import dev.anotherfractal.fracdustry.items.materials.FRIngotItem
import dev.anotherfractal.fracdustry.items.materials.FRPlateItem
import dev.anotherfractal.fracdustry.registry.FRBlockRegistry.THERMAL_GENERATOR_BLOCK
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.BlockItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


object FRItemRegistry {
    fun registerAll() {
        Registry.register(Registry.ITEM, Identifier("fracdustry", "aluminum_ingot"), FRIngotItem.ALUMINUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "bronze_ingot"), FRIngotItem.BRONZE_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "lithium_ingot"), FRIngotItem.LITHIUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "steel_ingot"), FRIngotItem.STEEL_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "tin_ingot"), FRIngotItem.TIN_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "titanium_ingot"), FRIngotItem.TITANIUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "aluminum_plate"), FRPlateItem.ALUMINUM_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "bronze_plate"), FRPlateItem.BRONZE_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "copper_plate"), FRPlateItem.COPPER_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "steel_plate"), FRPlateItem.STEEL_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "tin_plate"), FRPlateItem.TIN_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "titanium_plate"), FRPlateItem.TITANIUM_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "iron_plate"), FRPlateItem.IRON_PLATE)

        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "bauxite_ore"),
            BlockItem(BAUXITE_ORE, FabricItemSettings())
        )
        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "cassiterite_ore"),
            BlockItem(CASSITERITE_ORE, FabricItemSettings())
        )
        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "ilmenite_ore"),
            BlockItem(ILMENITE_ORE, FabricItemSettings())
        )
        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "spodumene_ore"),
            BlockItem(SPODUMENE_ORE, FabricItemSettings())
        )
        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "deepslate_bauxite_ore"),
            BlockItem(DEEPSLATE_BAUXITE_ORE, FabricItemSettings())
        )
        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "deepslate_cassiterite_ore"),
            BlockItem(DEEPSLATE_CASSITERITE_ORE, FabricItemSettings())
        )
        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "deepslate_ilmenite_ore"),
            BlockItem(DEEPSLATE_ILMENITE_ORE, FabricItemSettings())
        )
        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "deepslate_spodumene_ore"),
            BlockItem(DEEPSLATE_SPODUMENE_ORE, FabricItemSettings())
        )

        Registry.register(
            Registry.ITEM,
            Identifier("fracdustry", "thermal_generator"),
            BlockItem(THERMAL_GENERATOR_BLOCK, FabricItemSettings())
        )
    }
}