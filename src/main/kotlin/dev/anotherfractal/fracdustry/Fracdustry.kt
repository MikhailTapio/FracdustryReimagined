package dev.anotherfractal.fracdustry

import dev.anotherfractal.fracdustry.registry.*
import net.fabricmc.api.ModInitializer


class Fracdustry : ModInitializer {
    override fun onInitialize() {
        FRItemRegistry.RegisterAll()
        FRBlockRegistry.RegisterAll()
        FRGenRegistry.RegisterAll()
        FRGUIRegistry.RegisterAll()
        FRBlockEntityRegistry.RegisterAll()
    }
}

