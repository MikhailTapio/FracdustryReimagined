package dev.anotherfractal.fracdustry.registry

import dev.anotherfractal.fracdustry.gui.screenhandlers.FRThermalGeneratorScreenHandler
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry
import net.minecraft.entity.player.PlayerInventory
import net.minecraft.screen.ScreenHandlerContext
import net.minecraft.screen.ScreenHandlerType
import net.minecraft.util.Identifier


object FRGUIRegistry {
    var THERMAL_GENERATOR_SCREEN_HANDLER: ScreenHandlerType<FRThermalGeneratorScreenHandler>? = null
    fun RegisterAll() {
        THERMAL_GENERATOR_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(
            Identifier("fracdustry","thermal_generator_gui")
        ) { syncId: Int, inventory: PlayerInventory? ->
            FRThermalGeneratorScreenHandler(
                syncId,
                inventory,
                ScreenHandlerContext.EMPTY
            )
        }
    }
}

