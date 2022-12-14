package net.bliss.tutorialmod.networking;

import net.bliss.tutorialmod.TutorialMod;
import net.bliss.tutorialmod.networking.packet.DrinkingC2SPacket;
import net.bliss.tutorialmod.networking.packet.EnergySyncS2CPacket;
import net.bliss.tutorialmod.networking.packet.ExampleC2SPacket;
import net.bliss.tutorialmod.networking.packet.ThirstSyncDataS2CPacket;
import net.bliss.tutorialmod.util.ThirstData;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class ModMessages {
    public static final Identifier DRINKING_ID = new Identifier(TutorialMod.MOD_ID, "drinking");
    public static final Identifier THIRST_SYNC_ID = new Identifier(TutorialMod.MOD_ID, "thirst_sync");
    public static final Identifier EXAMPLE_ID = new Identifier(TutorialMod.MOD_ID, "example");

    public static final Identifier ENERGY_SYNC = new Identifier(TutorialMod.MOD_ID, "energy_sync");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::receive);
        ServerPlayNetworking.registerGlobalReceiver(DRINKING_ID, DrinkingC2SPacket::receive);
    }

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(THIRST_SYNC_ID, ThirstSyncDataS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(ENERGY_SYNC, EnergySyncS2CPacket::receive);
    }
}