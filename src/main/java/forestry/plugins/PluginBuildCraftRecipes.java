/*******************************************************************************
 * Copyright (c) 2011-2014 SirSengir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Various Contributors including, but not limited to:
 * SirSengir (original work), CovertJaguar, Player, Binnie, MysteriousAges
 ******************************************************************************/
package forestry.plugins;

import buildcraft.api.recipes.BuildcraftRecipeRegistry;
import cpw.mods.fml.common.Optional;
import forestry.core.config.Defaults;
import forestry.core.fluids.Fluids;
import forestry.core.proxy.Proxies;

@Plugin(pluginID = "BC6|Recipes", name = "BuildCraft 6 Recipes", author = "SirSengir", url = Defaults.URL, unlocalizedDescription = "for.plugin.buildcraft6.description")
public class PluginBuildCraftRecipes extends ForestryPlugin {

	@Override
	public boolean isAvailable() {
		return Proxies.common.isAPILoaded("buildcraft.api.recipes", "[2.0, 2.1)");
	}

	@Override
	public String getFailMessage() {
		return "Compatible BuildCraftAPI|recipes version not found";
	}

	@Optional.Method(modid = "BuildCraftAPI|recipes")
	@Override
	protected void registerRecipes() {
		// Add recipe for ethanol
		BuildcraftRecipeRegistry.refinery.addRecipe("forestry:BiomassToEthanol", Fluids.BIOMASS.get(4), Fluids.BIOETHANOL.get(1), 100, 1);
	}
}