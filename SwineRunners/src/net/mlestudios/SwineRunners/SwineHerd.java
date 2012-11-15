package net.mlestudios.SwineRunners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import net.minecraft.server.World;

public class SwineHerd extends Main {

	public static void spawnPig(Player player)
	{

		player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG);
	}
}
