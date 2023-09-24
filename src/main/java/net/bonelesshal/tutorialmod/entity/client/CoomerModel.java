package net.bonelesshal.tutorialmod.entity.client;

import net.bonelesshal.tutorialmod.TutorialMod;
import net.bonelesshal.tutorialmod.entity.custom.CoomerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CoomerModel extends AnimatedGeoModel<CoomerEntity> {
    @Override
    public ResourceLocation getModelResource(CoomerEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/geckocoomer.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CoomerEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/coomerbod.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CoomerEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/chomper.animation.json");
    }
}
