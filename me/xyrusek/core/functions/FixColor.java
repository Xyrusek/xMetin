package me.xyrusek.core.functions;

import org.bukkit.plugin.java.JavaPlugin;

public class FixColor extends JavaPlugin {
  public FixColor() {}
  
  public static String colorize(String msg) {
    String coloredMsg = "";
    for (int i = 0; i < msg.length(); i++)
    {
      if (msg.charAt(i) == '&') {
        coloredMsg = coloredMsg + '§';
      } else
        coloredMsg = coloredMsg + msg.charAt(i);
    }
    return coloredMsg;
  }
}
