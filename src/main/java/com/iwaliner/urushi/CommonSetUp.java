package com.iwaliner.urushi;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;


@Mod.EventBusSubscriber(modid = ModCoreUrushi.ModID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonSetUp {
    @SubscribeEvent
    public static void RegisterRendererEvent(FMLCommonSetupEvent event) {

    }
}
