package eu.shiggy.discord;

import eu.shiggy.discord.Commands.DiscordSetCommand;
import eu.shiggy.discord.Events.PlayerClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Discord extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("Discord").setExecutor(new DiscordSetCommand());
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new PlayerClickEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
