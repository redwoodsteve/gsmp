package com.redwoodsteve.gsmp;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import com.redwoodsteve.gsmp.spaceWorld.*;
import org.jetbrains.annotations.NotNull;

public final class Gsmp extends JavaPlugin {
    // hello from laptop!
    @Override
    public void onEnable() {
        getLogger().info("HELLO GOOBERS!");
        if (Bukkit.getWorld("space") == null) {
            GenerateWorld.generate();
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("bye bye goobers");
    }

    @Override
    public boolean onCommand (@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equals("space")) {
            Bukkit.getPlayer(sender.getName()).teleport(Bukkit.getWorld("space").getSpawnLocation());
            return true;
        }
        return false;
    }
}
