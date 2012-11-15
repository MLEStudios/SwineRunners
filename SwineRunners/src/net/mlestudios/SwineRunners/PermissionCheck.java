package net.mlestudios.SwineRunners;

import org.bukkit.entity.Player;

public class PermissionCheck extends Main {

	public PermissionCheck(){
	}
	
	public static boolean CheckPermission(Player player, String permission)
	{
		if(player != null)
		{
			if(Config.PermissionsEnabled)
			{
				if(player.isOp()) { return true; }
				else if(player.hasPermission(permission)) { return true; }
			}
			else { return true; }
		}
		return false;
	}
}