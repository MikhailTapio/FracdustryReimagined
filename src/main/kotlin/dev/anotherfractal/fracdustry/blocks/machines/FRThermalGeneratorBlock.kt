package dev.anotherfractal.fracdustry.blocks.machines

import dev.anotherfractal.fracdustry.blockentities.machines.FRThermalGeneratorBlockEntity
import dev.anotherfractal.fracdustry.inventory.FRInventory
import net.minecraft.block.*
import net.minecraft.block.entity.BlockEntity
import net.minecraft.client.item.TooltipContext
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemPlacementContext
import net.minecraft.item.ItemStack
import net.minecraft.state.StateManager
import net.minecraft.state.property.Properties.HORIZONTAL_FACING
import net.minecraft.state.property.Properties.POWERED
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.ActionResult
import net.minecraft.util.Formatting
import net.minecraft.util.Hand
import net.minecraft.util.ItemScatterer
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.hit.BlockHitResult
import net.minecraft.util.math.BlockPos
import net.minecraft.util.shape.VoxelShape
import net.minecraft.util.shape.VoxelShapes
import net.minecraft.world.BlockView
import net.minecraft.world.World


class FRThermalGeneratorBlock(settings: Settings?) : BlockWithEntity(settings) {
    fun FRThermalGeneratorBlock(settings: Settings?) {
        super.settings
        defaultState = getStateManager().defaultState.with(POWERED, false)
    }

    override fun createBlockEntity(pos: BlockPos?, state: BlockState?): BlockEntity {
        return FRThermalGeneratorBlockEntity(pos, state)
    }

    override fun getRenderType(state: BlockState?): BlockRenderType {
        return BlockRenderType.MODEL
    }

    override fun appendTooltip(
        itemStack: ItemStack?,
        world: BlockView?,
        tooltip: MutableList<Text?>,
        tooltipContext: TooltipContext?
    ) {
        tooltip.add(TranslatableText("tooltips.fracdustry.thermal_generator.1").formatted(Formatting.GRAY))
        tooltip.add(TranslatableText("tooltips.fracdustry.thermal_generator.2").formatted(Formatting.GRAY))
    }

    override fun appendProperties(builder: StateManager.Builder<Block, BlockState>?) {
        super.appendProperties(builder)
        builder?.add(HORIZONTAL_FACING)
        builder?.add(POWERED)
    }

    override fun getPlacementState(ctx: ItemPlacementContext): BlockState? {
        return defaultState.with(HORIZONTAL_FACING, ctx.playerFacing.opposite)
    }

    override fun getOutlineShape(
        state: BlockState?,
        view: BlockView?,
        pos: BlockPos?,
        context: ShapeContext?
    ): VoxelShape? {
        return VoxelShapes.cuboid(0.01, 0.0, 0.01, 0.99, 0.87, 0.99)
    }

    override fun onUse(
        state: BlockState,
        world: World,
        pos: BlockPos?,
        player: PlayerEntity,
        hand: Hand?,
        hit: BlockHitResult?
    ): ActionResult {
        if (!world.isClient) {
            val screenHandlerFactory = state.createScreenHandlerFactory(world, pos)
            if (screenHandlerFactory != null) {
                player.openHandledScreen(screenHandlerFactory)
            }
        }
        return ActionResult.SUCCESS
    }

    override fun onStateReplaced(
        state: BlockState,
        world: World,
        pos: BlockPos?,
        newState: BlockState,
        moved: Boolean
    ) {
        if (state.block !== newState.block) {
            val blockEntity = world.getBlockEntity(pos)
            if (blockEntity is FRThermalGeneratorBlockEntity)
                ItemScatterer.spawn(world, pos, blockEntity)
            super.onStateReplaced(state, world, pos, newState, moved)
        }
    }
}
