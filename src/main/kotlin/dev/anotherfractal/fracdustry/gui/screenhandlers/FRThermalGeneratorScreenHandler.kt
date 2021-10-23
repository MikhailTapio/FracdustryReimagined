package dev.anotherfractal.fracdustry.gui.screenhandlers

import dev.anotherfractal.fracdustry.registry.FRGUIRegistry.THERMAL_GENERATOR_SCREEN_HANDLER
import io.github.cottonmc.cotton.gui.SyncedGuiDescription
import io.github.cottonmc.cotton.gui.widget.WGridPanel
import io.github.cottonmc.cotton.gui.widget.WItemSlot
import io.github.cottonmc.cotton.gui.widget.data.Insets
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.screen.ScreenHandlerContext


class FRThermalGeneratorScreenHandler(syncId: Int, playerInventory: PlayerInventory?, context: ScreenHandlerContext?) :
    SyncedGuiDescription(
        THERMAL_GENERATOR_SCREEN_HANDLER,
        syncId,
        playerInventory,
        getBlockInventory(context, INVENTORY_SIZE),
        getBlockPropertyDelegate(context)
    ) {
    companion object {
        private const val INVENTORY_SIZE = 1
    }

    init {
        val root = WGridPanel()
        setRootPanel(root)
        root.setSize(180, 152)
        root.insets = Insets.ROOT_PANEL
        val itemSlot = WItemSlot.of(blockInventory, 0)
        root.add(itemSlot, 4, 1)
        root.add(this.createPlayerInventoryPanel(), 0, 3)
        root.validate(this)
    }
}