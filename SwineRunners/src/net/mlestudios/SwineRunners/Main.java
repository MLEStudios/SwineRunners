package net.mlestudios.SwineRunners;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	String consolePrefix = "SwineRunners";

	public void onEnable()
	{
		info(this.consolePrefix + " is now Enabled");
		
	}
	
	public void onDisable()
	{
		info(this.consolePrefix + " is now disabled.");
	}
	
	/**
	 * MatthewEnderle - 11/14/2012
	 * Logging System to be replaced by a More-Generic API in the future.
	 * 
	 */
	
	private static Logger get_logger()
	{
		return Logger.getLogger("Minecraft");
	}
	
	public static void info(String message)
	{
		get_logger().info(message);
	}
	
	public static void warning(String message)
	{
		get_logger().warning(message);
	}
	
	public static void severe(String message)
	{
		get_logger().severe(message);
	}
	
	/**
	 * MatthewEnderle - 11/14/2012
	 * Commands and Handlers
	 * 
	 */
	
	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        boolean IsPlyr = false;
        Player player = null;
        if (sender instanceof Player) 
        {
            player = (Player) sender;
            IsPlyr = true;
        }
        if (IsPlyr == false) { // console commands
            if (cmd.getName().equalsIgnoreCase("swr")) {
                info("Test MEssage for Console");
            }
        } else { // is player commands
            if (cmd.getName().equalsIgnoreCase("swr"))
            {            	
				// run help command by default
				if(args.length <= 0) { args = new String[] { "help" }; }
            	
				// check for help command
				if(args.length > 0 && args[0].equalsIgnoreCase("help"))
				{
					Help.helpSWR(player);
				}
				
	// Leave
				if(args.length > 0 && args[0].equalsIgnoreCase("leave"))
				{
					Game.inGame(player, 0);
				}
				
	// Join
				if(args.length > 0 && args[0].equalsIgnoreCase("join"))
				{
					Game.inGame(player, 1);
				}
            }
        }
        return false;
    }
	
}
