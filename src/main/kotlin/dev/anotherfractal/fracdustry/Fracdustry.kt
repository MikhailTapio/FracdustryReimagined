package dev.anotherfractal.fracdustry

import com.glisco.owo.itemgroup.Icon
import com.glisco.owo.itemgroup.OwoItemGroup
import com.glisco.owo.itemgroup.gui.ItemGroupButton
import dev.anotherfractal.fracdustry.itemgroups.FRItemGroup
import dev.anotherfractal.fracdustry.items.materials.FRIngotItem
import dev.anotherfractal.fracdustry.registry.*
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.tag.TagFactory
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier


class Fracdustry : ModInitializer {
    override fun onInitialize() {
        FRItemRegistry.RegisterAll()
        FRBlockRegistry.RegisterAll()
        FRGenRegistry.RegisterAll()
        FRGUIRegistry.RegisterAll()
        FRBlockEntityRegistry.RegisterAll()
        FRItemGroup.initialize()
    }
}

