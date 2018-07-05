package com.example;

import cc.hyperium.event.*;
import cc.hyperium.internal.addons.IAddon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;

public class AddonExample implements IAddon {
    @Override
    public void onLoad() {
        System.out.println("Sucesfully loaded Addon!");
        EventBus.INSTANCE.register(this);
    }

    @InvokeEvent
    private void onRender(RenderPlayerEvent event) {
        EntityPlayer player = event.getEntity();
        //if (player.getName().equalsIgnoreCase("SHARDcoder")) { Cos later [dev env thing]
        if (player.getName().contains("Player")) {
            EntityPigZombie disguise = new EntityPigZombie(player.worldObj);
            disguise.ticksExisted = 1;
            disguise.posX = player.posX;
            disguise.lastTickPosX = player.lastTickPosX;
            disguise.posY = player.posY;
            disguise.lastTickPosY = player.lastTickPosY;
            disguise.posZ = player.posZ;
            disguise.lastTickPosZ = player.lastTickPosZ;
            disguise.rotationPitch = player.rotationPitch;
            disguise.prevRotationPitch = player.prevRotationPitch;
            disguise.rotationYaw = player.rotationYaw;
            disguise.prevRotationYaw = player.prevRotationYaw;
            disguise.renderYawOffset = player.renderYawOffset;
            disguise.prevRenderYawOffset = player.prevRenderYawOffset;
            disguise.rotationYawHead = player.rotationYawHead;
            disguise.prevRotationYawHead = player.prevRotationYawHead;
            disguise.limbSwing = player.limbSwing;
            disguise.limbSwingAmount = player.limbSwingAmount;
            disguise.prevLimbSwingAmount = player.prevLimbSwingAmount;
            disguise.setInvisible(false);
            for (PotionEffect effect : player.getActivePotionEffects()) {
                if (effect.getPotionID() == 14)
                    disguise.setInvisible(true);
            }
            player.setInvisible(true);
            RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
            renderManager.renderEntitySimple(disguise, event.getPartialTicks());
        } else if (player.getName().equalsIgnoreCase("Technoblade")) {
            EntityPig disguise = new EntityPig(player.worldObj);
            disguise.ticksExisted = 1;
            disguise.posX = player.posX;
            disguise.lastTickPosX = player.lastTickPosX;
            disguise.posY = player.posY;
            disguise.lastTickPosY = player.lastTickPosY;
            disguise.posZ = player.posZ;
            disguise.lastTickPosZ = player.lastTickPosZ;
            disguise.rotationPitch = player.rotationPitch;
            disguise.prevRotationPitch = player.prevRotationPitch;
            disguise.rotationYaw = player.rotationYaw;
            disguise.prevRotationYaw = player.prevRotationYaw;
            disguise.renderYawOffset = player.renderYawOffset;
            disguise.prevRenderYawOffset = player.prevRenderYawOffset;
            disguise.rotationYawHead = player.rotationYawHead;
            disguise.prevRotationYawHead = player.prevRotationYawHead;
            disguise.limbSwing = player.limbSwing;
            disguise.limbSwingAmount = player.limbSwingAmount;
            disguise.prevLimbSwingAmount = player.prevLimbSwingAmount;
            disguise.setInvisible(false);
            for (PotionEffect effect : player.getActivePotionEffects()) {
                if (effect.getPotionID() == 14)
                    disguise.setInvisible(true);
            }
            player.setInvisible(true);
            RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
            renderManager.renderEntitySimple(disguise, event.getPartialTicks());
        } else {
            EntityPigZombie disguise = new EntityPigZombie(player.worldObj);
            disguise.ticksExisted = 1;
            disguise.posX = player.posX;
            disguise.lastTickPosX = player.lastTickPosX;
            disguise.posY = player.posY;
            disguise.lastTickPosY = player.lastTickPosY;
            disguise.posZ = player.posZ;
            disguise.lastTickPosZ = player.lastTickPosZ;
            disguise.rotationPitch = player.rotationPitch;
            disguise.prevRotationPitch = player.prevRotationPitch;
            disguise.rotationYaw = player.rotationYaw;
            disguise.prevRotationYaw = player.prevRotationYaw;
            disguise.renderYawOffset = player.renderYawOffset;
            disguise.prevRenderYawOffset = player.prevRenderYawOffset;
            disguise.rotationYawHead = player.rotationYawHead;
            disguise.prevRotationYawHead = player.prevRotationYawHead;
            disguise.limbSwing = player.limbSwing;
            disguise.limbSwingAmount = player.limbSwingAmount;
            disguise.prevLimbSwingAmount = player.prevLimbSwingAmount;
            disguise.setInvisible(false);
            for (PotionEffect effect : player.getActivePotionEffects()) {
                if (effect.getPotionID() == 14)
                    disguise.setInvisible(true);
            }
            player.setInvisible(true);
            RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
            renderManager.renderEntitySimple(disguise, event.getPartialTicks());
        }
    }

    @Override
    public void onClose() {
        System.out.println("Closing...");
    }
    
    @Override
    public void sendDebugInfo() {
    }
}
