package eu.shiggy.discord.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordSetCommand implements CommandExecutor {
    private static String discord = "https://discord.gg/WxGefMUre9";
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;


            player.sendMessage(discord);
            return true;

    }
}
