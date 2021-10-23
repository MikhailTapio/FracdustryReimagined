package dev.anotherfractal.fracdustry.gui

import com.mojang.blaze3d.systems.RenderSystem
import dev.anotherfractal.fracdustry.gui.screenhandlers.FRThermalGeneratorScreenHandler
import io.github.cottonmc.cotton.gui.client.CottonInventoryScreen
import net.minecraft.client.render.GameRenderer
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.text.Text
import net.minecraft.util.Identifier


class FRThermalGeneratorGUI(gui: FRThermalGeneratorScreenHandler?, player: PlayerEntity?, title: Text?) :
    CottonInventoryScreen<FRThermalGeneratorScreenHandler?>(gui, player, title) {
    }