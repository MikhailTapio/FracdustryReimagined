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
        override fun drawBackground(matrices: MatrixStack?, delta: Float, mouseX: Int, mouseY: Int) {
            RenderSystem.setShader { GameRenderer.getPositionTexShader() }
            RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f)
            RenderSystem.setShaderTexture(0, TEXTURE)
            val x = (width - backgroundWidth) / 2
            val y = (height - backgroundHeight) / 2
            drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight)
        }
        override fun render(matrices: MatrixStack?, mouseX: Int, mouseY: Int, delta: Float) {
            renderBackground(matrices)
            super.render(matrices, mouseX, mouseY, delta)
            drawMouseoverTooltip(matrices, mouseX, mouseY)
        }
            companion object{
                private val TEXTURE = Identifier("fracdustry", "textures/gui/thermal_generator/screen.png")
            }
    }