package net.brord.plugins.menuapi.data;

import java.util.List;

/**
 * Project menuapi<br/>
 * Class net.brord.plugins.menuapi.data.Menu.java<br/>
 * @author Brord
 * @since 3 jun. 2014, 15:50:36
 */
public class Menu {
	
	private List<Page> pages;
	private String name;

	/**
	 * 
	 */
	public Menu(String name, List<Page> pages) {
		this.name = name;
		this.pages = pages;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return the pages
	 */
	public List<Page> getPages() {
		return pages;
	}
}
