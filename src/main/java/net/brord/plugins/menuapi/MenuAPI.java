package net.brord.plugins.menuapi;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.MenuAPI.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 03:04:12
 */
public class MenuAPI extends JavaPlugin {

	private static MenuAPI plugin;
	
	/**
	 * @return
	 */
	public static MenuAPI getInstance() {
		return plugin;
	}

	
	/**
	  * @see org.bukkit.plugin.java.JavaPlugin#onEnable()
	  */
	@Override
	public void onEnable() {
		plugin = this;
	}
	
}
