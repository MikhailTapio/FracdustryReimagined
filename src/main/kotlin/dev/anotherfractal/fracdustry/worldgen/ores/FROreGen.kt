package dev.anotherfractal.fracdustry.worldgen.ores

import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.BAUXITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.CASSITERITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_BAUXITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_CASSITERITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_ILMENITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.DEEPSLATE_SPODUMENE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.ILMENITE_ORE
import dev.anotherfractal.fracdustry.blocks.materials.FROreBlock.SPODUMENE_ORE
import net.minecraft.world.gen.YOffset
import net.minecraft.world.gen.decorator.RangeDecoratorConfig
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.Feature
import net.minecraft.world.gen.feature.OreFeatureConfig
import net.minecraft.world.gen.heightprovider.UniformHeightProvider


object FROreGen {
    val ORE_BAUXITE_OVERWORLD: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                BAUXITE_ORE.defaultState,
                6
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(11) // Number of veins per chunk

    val ORE_CASSITERITE_OVERWORLD: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                CASSITERITE_ORE.defaultState,
                8
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(13) // Number of veins per chunk

    val ORE_ILMENITE_OVERWORLD: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                ILMENITE_ORE.defaultState,
                4
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(12) // Number of veins per chunk

    val ORE_SPODUMENE_OVERWORLD: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                SPODUMENE_ORE.defaultState,
                10
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(15) // Number of veins per chunk



    val ORE_BAUXITE_DEEPSLATE: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                DEEPSLATE_BAUXITE_ORE.defaultState,
                4
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(11) // Number of veins per chunk

    val ORE_CASSITERITE_DEEPSLATE: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                DEEPSLATE_CASSITERITE_ORE.defaultState,
                6
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(13) // Number of veins per chunk

    val ORE_ILMENITE_DEEPSLATE: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                DEEPSLATE_ILMENITE_ORE.defaultState,
                4
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(12) // Number of veins per chunk

    val ORE_SPODUMENE_DEEPSLATE: ConfiguredFeature<*, *> = Feature.ORE
        .configure(
            OreFeatureConfig(
                OreFeatureConfig.Rules.DEEPSLATE_ORE_REPLACEABLES,
                DEEPSLATE_SPODUMENE_ORE.defaultState,
                8
            )
        ) // Vein size
        .range(
            RangeDecoratorConfig( // You can also use one of the other height providers if you don't want a uniform distribution
                UniformHeightProvider.create(YOffset.aboveBottom(3), YOffset.fixed(64))
            )
        ) // Inclusive min and max height
        .spreadHorizontally()
        .repeat(15) // Number of veins per chunk

}