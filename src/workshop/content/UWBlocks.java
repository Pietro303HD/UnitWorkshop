package workshop.content;

import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.world.*;
import workshop.world.blocks.*;
import workshop.type.*;

public class UWBlocks implements ContentList{
    public static Block unitCrate, workshop;

    @Override
    public void load() {
        unitCrate = new CompactPayload("unit-crate");
        workshop = new Workshop("workshop"){{
            output = unitCrate;
            recipes = new WeaponRecipe[]{
                new WeaponRecipe(ItemStack.with(Items.copper, 50, Items.silicon, 100), UnitTypes.scepter.weapons.get(0)),
                new WeaponRecipe(ItemStack.with(Items.lead, 200, Items.graphite, 70, Items.silicon, 120), UnitTypes.retusa.weapons.get(0))
            };
        }};
    }
}
