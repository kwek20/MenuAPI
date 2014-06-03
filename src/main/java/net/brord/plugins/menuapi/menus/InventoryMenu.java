package net.brord.plugins.menuapi.menus;

import net.brord.plugins.menuapi.data.Menu;

import org.bukkit.entity.Player;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.menus.InventoryMenu.java<br/>
 * @author Brord
 * @since 4 jun. 2014, 00:58:54
 */
public class InventoryMenu extends PlayerMenu {

	/**
	 * @param menu
	 */
	public InventoryMenu(Menu menu) {
		super(menu);
	}

	/**
	 * @see net.brord.plugins.menuapi.menus.GUI#assignToPlayer(org.bukkit.entity.Player)
	 */
	public boolean assignToPlayer(Player player) {
		return false;
	}

	/**
	 * @see net.brord.plugins.menuapi.menus.GUI#removeFromPlayer(org.bukkit.entity.Player)
	 */
	public boolean removeFromPlayer(Player player) {
		return false;
	}

}
