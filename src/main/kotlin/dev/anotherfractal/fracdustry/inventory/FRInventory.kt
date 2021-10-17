package dev.anotherfractal.fracdustry.inventory

import net.minecraft.entity.player.PlayerEntity
import net.minecraft.inventory.Inventories
import net.minecraft.inventory.Inventory
import net.minecraft.item.ItemStack
import net.minecraft.util.collection.DefaultedList


interface FRInventory : Inventory {
    val items: DefaultedList<ItemStack?>

    override fun size(): Int {
        return items.size
    }

    override fun isEmpty(): Boolean {
        for (i in 0 until size()) {
            val stack = getStack(i)
            if (!stack.isEmpty) {
                return false
            }
        }
        return true
    }

    override fun getStack(slot: Int): ItemStack {
        return items[slot]
    }

    override fun removeStack(slot: Int, count: Int): ItemStack {
        val result = Inventories.splitStack(items, slot, count)
        if (!result.isEmpty) {
            markDirty()
        }
        return result
    }

    override fun removeStack(slot: Int): ItemStack {
        return Inventories.removeStack(items, slot)
    }

    override fun setStack(slot: Int, stack: ItemStack) {
        items[slot] = stack
        if (stack.count > maxCountPerStack) {
            stack.count = maxCountPerStack
        }
    }

    override fun clear() {
        items.clear()
    }

    override fun markDirty() {

    }

    override fun canPlayerUse(player: PlayerEntity): Boolean {
        return true
    }

    companion object {
        fun of(items: DefaultedList<ItemStack?>?): DefaultedList<ItemStack?>? {
            return items
        }

        fun ofSize(size: Int): DefaultedList<ItemStack?>? {
            return of(DefaultedList.ofSize(size, ItemStack.EMPTY))
        }
    }
}
