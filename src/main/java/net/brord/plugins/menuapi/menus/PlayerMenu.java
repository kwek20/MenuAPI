package net.brord.plugins.menuapi.menus;

import java.util.List;

import org.bukkit.event.Listener;

import net.brord.plugins.menuapi.data.Menu;
import net.brord.plugins.menuapi.data.Page;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.menus.PlayerMenu.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 15:53:32
 */
public abstract class PlayerMenu implements GUI, Listener {

	private Menu menu;
	private int page = 0;

	/**
	 * 
	 */
	public PlayerMenu(Menu menu) {
		this.menu = menu;
	}
	
	Page getCurrentPage(){
		return menu.getPage(page);
	}
}
