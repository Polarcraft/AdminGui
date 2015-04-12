package admingui.yougold.org.events;

import admingui.yougold.org.Main;

import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuClickListener implements Listener {
	
	@EventHandler
	public void onClick(InventoryClickEvent event){
		HumanEntity entity = event.getWhoClicked();
		if ((entity instanceof Player)){
			Player player = (Player)entity;
			
			if (event.getInventory().getName().equals(Main.getAdminInventory().getName())){
				
				event.setCancelled(true);
				
				ItemStack clicked = event.getCurrentItem();
				if (clicked!=null){
					//PVP
					if (clicked.getType()==Material.GOLD_SWORD){
						player.closeInventory();
						player.chat("/pvp");
					//FEED
					} else if (clicked.getType()==Material.APPLE) {
						player.closeInventory();
						player.chat("/feed");
					//HEAL
					} else if (clicked.getType()==Material.GOLDEN_APPLE) {
						player.closeInventory();
						player.chat("/heal");
					}
					
				}
				
			}
			
		}
	}
 
}
