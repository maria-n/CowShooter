import org.bukkit.World;
import org.bukkit.entity.Cow;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by Maria on 6/16/2015.
 */
public class CowTask extends BukkitRunnable
{
    private World world;
    private Cow cow;

    public CowTask(World myWorld, Cow myCow)
    {
        cow = myCow;
        world = myWorld;
    }

    public void run()
    {
        /*
        Check if Cow is on Ground
            if y set explosion at cow loc
            call cancel
            if n keep burning
            set cows health max
            set fire ticks to 20
         */
    }

}
