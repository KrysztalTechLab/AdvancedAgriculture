package dev.krysztal.advagri;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.item.AdvAgriItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class AdvAgriItemGroup {


    public static ItemGroup ADV_AGRI_CORE_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "agriculture_core"), () -> new ItemStack(AdvAgriItems.BAMBOO_LEAVES));

    public static ItemGroup ADV_AGRI_TOOL_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "agriculture_tools"), () -> new ItemStack(AdvAgriItems.FORGING_HAMMER));

    public static ItemGroup ADV_AGRI_WORLD_ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, "agriculture_world"), () -> new ItemStack(AdvAgriBlocks.TITANIUM_BLOCK));
}
