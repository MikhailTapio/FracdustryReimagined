package dev.anotherfractal.fracdustry

import dev.anotherfractal.fracdustry.gui.FRThermalGeneratorGUI
import dev.anotherfractal.fracdustry.gui.screenhandlers.FRThermalGeneratorScreenHandler
import dev.anotherfractal.fracdustry.registry.FRGUIRegistry.THERMAL_GENERATOR_SCREEN_HANDLER
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry


class FracdustryClient : ClientModInitializer {
    override fun onInitializeClient() {
        ScreenRegistry.register(
            THERMAL_GENERATOR_SCREEN_HANDLER
        ) { gui, inventory, title ->
            FRThermalGeneratorGUI(
                gui,
                inventory.player,
                title
            )
        }
    }
}