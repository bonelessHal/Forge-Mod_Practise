package net.bonelesshal.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.bonelesshal.tutorialmod.TutorialMod;
import net.bonelesshal.tutorialmod.entity.custom.CoomerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CoomerRenderer extends GeoEntityRenderer<CoomerEntity> {
    public CoomerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CoomerModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(CoomerEntity instance) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/coomerbod.png");
    }

    @Override
    public RenderType getRenderType(CoomerEntity animatable, float partialTick, PoseStack poseStack,
                                    @Nullable MultiBufferSource bufferSource,
                                    @Nullable VertexConsumer buffer, int packedLight,
                                    ResourceLocation texture) {

        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
