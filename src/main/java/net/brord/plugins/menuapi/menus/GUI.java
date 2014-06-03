package net.brord.plugins.menuapi.menus;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.menus.GUI.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 15:52:42
 */
public interface GUI {
	
	/**
	 * Assigns this {@link GUI} to the {@link Player}
	 * @param player The {@link Player} to assign to
	 * @return if the {@link GUI} was assigned
	 */
	boolean assignToPlayer(@Nonnull Player player);
	
	/**
	 * Removes this {@link GUI} from the {@link Player}.<br/>
	 * Does nothing if he doesn't have a {@link GUI}
	 * @param player THe {@link Player} to remove from
	 * @return if the {@link GUI} was removed.
	 */
	boolean removeFromPlayer(@Nonnull Player player);
}
