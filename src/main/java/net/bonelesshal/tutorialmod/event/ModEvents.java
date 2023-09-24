package net.bonelesshal.tutorialmod.event;

import net.bonelesshal.tutorialmod.TutorialMod;
import net.bonelesshal.tutorialmod.entity.ModEntityTypes;
import net.bonelesshal.tutorialmod.entity.custom.CoomerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


public class ModEvents {

    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID)
    public static class ForgeEvents{

    }

    @Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents{

        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.COOMER.get(), CoomerEntity.setAttributes());
        }

    }

}
