package dev.anotherfractal.fracdustry

import dev.anotherfractal.fracdustry.items.materials.FRIngotItem
import net.fabricmc.api.ModInitializer


class Fracdustry : ModInitializer {
    override fun onInitialize() {
        FRIngotItem.RegisterAll()
    }
}

