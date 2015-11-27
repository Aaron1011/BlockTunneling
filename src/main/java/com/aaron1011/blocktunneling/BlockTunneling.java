package com.aaron1011.blocktunneling;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = "blocktunneling")
public class BlockTunneling {

    private PassableBlock passableBlock = new PassableBlock(Material.rock);

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        GameRegistry.registerBlock(passableBlock, "passable_block");
    }

}
