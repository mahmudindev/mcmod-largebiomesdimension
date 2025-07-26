package com.github.mahmudindev.mcmod.largebiomesdimension.forge;

import com.github.mahmudindev.mcmod.largebiomesdimension.LargeBiomesDimension;
import net.minecraftforge.fml.common.Mod;

@Mod(LargeBiomesDimension.MOD_ID)
public final class LargeBiomesDimensionForge {
    public LargeBiomesDimensionForge() {
        // Run our common setup.
        LargeBiomesDimension.init();
    }
}
