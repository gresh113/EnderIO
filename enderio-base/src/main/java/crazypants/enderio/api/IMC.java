package crazypants.enderio.api;

import crazypants.enderio.base.fluid.FluidFuelRegister;
import crazypants.enderio.base.item.soulvial.ItemSoulVial;
import crazypants.enderio.base.paint.PaintSourceValidator;
import crazypants.enderio.base.recipe.slicensplice.SliceAndSpliceRecipeManager;
import crazypants.enderio.base.recipe.soul.SoulBinderRecipeManager;
import crazypants.enderio.base.recipe.vat.VatRecipeManager;
import crazypants.enderio.base.teleport.TravelController;

/**
 * This class provides the keys for the IMC messages supported by EIO and links the the details of how the messages are processed. It is preferable not to refer
 * to these constants directly to avoid a dependence on this class.
 */
public final class IMC {

  /**
   * Key for a string message to add Vat recipes. Calls {@link VatRecipeManager#addCustomRecipes(String)} with the string value of the message.
   */
  public static final String VAT_RECIPE = "recipe:vat";

  /**
   * Key for a string message to add xml recipes. The supplied xml is treated as if it was loaded from one of the 'recipe_xxx.xml's.
   * 
   * Note that this does not do the recipe merging you get between core and user xmls. So you cannot disable already processed recipes.
   */
  public static final String XML_RECIPE = "recipe:xml";

  /**
   * Key for a string message to add Slice'N'Splice recipes. Calls {@link SliceAndSpliceRecipeManager#addCustomRecipes(String)} with the string value of the
   * message.
   */
  public static final String SLINE_N_SPLICE_RECIPE = "recipe:slicensplice";

  /**
   * Key for an NBT message to add Soul Binder recipes. Calls {@link SoulBinderRecipeManager#addRecipeFromNBT(net.minecraft.nbt.NBTTagCompound)} with the NBT
   * value of the message.
   */
  public static final String SOUL_BINDER_RECIPE = "recipe:soulbinder";

  /**
   * Key for an ItemStack message to add an item to the Painters paint source whitelist. Calls
   * {@link PaintSourceValidator#addToWhitelist(net.minecraft.item.ItemStack)}
   */
  public static final String PAINTER_WHITELIST_ADD = "painter:whitelist:add";

  /**
   * Key for an ItemStack message to add an item to the Painters paint source blacklist. Calls
   * {@link PaintSourceValidator#addToBlacklist(net.minecraft.item.ItemStack)}
   */
  public static final String PAINTER_BLACKLIST_ADD = "painter:blacklist:add";

  /**
   * Key for a string message to add an entity to the Soul Vial blacklist. Calls {@link ItemSoulVial#addEntityToBlackList(String)} with the string value of the
   * message.
   */
  public static final String SOUL_VIAL_BLACKLIST = "soulVial:blacklist:add";

  /**
   * Key for a string message to add an entity to the Spawner "clone instead of spawn".
   */
  public static final String SOUL_VIAL_UNSPAWNABLELIST = "soulVial:unspawnablelist:add";

  /**
   * Key for an NBT message to register a fluid fuel. Calls {@link FluidFuelRegister#addFuel(net.minecraft.nbt.NBTTagCompound)} with the NBT value of the
   * message.
   */
  public static final String FLUID_FUEL_ADD = "fluidFuel:add";

  /**
   * Key for an NBT message to register a fluid coolant. Calls {@link FluidFuelRegister#addCoolant(net.minecraft.nbt.NBTTagCompound)} with the NBT value of the
   * message.
   */
  public static final String FLUID_COOLANT_ADD = "fluidCoolant:add";

  /**
   * Key for a string message to add a block to the list of blocks that cannot be teleported through using the Staff of Travel or Dark Steel Travel Upgrade.
   * Value must be in the form: 'modid:blockName' Calls {@link TravelController#addBlockToBlinkBlackList(String)} with the string value of the message.
   */
  public static final String TELEPORT_BLACKLIST_ADD = "teleport:blacklist:add";

  /**
   * Key for an NBT message to register a block or tile entity as connectable to insulated redstone conduits. Calls
   * {@link InsulatedRedstoneConduit#addConnectableBlock(net.minecraft.nbt.NBTTagCompound)} with the NBT value of the message.
   */
  public static final String REDSTONE_CONNECTABLE_ADD = "redstone:connectable:add";

  private IMC() {
  }

}
