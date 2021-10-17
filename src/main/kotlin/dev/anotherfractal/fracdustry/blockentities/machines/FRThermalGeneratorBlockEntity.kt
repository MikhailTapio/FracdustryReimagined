package dev.anotherfractal.fracdustry.blockentities.machines

import dev.anotherfractal.fracdustry.gui.screenhandlers.FRThermalGeneratorScreenHandler
import dev.anotherfractal.fracdustry.inventory.FRInventory
import dev.anotherfractal.fracdustry.registry.FRBlockEntityRegistry.THERMAL_GENERATOR_BLOCK_ENTITY
import net.minecraft.block.BlockState
import net.minecraft.block.entity.BlockEntity
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.inventory.Inventories
import net.minecraft.item.ItemStack
import net.minecraft.nbt.NbtCompound
import net.minecraft.screen.NamedScreenHandlerFactory
import net.minecraft.screen.ScreenHandler
import net.minecraft.screen.ScreenHandlerContext
import net.minecraft.text.Text
import net.minecraft.text.TranslatableText
import net.minecraft.util.collection.DefaultedList
import net.minecraft.util.math.BlockPos


class FRThermalGeneratorBlockEntity(pos: BlockPos?, state: BlockState?) :
    BlockEntity(THERMAL_GENERATOR_BLOCK_ENTITY, pos, state), NamedScreenHandlerFactory, FRInventory {

    override val items = DefaultedList.ofSize(1, ItemStack.EMPTY)

    override fun markDirty() {

    }

    override fun createMenu(syncId: Int, inventory: PlayerInventory?, player: PlayerEntity?): ScreenHandler? {
        return FRThermalGeneratorScreenHandler(syncId, inventory, ScreenHandlerContext.create(world, pos))
    }

    override fun getDisplayName(): Text {
        return TranslatableText(cachedState.block.translationKey)
    }

    override fun readNbt(nbt: NbtCompound) {
        super.readNbt(nbt)
        Inventories.readNbt(nbt, items)
    }

    override fun writeNbt(nbt: NbtCompound): NbtCompound {
        super.writeNbt(nbt)
        Inventories.writeNbt(nbt, items)
        return nbt
    }
}
