package dev.anotherfractal.fracdustry.registry

import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_BAUXITE_DEEPSLATE
import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_BAUXITE_OVERWORLD
import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_CASSITERITE_DEEPSLATE
import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_CASSITERITE_OVERWORLD
import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_ILMENITE_DEEPSLATE
import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_ILMENITE_OVERWORLD
import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_SPODUMENE_DEEPSLATE
import dev.anotherfractal.fracdustry.worldgen.ores.FROreGen.ORE_SPODUMENE_OVERWORLD
import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.minecraft.util.Identifier
import net.minecraft.util.registry.BuiltinRegistries
import net.minecraft.util.registry.Registry
import net.minecraft.util.registry.RegistryKey
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.feature.ConfiguredFeature


object FRGenRegistry {
    fun RegisterAll() {
        val oreBauxiteOverworld: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_bauxite_overworld")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreBauxiteOverworld.value, ORE_BAUXITE_OVERWORLD)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreBauxiteOverworld
        )

        val oreCassiteriteOverworld: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_cassiterite_overworld")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCassiteriteOverworld.value, ORE_CASSITERITE_OVERWORLD)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreCassiteriteOverworld
        )

        val oreIlmeniteOverworld: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_ilmenite_overworld")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreIlmeniteOverworld.value, ORE_ILMENITE_OVERWORLD)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreIlmeniteOverworld
        )

        val oreSpodumeneOverworld: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_spodumene_overworld")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSpodumeneOverworld.value, ORE_SPODUMENE_OVERWORLD)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreSpodumeneOverworld
        )



        val oreBauxiteDeepslate: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_bauxite_deepslate")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreBauxiteDeepslate.value, ORE_BAUXITE_DEEPSLATE)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreBauxiteDeepslate
        )

        val oreCassiteriteDeepslate: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_cassiterite_deepslate")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCassiteriteDeepslate.value, ORE_CASSITERITE_DEEPSLATE)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreCassiteriteDeepslate
        )

        val oreIlmeniteDeepslate: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_ilmenite_deepslate")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreIlmeniteDeepslate.value, ORE_ILMENITE_DEEPSLATE)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreIlmeniteDeepslate
        )

        val oreSpodumeneDeepslate: RegistryKey<ConfiguredFeature<*, *>> = RegistryKey.of(
            Registry.CONFIGURED_FEATURE_KEY,
            Identifier("fracdustry", "ore_spodumene_deepslate")
        )
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSpodumeneDeepslate.value, ORE_SPODUMENE_DEEPSLATE)
        BiomeModifications.addFeature(
            BiomeSelectors.foundInOverworld(),
            GenerationStep.Feature.UNDERGROUND_ORES,
            oreSpodumeneDeepslate
        )
    }
}