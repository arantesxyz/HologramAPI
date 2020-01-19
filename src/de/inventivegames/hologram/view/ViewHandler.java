package de.inventivegames.hologram.view;

import de.inventivegames.hologram.Hologram;
import org.bukkit.entity.Player;

public interface ViewHandler {

	/**
	 * Called when a {@link Hologram} is viewed by a player
	 *
	 * @param hologram viewed {@link Hologram}
	 * @param player   viewer
	 * @param string   content of the hologram
	 * @return The new/modified content of the hologram
	 */
	String onView(Hologram hologram, Player player, String string);

}
