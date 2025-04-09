package com.redwoodsteve.gsmp.spaceWorld;

import org.bukkit.World;
import org.bukkit.WorldCreator;

public class GenerateWorld {
    public static void generate() {
        WorldCreator creator = new WorldCreator("space");
        creator.environment(World.Environment.CUSTOM);
        creator.generatorSettings("3;minecraft:air;1");
        creator.createWorld();
    }
}
