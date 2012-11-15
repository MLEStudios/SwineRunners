package net.mlestudios.SwineRunners;

import java.util.Vector;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Game extends Main {

	private static String pluginTitle = "SwineRunners";
	private static String chatIndent = "   ";
	
	public static Vector<String> playing_users;

	
	public static void inGame(Player player, int a)
	{
		//if(PermissionCheck.CheckPermission(player, Permissions.play()))
		//{
			player.sendMessage(ChatColor.GRAY + "================ " + ChatColor.RED + pluginTitle + ChatColor.GRAY + " ================");

			if(a == 1)
			{
				// initialize vector if not already initialized
				if(playing_users == null) { playing_users = new Vector<String>(); }
				player.sendMessage("");
				player.sendMessage(chatIndent + ChatColor.GRAY + "You have sucessfully joined the race.");
				player.sendMessage("");

				// see if the user is already disabled
				final int indexOfPlayer = playing_users.indexOf(player.getName());
				if(indexOfPlayer < -1)
				{
					// add the player to the list
					playing_users.add(player.getName());
					// inform the player
				}
			}
			else
			{
				// initialize vector if not already initialized
				if(playing_users == null) { playing_users = new Vector<String>(); }
				player.sendMessage("");
				player.sendMessage(chatIndent + ChatColor.GRAY + "You have sucessfully left the race.");
				player.sendMessage("");

				// see if the user is already disabled
				final int indexOfPlayer = playing_users.indexOf(player.getName());
				if(indexOfPlayer > -1)
				{
					// remove the player from list
					playing_users.remove(indexOfPlayer);
					// tell the player
				}
			}
			

		//}
	}
}
