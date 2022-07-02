package anhuarruiz.dev.ffa;

import anhuarruiz.dev.ffa.services.listener.user.UserListener;
import anhuarruiz.dev.ffa.utils.CC;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;

    @Override
    public void onEnable() {
        CC.log("&7(&6DojoFFA&7) &aPlugin Encendido");

        Main.instance = this;

        /* Files YAML*/

        /* Loaded Class */
    }
    @Override
    public void onDisable() {
        CC.log("&7(&6DojoFFA&7) &cPlugin Apagado");
    }
    public void loadListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();

        pluginManager.registerEvents(new UserListener(), this);

        CC.log("&7(&6DojoFFA&7) &aListener Loaded...");
    }
    public void loadCommand() {

        /*getCommand("hub").setExecutor(new HubCommand(this));*/

        CC.log("&7(&6ApolloHub&7) &aCommands Loaded...");
    }

    public static Main getInstance() {
        return Main.instance;
    }
}
