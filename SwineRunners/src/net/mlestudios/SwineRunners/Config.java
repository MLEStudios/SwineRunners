package net.mlestudios.SwineRunners;

import org.bukkit.configuration.Configuration;

public class Config {
	public static boolean PermissionsEnabled;

	private static Configuration config;
	
	public Config(Main plugin)
	{
		config = plugin.getConfig();
		config.options().copyDefaults(true);
		plugin.saveConfig();
		
		PermissionsEnabled = config.getBoolean("Config.enable_permissions");
		
	}
}
