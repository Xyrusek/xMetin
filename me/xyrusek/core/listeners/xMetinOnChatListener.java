package me.xyrusek.core.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class xMetinOnChatListener implements Listener
{
  public xMetinOnChatListener() {}
  
  @EventHandler
  public void OnChat(AsyncPlayerChatEvent e)
  {
    String msg = e.getMessage();
    e.setCancelled(true);
    org.bukkit.Bukkit.broadcastMessage(me.xyrusek.core.functions.FixColor.colorize("&7" + e.getPlayer().getName() + "&8: &7" + msg));
  }
}
