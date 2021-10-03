package dev.anotherfractal.fracdustry

import dev.anotherfractal.fracdustry.registry.FRBlockRegistry
import dev.anotherfractal.fracdustry.registry.FRItemRegistry
import net.fabricmc.api.ModInitializer


class Fracdustry : ModInitializer {
    override fun onInitialize() {
        FRItemRegistry.RegisterAll()
        FRBlockRegistry.RegisterAll()
    }
}

