import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

/**
 * Created by Maria on 6/16/2015.
 */
public class CowShooterListener implements Listener
{
    private JavaPlugin plugin;

    public CowShooterListener(JavaPlugin myPlugin)
    {
        plugin = myPlugin;
    }
    @EventHandler
    public void onInteract(PlayerInteractEvent event)
    {
        if(event.getAction() == Action.LEFT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_AIR)
        {
            Player p = event.getPlayer();
            if(p.getItemInHand().getType() == Material.LEATHER)
            {
                Location loc = p.getLocation();

                Vector v = loc.getDirection();
                v = v.multiply(3.0);

                Cow cow = p.getWorld().spawn(loc, Cow.class);
                cow.setVelocity(v);
                cow.setFireTicks(20);

                BukkitRunnable task = new CowTask(p.getWorld(), cow);
                task.runTaskTimer(myPlugin,0L,0L)

            }

        }
        /*
            explode on hit
         */
    }
}
