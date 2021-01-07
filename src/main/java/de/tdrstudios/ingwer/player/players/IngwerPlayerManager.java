package de.tdrstudios.ingwer.player.players;
import de.bentzin.tools.register.Registerator;
import de.tdrstudios.ingwer.player.IngwerPlayer;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

import java.util.UUID;

public class IngwerPlayerManager extends Registerator{
    public IngwerPlayerManager() {
        super(IngwerPlayer.getInstance());
    }

    public IngwerPlayer getByUUIDFromList(String uuid) {
        IngwerPlayer r = IngwerPlayer.getInstance();
        for(Object object : getIndex()) {
            if(object instanceof IngwerPlayer) {
                IngwerPlayer ingwerPlayer = (IngwerPlayer) object;
                if(ingwerPlayer.getOfflinePlayer().getUniqueId().equals(uuid)) {
                    r = ingwerPlayer;
                }
                System.out.println("IngwerPlayerManager.getIngwerPlayerByUUID");
                System.out.println("ingwerPlayer = " + ingwerPlayer);
            }else {
                System.out.println("IngwerPlayerManager.getIngwerPlayerByUUID");
                System.out.println("return = " + r);
                System.out.println("object = " + object);
                System.out.println(" ");
                return null;
            }
        }
        return r;
    }

    /**
     *
     * @param uuid
     * @return the IngwerPlayer with the given UUID!
     */
    public IngwerPlayer getByUUIDFromList(UUID uuid) {
        IngwerPlayer r = IngwerPlayer.getInstance();
        for(Object object : getIndex()) {
            if(object instanceof IngwerPlayer) {
                IngwerPlayer ingwerPlayer = (IngwerPlayer) object;
                if(ingwerPlayer.getOfflinePlayer().getUniqueId().equals(uuid)) {
                    r = ingwerPlayer;
                }
                System.out.println("IngwerPlayerManager.getIngwerPlayerByUUID");
                System.out.println("ingwerPlayer = " + ingwerPlayer);
            }else {
                System.out.println("IngwerPlayerManager.getIngwerPlayerByUUID");
                System.out.println("return = " + r);
                System.out.println("object = " + object);
                System.out.println(" ");
                return null;
            }
        }
        return r;
    }

    public IngwerPlayer getbyUUID(String uuid) {
        OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(uuid);
        IngwerPlayer ingwerPlayer = new IngwerPlayer(offlinePlayer);
    }
}
