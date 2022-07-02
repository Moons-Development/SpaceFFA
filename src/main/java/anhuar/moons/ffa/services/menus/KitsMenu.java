package anhuar.moons.ffa.services.menus;

import anhuarruiz.dev.ffa.utils.CC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class KitsMenu implements Listener {

    public void createKitsMenu(Player player) {

        /* Nombre del Inventario */
        Inventory inv = Bukkit.createInventory((InventoryHolder)null, 27, CC.color("&6❖ &eKitsMenu"));

        /* Items dentro del Inventario */

        ItemStack item = new ItemStack(264,1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(CC.color("&6DojoKIT-1"));
        List<String> lore = new ArrayList<String>();
        lore.add(CC.color("&7&oClick para Seleccionar"));
        meta.setLore((List)lore);
        item.setItemMeta(meta);
        inv.setItem(10, item);

        item = new ItemStack( 283,1);
        meta = item.getItemMeta();
        meta.setDisplayName(CC.color("&6DojoKIT-2"));
        lore = new ArrayList<String>();
        lore.add(CC.color("&7&oClick para Seleccionar"));
        meta.setLore((List)lore);
        item.setItemMeta(meta);
        inv.setItem(12, item);

        item = new ItemStack(267,1);
        meta = item.getItemMeta();
        meta.setDisplayName(CC.color("&6DojoKIT-3")); 
        lore = new ArrayList<String>();
        lore.add(CC.color("&7&oClick para Seleccinar"));
        meta.setLore((List)lore);
        item.setItemMeta(meta);
        inv.setItem(14, item);

        item = new ItemStack(268,1);
        meta = item.getItemMeta();
        meta.setDisplayName(CC.color("&6DojoKIT-4"));
        lore = new ArrayList<String>();
        lore.add(CC.color("&7&oClick para Seleccinar"));
        meta.setLore((List)lore);
        item.setItemMeta(meta);
        inv.setItem(16, item);

        player.openInventory(inv);
    }

    @EventHandler
    public void clickKitsMenu( InventoryClickEvent event) {

         String nameKitsMenu = CC.color("&6❖ &eKitsMenu");
         String getNameKitsMenu = ChatColor.stripColor(nameKitsMenu);

         /* Accion de no poder mover Items */
        if (ChatColor.stripColor(event.getView().getTitle()).equals(getNameKitsMenu)) {
            if (event.getCurrentItem() == null || event.getSlotType() == null || event.getCurrentItem().getType() == Material.AIR) {
                event.setCancelled(true);
                return;
            }
            if (!event.getCurrentItem().hasItemMeta()) {
                event.setCancelled(true);
                return;
            }

            /* Acciones de cada Item*/
             Player player = (Player)event.getWhoClicked();
            event.setCancelled(true);

            if (event.getSlot() == 10) {
                ((Player)event.getWhoClicked()).performCommand("kit dojokit1");
                return;
            }
            if (event.getSlot() == 12) {
                ((Player)event.getWhoClicked()).performCommand("kit dojokit1");
                return;
            }
            if (event.getSlot() == 14) {
                ((Player)event.getWhoClicked()).performCommand("kit dojokit1");
            }
            if (event.getSlot() == 16) {
                ((Player) event.getWhoClicked()).performCommand("kit dojokit1");
                return;
            }
        }
    }
}
