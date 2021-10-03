package dev.anotherfractal.fracdustry.blocks.materials

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags
import net.minecraft.block.Block
import net.minecraft.block.Material

object FROreBlock {
    val BAUXITE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
    val CASSITERITE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
    val ILMENITE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
    val SPODUMENE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(2.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
    val DEEPSLATE_BAUXITE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
    val DEEPSLATE_CASSITERITE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
    val DEEPSLATE_ILMENITE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
    val DEEPSLATE_SPODUMENE_ORE: Block = Block(FabricBlockSettings.of(Material.STONE).strength(3.0f).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2))
}