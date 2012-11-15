package net.mlestudios.SwineRunners;

import java.util.Vector;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.entity.CraftEntity;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import net.minecraft.server.World;

public class SwineHerd extends Main {

	private static Vector<String> pigs;
	
	public static void spawnPig(Player player)
	{

		//player.getWorld().spawnEntity(player.getLocation(), EntityType.PIG);
		//((CraftEntity)player).getHandle().setPassengerOf(((CraftEntity)player.getNearbyEntities(1, 1, 1)).getHandle());
		// player.getNearbyEntities(1, 1, 1);
	}
}
