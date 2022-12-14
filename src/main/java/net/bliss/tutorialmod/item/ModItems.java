package net.bliss.tutorialmod.item;

import net.bliss.tutorialmod.TutorialMod;
import net.bliss.tutorialmod.block.ModBlocks;
import net.bliss.tutorialmod.item.custom.EightBallItem;
import net.bliss.tutorialmod.item.custom.EightBallItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryCodecs;

public class ModItems {
    public static final Item RAW_RUBIDIUM = registerItem("raw_rubidium",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBIDIUM)));
    public static final Item RUBIDIUM = registerItem("rubidium",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBIDIUM)));


    public static final Item EIGHT_BALL = registerItem("eight_ball",
            new EightBallItem(new FabricItemSettings().group(ModItemGroup.RUBIDIUM).maxCount(1)));

    public static final Item EGGPLANT_SEEDS = registerItem("eggplant_seeds",
            new AliasedBlockItem(ModBlocks.EGGPLAND_CROP,
                    new FabricItemSettings().group(ModItemGroup.RUBIDIUM)));

    public static final Item EGGPLANT = registerItem("eggplant",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBIDIUM)
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.debug("Registering Mod Items for " + TutorialMod.MOD_ID);
    }
    public static final Item KAUPENSWORD = registerItem("kaupensword",
            new SwordItem(ToolMaterials.DIAMOND, 10, 5f,
                    new FabricItemSettings().group(ModItemGroup.RUBIDIUM).maxCount(1)));
}
