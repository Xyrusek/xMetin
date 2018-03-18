package me.xyrusek.core;

import org.bukkit.plugin.PluginManager;

public class Main extends org.bukkit.plugin.java.JavaPlugin
{
  public Main() {}
  
  public void onEnable() {
    System.out.println("xMetin | Autorem pluginu jest Xyrusek.");
    org.bukkit.Bukkit.getPluginManager().registerEvents(new me.xyrusek.core.listeners.xMetinPlayerInteractListener(), this);
    org.bukkit.Bukkit.getPluginManager().registerEvents(new me.xyrusek.core.listeners.xMetinOnChatListener(), this);
  }
}
