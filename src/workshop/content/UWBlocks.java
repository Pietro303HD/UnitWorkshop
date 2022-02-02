package workshop.content;

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
            recipes = [
                new WeaponRecipe(ItemStack.with(Item.copper, 50), UnitTypes.scepter.weapons.get(0))
            ];
        }};
    }
}
