package dev.anotherfractal.fracdustry.items.materials

import dev.anotherfractal.fracdustry.utils.FRMaterialItemSettings
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry


object FRIngotItem {
    val ALUMINUM_INGOT = Item(FRMaterialItemSettings())
    val BRONZE_INGOT = Item(FRMaterialItemSettings())
    val COBALT_INGOT = Item(FRMaterialItemSettings())
    val LITHIUM_INGOT = Item(FRMaterialItemSettings())
    val STEEL_INGOT = Item(FRMaterialItemSettings())
    val TIN_INGOT = Item(FRMaterialItemSettings())
    val TITANIUM_INGOT = Item(FRMaterialItemSettings())
    val URANIUM_INGOT = Item(FRMaterialItemSettings())

    fun RegisterAll() {
        Registry.register(Registry.ITEM, Identifier("fracdustry", "aluminum_ingot"), ALUMINUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "bronze_ingot"), BRONZE_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "cobalt_ingot"), COBALT_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "lithium_ingot"), LITHIUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "steel_ingot"), STEEL_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "tin_ingot"), TIN_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "titanium_ingot"), TITANIUM_INGOT)
        Registry.register(Registry.ITEM, Identifier("fracdustry", "uranium_ingot"), URANIUM_INGOT)
    }
}