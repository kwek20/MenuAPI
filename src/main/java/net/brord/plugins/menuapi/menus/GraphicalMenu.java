package net.brord.plugins.menuapi.menus;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

import com.dsh105.holoapi.api.Hologram;
import com.dsh105.holoapi.api.HologramFactory;

import net.brord.plugins.menuapi.MenuAPI;
import net.brord.plugins.menuapi.data.Menu;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.menus.GraphicalMenu.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 16:19:22
 */
public class GraphicalMenu extends PlayerMenu {

	private Hologram hologram;
	
	/**
	 * @param menu
	 */
	public GraphicalMenu(Menu menu) {
		super(menu);
		initHologram();
	}

	/**
	 * 
	 */
	private void initHologram() {
		hologram = new HologramFactory(MenuAPI.getInstance())
			.withText(getCurrentPage().getOptions().toArray(new String[0]))
			.build();
	}

	/**
	  * @see net.brord.plugins.menuapi.menus.GUI#assignToPlayer(org.bukkit.entity.Player)
	  */
	public boolean assignToPlayer(@Nonnull Player player) {
		hologram.show(player, player.getLocation());
		return true;
	}

	/**
	  * @see net.brord.plugins.menuapi.menus.GUI#removeFromPlayer(org.bukkit.entity.Player)
	  */
	public boolean removeFromPlayer(@Nonnull Player player) {
		hologram.clear(player);
		return true;
	}

}
