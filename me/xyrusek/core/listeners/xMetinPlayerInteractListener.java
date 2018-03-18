package me.xyrusek.core.listeners;

import me.xyrusek.core.functions.FixColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class xMetinPlayerInteractListener implements Listener
{
  static ItemStack puste = new ItemStack(Material.STAINED_GLASS_PANE, 1, DyeColor.BLACK.getData());
  
  public static ItemStack createItemStackTAK() {
    ItemStack tak = new ItemStack(Material.STAINED_CLAY, 1, DyeColor.LIME.getData());
    ItemMeta takMeta = tak.getItemMeta();
    takMeta.setDisplayName(FixColor.colorize("&2&lTAK"));
    tak.setItemMeta(takMeta);
    return tak;
  }
  
  public static ItemStack createItemStackNIE() {
    ItemStack nie = new ItemStack(Material.STAINED_CLAY, 1, DyeColor.RED.getData());
    ItemMeta nieMeta = nie.getItemMeta();
    nieMeta.setDisplayName(FixColor.colorize("&c&lNIE"));
    nie.setItemMeta(nieMeta);
    return nie;
  }
  
  public static ItemStack createItemStackUlepszony1() {
    ItemStack ulepszony1 = new ItemStack(Material.DIAMOND_SWORD, 1);
    ItemMeta ulepszony1Meta = ulepszony1.getItemMeta();
    ulepszony1Meta.setDisplayName(FixColor.colorize("&bDiamentowy Miecz &7&l[&c&l+1&7&l]"));
    ulepszony1Meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
    ulepszony1.setItemMeta(ulepszony1Meta);
    return ulepszony1;
  }
  
  public static ItemStack createItemStackUlepszony2() {
    ItemStack ulepszony2 = new ItemStack(Material.DIAMOND_SWORD, 1);
    ItemMeta ulepszony2Meta = ulepszony2.getItemMeta();
    ulepszony2Meta.setDisplayName(FixColor.colorize("&bDiamentowy Miecz &7&l[&c&l+2&7&l]"));
    ulepszony2Meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
    ulepszony2.setItemMeta(ulepszony2Meta);
    return ulepszony2;
  }
  
  public static ItemStack createItemStackUlepszony3() {
    ItemStack ulepszony3 = new ItemStack(Material.DIAMOND_SWORD, 1);
    ItemMeta ulepszony3Meta = ulepszony3.getItemMeta();
    ulepszony3Meta.setDisplayName(FixColor.colorize("&bDiamentowy Miecz &7&l[&c&l+3&7&l]"));
    ulepszony3Meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
    ulepszony3.setItemMeta(ulepszony3Meta);
    return ulepszony3;
  }
  
  public static ItemStack createItemStackUlepszony4() { ItemStack ulepszony4 = new ItemStack(Material.DIAMOND_SWORD, 1);
    ItemMeta ulepszony4Meta = ulepszony4.getItemMeta();
    ulepszony4Meta.setDisplayName(FixColor.colorize("&bDiamentowy Miecz &7&l[&c&l+4&7&l]"));
    ulepszony4Meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
    ulepszony4.setItemMeta(ulepszony4Meta);
    return ulepszony4;
  }
  
  public static ItemStack createItemStackUlepszony5() { ItemStack ulepszony5 = new ItemStack(Material.DIAMOND_SWORD, 1);
    ItemMeta ulepszony5Meta = ulepszony5.getItemMeta();
    ulepszony5Meta.setDisplayName(FixColor.colorize("&bDiamentowy Miecz &7(&c&l+5&7)"));
    ulepszony5Meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
    ulepszony5.setItemMeta(ulepszony5Meta);
    return ulepszony5;
  }
  
  public static Inventory myInventory = org.bukkit.Bukkit.createInventory(null, 27, FixColor.colorize("&2&lCZY NAPEWNO CHCESZ ULEPSZYC?"));
  
  static { myInventory.setItem(0, puste);
    myInventory.setItem(1, puste);
    myInventory.setItem(2, puste);
    myInventory.setItem(3, puste);
    myInventory.setItem(4, puste);
    myInventory.setItem(5, puste);
    myInventory.setItem(6, puste);
    myInventory.setItem(7, puste);
    myInventory.setItem(8, puste);
    myInventory.setItem(9, puste);
    myInventory.setItem(10, createItemStackTAK());
    myInventory.setItem(16, createItemStackNIE());
    myInventory.setItem(17, puste);
    myInventory.setItem(18, puste);
    myInventory.setItem(19, puste);
    myInventory.setItem(20, puste);
    myInventory.setItem(21, puste);
    myInventory.setItem(22, puste);
    myInventory.setItem(23, puste);
    myInventory.setItem(24, puste);
    myInventory.setItem(25, puste);
    myInventory.setItem(26, puste);
  }
  
  @EventHandler
  public void OnInventoryClick(InventoryClickEvent event) {
    Player p = (Player)event.getWhoClicked();
    Inventory inventory = event.getInventory();
    ItemStack ItemStack = new ItemStack(Material.DIAMOND_SWORD, 1);
    ItemStack ulepszony1 = createItemStackUlepszony1();
    ItemStack ulepszony2 = createItemStackUlepszony2();
    ItemStack ulepszony3 = createItemStackUlepszony3();
    ItemStack ulepszony4 = createItemStackUlepszony4();
    ItemStack ulepszony5 = createItemStackUlepszony5();
    if (inventory.getName().equals(myInventory.getName())) {
      event.setCancelled(true);
      if (event.getSlot() == 10) {
        if (p.getInventory().contains(ItemStack)) {
          p.closeInventory();
          p.getInventory().removeItem(new ItemStack[] { ItemStack });
          if (Math.random() * 100.0D <= 80.0D) {
            p.getInventory().addItem(new ItemStack[] { ulepszony1 });
            p.sendMessage(FixColor.colorize("&2&lGRATULACJE! &7Udalo ci sie ulepszyc twoj miecz na poziom &7&l[&c&l+1&7&l]"));
          } else {
            p.sendMessage(FixColor.colorize("&c&lNIESTETY! &7Nie udalo ci sie ulepszyc twojego miecza na poziom &7&l[&c&l+1&7&l]"));
          }
          return;
        }
        if (p.getInventory().contains(ulepszony1)) {
          p.closeInventory();
          p.getInventory().removeItem(new ItemStack[] { ulepszony1 });
          if (Math.random() * 100.0D <= 70.0D) {
            p.getInventory().addItem(new ItemStack[] { ulepszony2 });
            p.sendMessage(FixColor.colorize("&2&lGRATULACJE! &7Udalo ci sie ulepszyc twoj miecz na poziom &7&l[&c&l+2&7&l]"));
          } else {
            p.sendMessage(FixColor.colorize("&c&lNIESTETY! &7Nie udalo ci sie ulepszyc twojego miecza na poziom &7&l[&c&l+2&7&l]"));
          }
          return;
        }
        if (p.getInventory().contains(ulepszony2)) {
          p.closeInventory();
          p.getInventory().removeItem(new ItemStack[] { ulepszony2 });
          if (Math.random() * 100.0D <= 50.0D) {
            p.getInventory().addItem(new ItemStack[] { ulepszony3 });
            p.sendMessage(FixColor.colorize("&2&lGRATULACJE! &7Udalo ci sie ulepszyc twoj miecz na poziom &7&l[&c&l+3&7&l]"));
          } else {
            p.sendMessage(FixColor.colorize("&c&lNIESTETY! &7Nie udalo ci sie ulepszyc twojego miecza na poziom &7&l[&c&l+3&7&l]"));
          }
          return;
        }
        if (p.getInventory().contains(ulepszony3)) {
          p.closeInventory();
          p.getInventory().removeItem(new ItemStack[] { ulepszony3 });
          if (Math.random() * 100.0D <= 30.0D) {
            p.getInventory().addItem(new ItemStack[] { ulepszony4 });
            p.sendMessage(FixColor.colorize("&2&lGRATULACJE! &7Udalo ci sie ulepszyc twoj miecz na poziom &7&l[&c&l+4&7&l]"));
          } else {
            p.sendMessage(FixColor.colorize("&c&lNIESTETY! &7Nie udalo ci sie ulepszyc twojego miecza na poziom &7&l[&c&l+4&7&l]"));
          }
          return;
        }
        if (p.getInventory().contains(ulepszony4)) {
          p.closeInventory();
          p.getInventory().removeItem(new ItemStack[] { ulepszony4 });
          if (Math.random() * 100.0D <= 30.0D) {
            p.getInventory().addItem(new ItemStack[] { ulepszony5 });
            p.sendMessage(FixColor.colorize("&2&lGRATULACJE! &7Udalo ci sie ulepszyc twoj miecz na poziom &7&l[&c&l+5&7&l]"));
          } else {
            p.sendMessage(FixColor.colorize("&c&lNIESTETY! &7Nie udalo ci sie ulepszyc twojego miecza na poziom &7&l[&c&l+5&7&l]"));
          }
        }
      }
      else if (event.getSlot() == 16) {
        p.closeInventory();
      }
    }
  }
  
  @EventHandler
  public void onRightClickOnAnvil(PlayerInteractEvent event) {
    Player p = event.getPlayer();
    Material block = event.getClickedBlock().getType();
    PlayerInventory inventory = p.getInventory();
    ItemStack ItemStack = new ItemStack(Material.DIAMOND_SWORD, 1);
    ItemStack ulepszony1 = createItemStackUlepszony1();
    ItemStack ulepszony2 = createItemStackUlepszony2();
    ItemStack ulepszony3 = createItemStackUlepszony3();
    ItemStack ulepszony4 = createItemStackUlepszony4();
    if ((block == Material.ANVIL) && 
      (event.getAction() == Action.RIGHT_CLICK_BLOCK)) {
      if ((inventory.contains(ItemStack)) || (inventory.contains(ulepszony1)) || (inventory.contains(ulepszony2)) || (inventory.contains(ulepszony3)) || (inventory.contains(ulepszony4))) {
        p.openInventory(myInventory);
      } else {
        p.sendMessage(FixColor.colorize("&4&lBLAD! &7Nie posiadasz wymaganego przedmiotu."));
      }
      event.setCancelled(true);
    }
  }
  
  public xMetinPlayerInteractListener() {}
}
