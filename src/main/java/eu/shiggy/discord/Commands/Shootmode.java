package eu.shiggy.discord.Commands;

import eu.shiggy.discord.Discord;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Shootmode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(Discord.ShootMode.contains(player)) {
            Discord.ShootMode.remove(player);
            sender.sendMessage("Du kannst nun nicht mehr bauen");

        }else {
            Discord.ShootMode.add(player);
            sender.sendMessage(ChatColor.GREEN +"du kannst nun bauen");

        }
        return false;
    }
}
