package dev.anotherfractal.fracdustry.blocks.machines

import net.minecraft.block.Block
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.ItemStack
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.world.BlockView


class FRThermalGeneratorBlock(settings: Settings?) : Block(settings) {
    override fun appendTooltip(
        itemStack: ItemStack?,
        world: BlockView?,
        tooltip: MutableList<Text?>,
        tooltipContext: TooltipContext?
    ) {
        tooltip.add(TranslatableText("tooltips.fracdustry.generator1").formatted(Formatting.GRAY))
        tooltip.add(TranslatableText("tooltips.fracdustry.generator2").formatted(Formatting.GRAY))
    }
}
