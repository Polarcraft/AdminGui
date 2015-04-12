package admingui.yougold.org;

import java.util.ArrayList;
import java.util.List;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import admingui.yougold.org.commands.Feed;
import admingui.yougold.org.commands.Heal;
import admingui.yougold.org.commands.Menu;
import admingui.yougold.org.commands.Pvp;
import admingui.yougold.org.events.MenuClickListener;

public class Main extends JavaPlugin {

	public void onEnable() {
		//Implements Commands/Listeners
		getServer().getPluginManager().registerEvents(new MenuClickListener(), this);
		getCommand("feed").setExecutor(new Feed());
		getCommand("heal").setExecutor(new Heal());
		getCommand("admin").setExecutor(new Menu());
		getCommand("pvp").setExecutor(new Pvp());
	}
	
	public static Inventory getAdminInventory(){
		Inventory inv = Bukkit.createInventory(null, 9, "Admin Menu!");
		{
			//Pvp Toggle
			ItemStack item = new ItemStack(Material.GOLD_SWORD);
			ItemMeta meta = item.getItemMeta();
			meta.setDisplayName(ChatColor.WHITE + "Toggle Pvp");
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.DARK_PURPLE + "Allows you to toggle pvp!");
			meta.setLore(lore);
			item.setItemMeta(meta);
			inv.setItem(8, item);
			
			//Feed
			ItemStack item2 = new ItemStack(Material.APPLE);
			ItemMeta meta2 = item2.getItemMeta();
			meta2.setDisplayName(ChatColor.WHITE + "Feed");
			List<String> lore2 = new ArrayList<String>();
			lore2.add(ChatColor.DARK_PURPLE + "Allows you to feed yourself!");
			meta2.setLore(lore2);
			item2.setItemMeta(meta2);
			inv.setItem(7, item2);
			
			//Heal
			ItemStack item3 = new ItemStack(Material.GOLDEN_APPLE);
			ItemMeta meta3 = item3.getItemMeta();
			meta3.setDisplayName(ChatColor.WHITE + "Heal");
			List<String> lore3 = new ArrayList<String>();
			lore3.add(ChatColor.DARK_PURPLE + "Allows you to heal yourself!");
			meta3.setLore(lore3);
			item3.setItemMeta(meta3);
			inv.setItem(6, item3);
		}
		
		return inv;
	}
}
