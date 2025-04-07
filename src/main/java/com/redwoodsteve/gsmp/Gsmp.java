package com.redwoodsteve.gsmp;

import org.bukkit.plugin.java.JavaPlugin;

public final class Gsmp extends JavaPlugin {
    // hello from laptop!
    @Override
    public void onEnable() {
        getLogger().info("HELLO GOOBERS!");
    }

    @Override
    public void onDisable() {
        getLogger().info("bye bye goobers");
    }
}
