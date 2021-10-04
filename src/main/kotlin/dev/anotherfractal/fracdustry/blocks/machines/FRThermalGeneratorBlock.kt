package dev.anotherfractal.fracdustry.blocks.machines

import net.minecraft.block.Block
import net.minecraft.block.BlockState
import net.minecraft.block.HorizontalFacingBlock.FACING
import net.minecraft.block.ShapeContext
import net.minecraft.client.item.TooltipContext
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.state.StateManager
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.Formatting
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
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
    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>?) {
        super.appendProperties(builder)
        if (builder != null) builder.add(FACING)
    }
    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? {
        return defaultState.with(FACING, ctx.playerFacing.opposite)
    }
    override fun getOutlineShape(
        state: BlockState?,
        view: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?
    ): VoxelShape? {
        return VoxelShapes.cuboid(0.01, 0.0, 0.01, 0.99, 1.0, 0.99)
    }
}
