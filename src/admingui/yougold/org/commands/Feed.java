package admingui.yougold.org.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("feed")) {
			if(sender.hasPermission("admin.feed")) {
				if(!(p.getFoodLevel() < 20)) {
					sender.sendMessage(ChatColor.DARK_RED.toString() + ChatColor.BOLD + "You are unable to eat!");
				} else if(p.getFoodLevel() < 20) {
					p.setFoodLevel(20);
					sender.sendMessage(ChatColor.DARK_PURPLE.toString() + ChatColor.BOLD + "You have been feed!");
				}
			}
		}
		return false;
	}
}
