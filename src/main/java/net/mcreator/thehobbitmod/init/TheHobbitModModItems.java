
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thehobbitmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.thehobbitmod.item.ThreeRingsItem;
import net.mcreator.thehobbitmod.item.TheOneRingItem;
import net.mcreator.thehobbitmod.item.TarnishedRingItem;
import net.mcreator.thehobbitmod.item.StingItem;
import net.mcreator.thehobbitmod.item.SevenRingsItem;
import net.mcreator.thehobbitmod.item.RawMithrilItem;
import net.mcreator.thehobbitmod.item.RawArchaicGoldItem;
import net.mcreator.thehobbitmod.item.PipeItem;
import net.mcreator.thehobbitmod.item.OrcristItem;
import net.mcreator.thehobbitmod.item.NineRingsItem;
import net.mcreator.thehobbitmod.item.Mithril_ToolsSwordItem;
import net.mcreator.thehobbitmod.item.Mithril_ToolsShovelItem;
import net.mcreator.thehobbitmod.item.Mithril_ToolsPickaxeItem;
import net.mcreator.thehobbitmod.item.Mithril_ToolsHoeItem;
import net.mcreator.thehobbitmod.item.Mithril_ToolsAxeItem;
import net.mcreator.thehobbitmod.item.MithrilIngotItem;
import net.mcreator.thehobbitmod.item.MithrilArmorItem;
import net.mcreator.thehobbitmod.item.MistyMountainsItem;
import net.mcreator.thehobbitmod.item.HeatedMithrilItem;
import net.mcreator.thehobbitmod.item.GlamdringItem;
import net.mcreator.thehobbitmod.item.BurningMagmaShardItem;
import net.mcreator.thehobbitmod.item.ArchaicGoldIngotItem;
import net.mcreator.thehobbitmod.TheHobbitModMod;

public class TheHobbitModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheHobbitModMod.MODID);
	public static final RegistryObject<Item> MITHRIL_INGOT = REGISTRY.register("mithril_ingot", () -> new MithrilIngotItem());
	public static final RegistryObject<Item> THE_ONE_RING = REGISTRY.register("the_one_ring", () -> new TheOneRingItem());
	public static final RegistryObject<Item> HEATED_MITHRIL = REGISTRY.register("heated_mithril", () -> new HeatedMithrilItem());
	public static final RegistryObject<Item> RAW_MITHRIL = REGISTRY.register("raw_mithril", () -> new RawMithrilItem());
	public static final RegistryObject<Item> BURNING_MAGMA_SHARD = REGISTRY.register("burning_magma_shard", () -> new BurningMagmaShardItem());
	public static final RegistryObject<Item> BURNING_MAGMA = block(TheHobbitModModBlocks.BURNING_MAGMA);
	public static final RegistryObject<Item> STING = REGISTRY.register("sting", () -> new StingItem());
	public static final RegistryObject<Item> GLAMDRING = REGISTRY.register("glamdring", () -> new GlamdringItem());
	public static final RegistryObject<Item> ORCRIST = REGISTRY.register("orcrist", () -> new OrcristItem());
	public static final RegistryObject<Item> MITHRIL_ORE = block(TheHobbitModModBlocks.MITHRIL_ORE);
	public static final RegistryObject<Item> PIPE = REGISTRY.register("pipe", () -> new PipeItem());
	public static final RegistryObject<Item> MITHRIL_ARMOR_HELMET = REGISTRY.register("mithril_armor_helmet", () -> new MithrilArmorItem.Helmet());
	public static final RegistryObject<Item> MITHRIL_ARMOR_CHESTPLATE = REGISTRY.register("mithril_armor_chestplate", () -> new MithrilArmorItem.Chestplate());
	public static final RegistryObject<Item> MITHRIL_ARMOR_LEGGINGS = REGISTRY.register("mithril_armor_leggings", () -> new MithrilArmorItem.Leggings());
	public static final RegistryObject<Item> MITHRIL_ARMOR_BOOTS = REGISTRY.register("mithril_armor_boots", () -> new MithrilArmorItem.Boots());
	public static final RegistryObject<Item> ORC_SPAWN_EGG = REGISTRY.register("orc_spawn_egg", () -> new ForgeSpawnEggItem(TheHobbitModModEntities.ORC, -6750208, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> MISTY_MOUNTAINS = REGISTRY.register("misty_mountains", () -> new MistyMountainsItem());
	public static final RegistryObject<Item> NINE_RINGS = REGISTRY.register("nine_rings", () -> new NineRingsItem());
	public static final RegistryObject<Item> NAZGUL_SPAWN_EGG = REGISTRY.register("nazgul_spawn_egg", () -> new ForgeSpawnEggItem(TheHobbitModModEntities.NAZGUL, -16777216, -13421773, new Item.Properties()));
	public static final RegistryObject<Item> SEVEN_RINGS = REGISTRY.register("seven_rings", () -> new SevenRingsItem());
	public static final RegistryObject<Item> THREE_RINGS = REGISTRY.register("three_rings", () -> new ThreeRingsItem());
	public static final RegistryObject<Item> TARNISHED_RING = REGISTRY.register("tarnished_ring", () -> new TarnishedRingItem());
	public static final RegistryObject<Item> MALLORN_WOOD = block(TheHobbitModModBlocks.MALLORN_WOOD);
	public static final RegistryObject<Item> MALLORN_LOG = block(TheHobbitModModBlocks.MALLORN_LOG);
	public static final RegistryObject<Item> MALLORN_PLANKS = block(TheHobbitModModBlocks.MALLORN_PLANKS);
	public static final RegistryObject<Item> MALLORN_LEAVES = block(TheHobbitModModBlocks.MALLORN_LEAVES);
	public static final RegistryObject<Item> MALLORN_STAIRS = block(TheHobbitModModBlocks.MALLORN_STAIRS);
	public static final RegistryObject<Item> MALLORN_SLAB = block(TheHobbitModModBlocks.MALLORN_SLAB);
	public static final RegistryObject<Item> MALLORN_FENCE = block(TheHobbitModModBlocks.MALLORN_FENCE);
	public static final RegistryObject<Item> MALLORN_FENCE_GATE = block(TheHobbitModModBlocks.MALLORN_FENCE_GATE);
	public static final RegistryObject<Item> MALLORN_PRESSURE_PLATE = block(TheHobbitModModBlocks.MALLORN_PRESSURE_PLATE);
	public static final RegistryObject<Item> MALLORN_BUTTON = block(TheHobbitModModBlocks.MALLORN_BUTTON);
	public static final RegistryObject<Item> MITHRIL_TOOLS_PICKAXE = REGISTRY.register("mithril_tools_pickaxe", () -> new Mithril_ToolsPickaxeItem());
	public static final RegistryObject<Item> MITHRIL_TOOLS_AXE = REGISTRY.register("mithril_tools_axe", () -> new Mithril_ToolsAxeItem());
	public static final RegistryObject<Item> MITHRIL_TOOLS_SWORD = REGISTRY.register("mithril_tools_sword", () -> new Mithril_ToolsSwordItem());
	public static final RegistryObject<Item> MITHRIL_TOOLS_SHOVEL = REGISTRY.register("mithril_tools_shovel", () -> new Mithril_ToolsShovelItem());
	public static final RegistryObject<Item> MITHRIL_TOOLS_HOE = REGISTRY.register("mithril_tools_hoe", () -> new Mithril_ToolsHoeItem());
	public static final RegistryObject<Item> FORGER = block(TheHobbitModModBlocks.FORGER);
	public static final RegistryObject<Item> DEEPSLATE_MITHRIL_ORE = block(TheHobbitModModBlocks.DEEPSLATE_MITHRIL_ORE);
	public static final RegistryObject<Item> ARCHAIC_GOLD_INGOT = REGISTRY.register("archaic_gold_ingot", () -> new ArchaicGoldIngotItem());
	public static final RegistryObject<Item> RAW_ARCHAIC_GOLD = REGISTRY.register("raw_archaic_gold", () -> new RawArchaicGoldItem());
	public static final RegistryObject<Item> ARCHAIC_GOLD = block(TheHobbitModModBlocks.ARCHAIC_GOLD);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
