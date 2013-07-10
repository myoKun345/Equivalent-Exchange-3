package com.pahimar.ee3.lib;

/**
 * Equivalent-Exchange-3
 * 
 * Strings
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class Strings {

    /* General keys */
    public static final String TRUE = "true";
    public static final String FALSE = "false";

    /* Fingerprint check related constants */
    public static final String INVALID_FINGERPRINT_MESSAGE = "The copy of Equivalent Exchange 3 that you are running has been modified from the original, and unpredictable things may happen. Please consider re-downloading the original version of the mod.";

    /* Version check related constants */
    public static final String VERSION_CHECK_INIT_LOG_MESSAGE = "version.init_log_message";
    public static final String UNINITIALIZED_MESSAGE = "version.uninitialized";
    public static final String CURRENT_MESSAGE = "version.current";
    public static final String OUTDATED_MESSAGE = "version.outdated";
    public static final String GENERAL_ERROR_MESSAGE = "version.general_error";
    public static final String FINAL_ERROR_MESSAGE = "version.final_error";
    public static final String MC_VERSION_NOT_FOUND = "version.mc_version_not_found";

    /* NBT related constants */
    public static final String NBT_ITEM_CHARGE_LEVEL_KEY = "itemChargeLevel";
    public static final String NBT_ITEM_MODE_KEY = "itemMode";
    public static final String NBT_ITEM_CRAFTING_GUI_OPEN = "itemCraftingGuiOpen";
    public static final String NBT_ITEM_TRANSMUTATION_GUI_OPEN = "itemTransmutationGuiOpen";
    public static final String NBT_ITEM_ALCHEMICAL_BAG_GUI_OPEN = "itemAlchemicalBagGuiOpen";
    public static final String NBT_ITEM_DISPLAY = "display";
    public static final String NBT_ITEM_COLOR = "color";
    public static final String NBT_TE_STATE_KEY = "teState";
    public static final String NBT_TE_CUSTOM_NAME = "CustomName";
    public static final String NBT_TE_DIRECTION_KEY = "teDirection";
    public static final String NBT_ENCODED_RECIPE_OUTPUT = "recipeOutput";
    public static final String NBT_ENCODED_RECIPE_INPUTS = "recipeInputs";
    public static final String NBT_ENCODED_RECIPE_INPUT_PREFIX = "recipeInput_";
    public static final String NBT_ENCODED_ATTR_TYPE = "type";
    public static final String NBT_ENCODED_ATTR_TYPE_ITEM = "ItemStack";
    public static final String NBT_ENCODED_ATTR_TYPE_ORE = "OreStack";
    public static final String NBT_ENCODED_ATTR_TYPE_ENERGY = "EnergyStack";
    public static final String NBT_ENCODED_ATTR_SIZE = "Count";
    public static final String NBT_ENCODED_ATTR_ITEM_ID = "id";
    public static final String NBT_ENCODED_ATTR_ITEM_META = "Damage";
    public static final String NBT_ENCODED_ATTR_ITEM_TAG_COMPOUND = "tag";
    public static final String NBT_ENCODED_ATTR_ORE_NAME = "oreName";
    public static final String NBT_ENCODED_ATTR_ENERGY_NAME = "energyName";

    /* Block name constants */
    public static final String CALCINATOR_NAME = "calcinator";
    public static final String ALUDEL_NAME = "aludel";
    public static final String ALCHEMICAL_CHEST_NAME = "alchemicalChest";
    public static final String GLASS_BELL_NAME = "glassBell";
    public static final String RED_WATER_STILL_NAME = "redWaterStill";
    public static final String RED_WATER_FLOWING_NAME = "redWaterFlowing";

    /* Item name constants */
    public static final String MINIUM_SHARD_NAME = "shardMinium";
    public static final String INERT_STONE_NAME = "stoneInert";
    public static final String MINIUM_STONE_NAME = "stoneMinium";
    public static final String PHILOSOPHERS_STONE_NAME = "stonePhilosophers";
    public static final String ALCHEMICAL_DUST_NAME = "alchemicalDust";
    public static final String ALCHEMICAL_BAG_NAME = "alchemicalBag";

    /* TileEntity name constants */
    public static final String TE_CALCINATOR_NAME = "tileCalcinator";
    public static final String TE_ALUDEL_NAME = "tileAludel";
    public static final String TE_ALCHEMICAL_CHEST_NAME = "tileAlchemicalChest";
    public static final String TE_GLASS_BELL_NAME = "tileGlassBell";

    /* Transmutation cost related constants */
    public static final String TRANSMUTATION_COST = "_cost";
    public static final String TRANSMUTATION_COST_ITEM = "item" + TRANSMUTATION_COST;
    public static final String TRANSMUTATION_COST_BLOCK = "block" + TRANSMUTATION_COST;
    public static final String TRANSMUTATION_COST_MOB = "mob" + TRANSMUTATION_COST;

    /* Container related constants */
    public static final String CONTAINER_CALCINATOR_NAME = "container." + CALCINATOR_NAME;
    public static final String CONTAINER_ALUDEL_NAME = "container." + ALUDEL_NAME;
    public static final String CONTAINER_ALCHEMICAL_CHEST_NAME = "container." + ALCHEMICAL_CHEST_NAME;
    public static final String CONTAINER_ALCHEMICAL_BAG_NAME = "container." + ALCHEMICAL_BAG_NAME;
    public static final String CONTAINER_GLASS_BELL_NAME = "container." + GLASS_BELL_NAME;
    public static final String CONTAINER_INVENTORY = "container.inventory";
    public static final String CONTAINER_PORTABLE_CRAFTING = "container.crafting";
    
    /* InterModCommunications related constants */
    public static final String IMC_ADD_RECIPE_KEY = "add-recipe";
    public static final String IMC_SET_EMC_VALUE = "set-emc-value";
    public static final String IMC_ADD_BLACKLIST_ENTRY = "add-entry-emc-blacklist";

}
