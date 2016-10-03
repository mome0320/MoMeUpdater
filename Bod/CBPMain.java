package milkyway.CBP;

import java.util.List;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.block.Dispenser;
import org.bukkit.block.Dropper;
import org.bukkit.block.Hopper;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.Inventory;

public class CBPMain
  extends org.bukkit.plugin.java.JavaPlugin
  implements org.bukkit.event.Listener
{
  public CBPMain() {}
  
  public void onEnable() { org.bukkit.Bukkit.getPluginManager().registerEvents(this, this); }
  
  @org.bukkit.event.EventHandler
  public void Break(BlockBreakEvent e) {
    if (e.getBlock().getType() == Material.CHEST)
    {
      Chest c = (Chest)e.getBlock().getState();
      c = (Chest)e.getBlock().getState();
      if (c.getInventory().getViewers().size() >= 1) {
        e.setCancelled(true);
        e.getPlayer().sendMessage("§9[ChestBugPrevent] §c누군가가 체스트를 열고 있을때에는 체스트 파괴가 불가능합니다.");
      }
    }
    else if (e.getBlock().getType() != Material.ANVIL)
    {
      if (e.getBlock().getType() == Material.DISPENSER) {
        Dispenser sor = (Dispenser)e.getBlock().getState();
        
        if (sor.getInventory().getViewers().size() >= 1) {
          e.setCancelled(true);
          e.getPlayer().sendMessage("§9[ChestBugPrevent] §c누군가가 체스트를 열고 있을때에는 체스트 파괴가 불가능합니다.");
        }
      } else if (e.getBlock().getType() == Material.DROPPER) {
        Dropper sor = (Dropper)e.getBlock().getState();
        
        if (sor.getInventory().getViewers().size() >= 1) {
          e.setCancelled(true);
          e.getPlayer().sendMessage("§9[ChestBugPrevent] §c누군가가 체스트를 열고 있을때에는 체스트 파괴가 불가능합니다.");
        }
      } else if (e.getBlock().getType() == Material.HOPPER) {
        Hopper sor = (Hopper)e.getBlock().getState();
        
        if (sor.getInventory().getViewers().size() >= 1) {
          e.setCancelled(true);
          e.getPlayer().sendMessage("§9[ChestBugPrevent] §c누군가가 체스트를 열고 있을때에는 체스트 파괴가 불가능합니다.");
        }
      } else if (e.getBlock().getType() == Material.BREWING_STAND) {
        org.bukkit.block.BrewingStand sor = (org.bukkit.block.BrewingStand)e.getBlock().getState();
        
        if (sor.getInventory().getViewers().size() >= 1) {
          e.setCancelled(true);
          e.getPlayer().sendMessage("§9[ChestBugPrevent] §c누군가가 체스트를 열고 있을때에는 체스트 파괴가 불가능합니다.");
        }
      }
    }
  }
}
