package dev.anotherfractal.fracdustry.registry

import dev.anotherfractal.fracdustry.items.materials.FRIngotItem
import dev.anotherfractal.fracdustry.items.materials.FRPlateItem
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object FRItemRegistry {
    fun RegisterAll() {
        Registry.register(Registry.ITEM, Identifier("fracdustry", "aluminum_ingot"), FRIngotItem.ALUMINUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "bronze_ingot"), FRIngotItem.BRONZE_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "cobalt_ingot"), FRIngotItem.COBALT_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "lithium_ingot"), FRIngotItem.LITHIUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "steel_ingot"), FRIngotItem.STEEL_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "tin_ingot"), FRIngotItem.TIN_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "titanium_ingot"), FRIngotItem.TITANIUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "uranium_ingot"), FRIngotItem.URANIUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "aluminum_plate"), FRPlateItem.ALUMINUM_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "bronze_plate"), FRPlateItem.BRONZE_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "copper_plate"), FRPlateItem.COPPER_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "steel_plate"), FRPlateItem.STEEL_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "tin_plate"), FRPlateItem.TIN_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "titanium_plate"), FRPlateItem.TITANIUM_PLATE)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "iron_plate"), FRPlateItem.IRON_PLATE)
    }
}