package dev.anotherfractal.fracdustry.itemgroups

import com.glisco.owo.itemgroup.Icon
import com.glisco.owo.itemgroup.OwoItemGroup
import com.glisco.owo.itemgroup.gui.ItemGroupButton
import dev.anotherfractal.fracdustry.items.materials.FRIngotItem
import dev.anotherfractal.fracdustry.registry.FRBlockRegistry
import net.fabricmc.fabric.api.tag.TagFactory
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.tag.Tag
import net.minecraft.util.Identifier


object FRItemGroup : OwoItemGroup(Identifier("fracdustry", "main")) {
    val MATERIAL_CONTENT: Tag<Item> = TagFactory.ITEM.create(Identifier("fracdustry", "material_content"))
    val MACHINERY_CONTENT: Tag<Item> = TagFactory.ITEM.create(Identifier("fracdustry", "machinery_content"))

    override fun setup() {
        keepStaticTitle()
        addTab(Icon.of(FRIngotItem.ALUMINUM_INGOT), "material", MATERIAL_CONTENT)
        addTab(Icon.of(FRBlockRegistry.THERMAL_GENERATOR_BLOCK), "machinery", MACHINERY_CONTENT)
        addButton(ItemGroupButton.github("https://github.com/AnotherFractal/FracdustryReimagined"))
    }

    override fun createIcon(): ItemStack {
        return ItemStack(FRBlockRegistry.THERMAL_GENERATOR_BLOCK)
    }
}