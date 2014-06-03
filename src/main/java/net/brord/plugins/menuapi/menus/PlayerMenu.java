package net.brord.plugins.menuapi.menus;

import net.brord.plugins.menuapi.data.Menu;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.menus.PlayerMenu.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 15:53:32
 */
public abstract class PlayerMenu implements GUI {

	private Menu menu;

	/**
	 * 
	 */
	public PlayerMenu(Menu menu) {
		this.menu = menu;
	}
}
