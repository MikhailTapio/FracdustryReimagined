package dev.anotherfractal.fracdustry

import dev.anotherfractal.fracdustry.itemgroups.FRItemGroup
import dev.anotherfractal.fracdustry.registry.*
import net.fabricmc.api.ModInitializer
import software.bernie.geckolib3.GeckoLib


class Fracdustry : ModInitializer {
    override fun onInitialize() {
        GeckoLib.initialize()
        FRItemRegistry.registerAll()
        FRBlockRegistry.registerAll()
        FRGenRegistry.registerAll()
        FRGUIRegistry.registerAll()
        FRBlockEntityRegistry.registerAll()
        FRItemGroup.initialize()
    }
}

