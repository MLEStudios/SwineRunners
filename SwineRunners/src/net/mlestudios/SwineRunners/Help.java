package net.mlestudios.SwineRunners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Help extends Main {
	
	private static String pluginTitle = "SwineRunners";
	private static String chatIndent = "   ";
	
	public static void helpSWR(Player player)
	{
		player.sendMessage("");
		player.sendMessage(ChatColor.GRAY + "================ " + ChatColor.RED + pluginTitle + ChatColor.GRAY + " ================");
		player.sendMessage(ChatColor.DARK_AQUA + "-" + ChatColor.GRAY + " /swr " + ChatColor.RED + "join " + ChatColor.GRAY + "<-- Join the Next available race.");
		player.sendMessage(ChatColor.DARK_AQUA + "-" + ChatColor.GRAY + " /swr " + ChatColor.RED + "leave " + ChatColor.GRAY + "<-- Leave the current race.");
	}
	
}
