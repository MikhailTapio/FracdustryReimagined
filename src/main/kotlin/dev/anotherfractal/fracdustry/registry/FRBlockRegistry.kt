package dev.anotherfractal.fracdustry.registry

import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.BAUXITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.CASSITERITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_BAUXITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_CASSITERITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_ILMENITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_SPODUMENE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.ILMENITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.SPODUMENE_ORE
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

object FRBlockRegistry {
    fun RegisterAll() {
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "bauxite_ore"), BAUXITE_ORE)
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "cassiterite_ore"), CASSITERITE_ORE)
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "ilmenite_ore"), ILMENITE_ORE)
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "spodumene_ore"), SPODUMENE_ORE)
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "deepslate_bauxite_ore"), DEEPSLATE_BAUXITE_ORE)
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "deepslate_cassiterite_ore"), DEEPSLATE_CASSITERITE_ORE)
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "deepslate_ilmenite_ore"), DEEPSLATE_ILMENITE_ORE)
        Registry.register(Registry.BLOCK, Identifier("fracdustry", "deepslate_spodumene_ore"), DEEPSLATE_SPODUMENE_ORE)
    }
}