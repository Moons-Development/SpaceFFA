package anhuarruiz.dev.ffa.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class CC {

    public static void log(String message) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
    public static String color(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
