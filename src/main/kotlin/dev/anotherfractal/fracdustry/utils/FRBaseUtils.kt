package dev.anotherfractal.fracdustry.utils

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import dev.anotherfractal.fracdustry.itemgroups.FRItemGroups.FRACDUSTRY_MATERIALS

fun FRMaterialItemSettings(): FabricItemSettings = FabricItemSettings().group(FRACDUSTRY_MATERIALS)
fun FRMaterialBlockSettings(): FabricItemSettings = FabricItemSettings().group(FRACDUSTRY_MATERIALS)
