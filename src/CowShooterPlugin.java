import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by Maria on 6/16/2015.
 */
public class CowShooterPlugin extends JavaPlugin
{
    public static Logger log = Logger.getLogger("Minecraft");

    @Override
    public void onEnable()
    {
        log.info("[CowShooterPlugin] Starting up....");
        getServer().getPluginManager().registerEvents(new CowShooterListener(), this);
    }


}
