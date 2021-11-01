package mods.officialy.officialyanapi;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OfficialyALibrary.MODID)
@Mod.EventBusSubscriber(modid = OfficialyALibrary.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OfficialyALibrary {

    public static final String MODID = "officialyalibrary";


    public OfficialyALibrary(){
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    }

    @SubscribeEvent
    public static void commonSetup(final FMLCommonSetupEvent event) {

    }
}