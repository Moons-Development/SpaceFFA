package anhuar.moons.ffa.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Util {

    public static void log(String message) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
    public static String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
