package eu.shiggy.discord.Events;



import eu.shiggy.discord.Discord;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;

import org.bukkit.entity.Fireball;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import static org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK;

public class PlayerClickEvent implements Listener {
    static String ShootModer = "true";
    @EventHandler()
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack stick = new ItemStack(Material.STICK,1);
        ItemMeta stickmeta = stick.getItemMeta();

        if (Discord.ShootMode.contains(player)) {
            if(event.getAction() == Action.RIGHT_CLICK_AIR | event.getAction() == RIGHT_CLICK_BLOCK) {
                if (event.getMaterial().equals(Material.STICK)){
                    Fireball fireball = event.getPlayer().getWorld().spawn(event.getPlayer().getEyeLocation(), Fireball.class);
                    player.sendMessage(ChatColor.RED +"FIREBALL!!","");
                    player.playSound(player.getLocation(), Sound.BLOCK_ANCIENT_DEBRIS_FALL,2000000, 200000 );
                }
            }
        }
    }
}
