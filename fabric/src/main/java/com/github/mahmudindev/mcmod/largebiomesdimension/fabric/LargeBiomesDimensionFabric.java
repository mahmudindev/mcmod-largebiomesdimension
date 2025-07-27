package com.github.mahmudindev.mcmod.largebiomesdimension.fabric;

import com.github.mahmudindev.mcmod.largebiomesdimension.LargeBiomesDimension;
import net.fabricmc.api.ModInitializer;

public final class LargeBiomesDimensionFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        LargeBiomesDimension.init();
    }
}
