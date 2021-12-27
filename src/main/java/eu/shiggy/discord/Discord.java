package eu.shiggy.discord;

import eu.shiggy.discord.Commands.DiscordSetCommand;
import eu.shiggy.discord.Commands.Shootmode;
import eu.shiggy.discord.Events.PlayerClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Discord extends JavaPlugin {
public static ArrayList<Player>ShootMode = new ArrayList<>();
    @Override
    public void onEnable() {
        getCommand("Discord").setExecutor(new DiscordSetCommand());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerClickEvent(), this);
        getCommand("ShootMode").setExecutor(new Shootmode());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
