package net.bliss.tutorialmod.event;

import net.bliss.tutorialmod.util.IEntityDataSaver;
import net.bliss.tutorialmod.util.ThirstData;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import java.util.Random;

public class PlayerTickHandler implements ServerTickEvents.StartTick {
    @Override
    public void onStartTick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            if(new Random().nextFloat() <= 0.005f) {
                IEntityDataSaver dataPlayer = ((IEntityDataSaver) player);
                ThirstData.removeThirst(dataPlayer,1);
                player.sendMessage(Text.literal("Removed Thirst"));
            }
        }
    }
}
