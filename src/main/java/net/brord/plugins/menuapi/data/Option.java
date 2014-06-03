package net.brord.plugins.menuapi.data;

import org.bukkit.inventory.ItemStack;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.data.Option.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 15:50:23
 */
public class Option {
	
	ItemStack item;
	Runnable onClick;

	/**
	 * 
	 */
	public Option() {
	}

	/**
	  * @see java.lang.Object#toString()
	  */
	@Override
	public String toString() {
		return item.getItemMeta().getDisplayName();
	}
}
