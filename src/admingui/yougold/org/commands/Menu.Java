package admingui.yougold.org.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import admingui.yougold.org.Main;

public class Menu implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("admin")) {
			if(sender.hasPermission("admin.gui")) {
				p.openInventory(Main.getAdminInventory());
			}
		}
		return false;
	}
}
