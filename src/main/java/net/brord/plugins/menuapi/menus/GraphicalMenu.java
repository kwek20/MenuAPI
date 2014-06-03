package net.brord.plugins.menuapi.menus;

import org.bukkit.entity.Player;

import net.brord.plugins.menuapi.data.Menu;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.menus.GraphicalMenu.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 16:19:22
 */
public class GraphicalMenu extends PlayerMenu {

	/**
	 * @param menu
	 */
	public GraphicalMenu(Menu menu) {
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
