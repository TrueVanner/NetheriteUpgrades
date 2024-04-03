package me.vannername.netheriteupgrades;

import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UpgradeRecipe {
    ItemStack item;
    List<ItemStack> ingredients;

    public List<ItemStack> asList() {
        return Stream.of(ingredients).
    }
}
