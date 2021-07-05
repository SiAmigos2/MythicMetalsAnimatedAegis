package nourl.mythicmetals.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import nourl.mythicmetals.registry.RegisterItems;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@SuppressWarnings("ALL")
public enum MythicArmorMaterials implements ArmorMaterial {
    ADAMANTITE("adamantite", 30, new int[]{3, 6, 8, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.ADAMANTITE_INGOT);
    }),
    AETHERIUM("aetherium", 33, new int[]{4, 6, 8, 4}, 18, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.5F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.AETHERIUM_INGOT);
    }),
    AQUARIUM("aquarium", 16, new int[]{2, 5, 6, 2}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.AQUARIUM_INGOT);
    }),
    BANGLUM("banglum", 14, new int[]{2, 5, 6, 3}, 1, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.BANGLUM_INGOT);
    }),
    BRONZE("bronze", 17, new int[]{3, 5, 6, 2}, 14, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.BRONZE_INGOT);
    }),
    CARMOT("carmot", 21, new int[]{3, 6, 8, 3}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.CARMOT_INGOT);
    }),
    CELESTIUM("celestium", 38, new int[]{4, 8, 10, 4}, 24, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.CELESTIUM_INGOT);
    }),
    COPPER("copper", 8, new int[]{1, 3, 4, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    DISCORDIUM("discordium", 27, new int[]{3, 6, 8, 3}, 19, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.DISCORDIUM_INGOT);
    }),
    DURASTEEL("durasteel", 25, new int[]{3, 6, 8, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.DURASTEEL_INGOT);
    }),
    ETHERITE("etherite", 37, new int[]{4, 6, 8, 4}, 21, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.ETHERITE_INGOT);
    }),
    HALLOWED("hallowed", 40, new int[]{4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.HALLOWED_INGOT);
    }),
    KYBER("kyber", 19, new int[]{2, 6, 8, 2}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.KYBER_INGOT);
    }),
    METALLURGIUM("metallurgium", 69, new int[]{5, 9, 12, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 0.2F, () -> {
        return Ingredient.ofItems(RegisterItems.METALLURGIUM_INGOT);
    }),
    MIDAS_GOLD("midas_gold", 10, new int[]{1, 3, 5, 2}, 24, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.MIDAS_GOLD_INGOT);
    }),
    MYTHRIL("mythril", 28, new int[]{4, 6, 8, 3}, 22, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.MYTHRIL_INGOT);
    }),
    ORICHALCUM("orichalcum", 42, new int[]{4, 7, 9, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.ORICHALCUM_INGOT);
    }),
    OSMIUM("osmium", 16, new int[]{2, 5, 7, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.05F, () -> {
        return Ingredient.ofItems(RegisterItems.OSMIUM_INGOT);
    }),
    PALLADIUM("palladium", 32, new int[]{3, 6, 8, 3}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.PALLADIUM_INGOT);
    }),
    PROMETHEUM("prometheum", 18, new int[]{3, 6, 8, 3}, 14, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.PROMETHEUM_INGOT);
    }),
    QUICKSILVER("quicksilver", 37, new int[]{4, 6, 8, 4}, 15, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 2.5F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.QUICKSILVER_INGOT);
    }),
    RUNITE("runite", 27, new int[]{3, 6, 7, 3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.RUNITE_INGOT);
    }),
    SILVER("silver", 8, new int[]{2, 3, 5, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.SILVER_INGOT);
    }),
    STAR_PLATINUM("star_platinum", 34, new int[]{3, 6, 8, 3}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F, 0.1F, () -> {
        return Ingredient.ofItems(RegisterItems.STAR_PLATINUM);
    }),
    STEEL("steel", 19, new int[]{2, 5, 7, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.STEEL_INGOT);
    }),
    STORMYX("stormyx", 30, new int[]{3, 6, 8, 3}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F, 0.0F, () -> {
        return Ingredient.ofItems(RegisterItems.STORMYX_INGOT);
    });


    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private MythicArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy<>(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredientSupplier.get();
    }

    @Environment(EnvType.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public static final List KNOCKBACKABLE_ARMOR_MATERIALS = Arrays.asList(new ArmorMaterial[]{
            OSMIUM, METALLURGIUM
    });

}
