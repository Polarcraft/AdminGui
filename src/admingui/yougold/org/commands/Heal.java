package admingui.yougold.org.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player p = (Player)sender;
		if(cmd.getName().equalsIgnoreCase("heal")) {
			if(sender.hasPermission("Admin.heal")) {
				if(!(p.getHealth() <20)) {
					sender.sendMessage(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "You are unable to heal!");
				} else if(p.getHealth() <20) {
					p.setHealth(20);
					sender.sendMessage(ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD + "You are now healed!");
				}
			}
		}
		return false;
	}
}
