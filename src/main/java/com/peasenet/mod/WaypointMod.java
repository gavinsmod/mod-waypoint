package com.peasenet.mod;

import com.peasenet.config.WaypointConfig;
import com.peasenet.main.Settings;
import com.peasenet.mods.render.ModWaypoint;
import com.peasenet.main.GavinsMod;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WaypointMod implements ModInitializer {

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Settings.addConfig(new WaypointConfig());
        GavinsMod.addMod(new ModWaypoint());
    }
}
