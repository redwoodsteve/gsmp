package com.redwoodsteve.gsmp.spaceWorld;

import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.generator.ChunkGenerator;

public class GenerateWorld {
    public static void generate() {
        WorldCreator creator = new WorldCreator("space");
        creator.environment(World.Environment.NORMAL);
        creator.generateStructures(false);
        creator.generator(new ChunkGenerator() {
            @Override
            public boolean shouldGenerateSurface() {
                return false;
            }

            @Override
            public boolean shouldGenerateDecorations() {
                return false;
            }

            @Override
            public boolean shouldGenerateMobs() {
                return false;
            }

            @Override
            public boolean shouldGenerateStructures() {
                return false;
            }
        });
        World world = creator.createWorld();

        if (world != null) {
            world.setGameRule(GameRule.DO_WEATHER_CYCLE, false);
            world.setGameRule(GameRule.KEEP_INVENTORY, true);
            world.setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);

            world.setPVP(false);

            world.setFullTime(18000);
            world.setStorm(false);
            world.setWeatherDuration(0);
            world.setClearWeatherDuration(Integer.MAX_VALUE);
        }
    }
}
