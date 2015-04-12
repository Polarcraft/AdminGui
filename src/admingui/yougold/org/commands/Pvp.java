package admingui.yougold.org.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pvp implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	{
		Player p = (Player) sender;
		boolean pvp = p.getWorld().getPVP();
		if(cmd.getName().equalsIgnoreCase("pvp")) {
			if(pvp == true) {
				p.getWorld().setPVP(false);
				sender.sendMessage("Pvp is now set to false!");
			} else if (pvp == false) {
				p.getWorld().setPVP(true);
				sender.sendMessage("Pvp is now set to true!");
			}
		}
		return false;
	}
}
