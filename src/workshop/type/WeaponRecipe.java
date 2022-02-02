package workshop.type;

import mindustry.type.*;

public class WeaponRecipe{
    public Weapon weapon;
    public ItemStack[] requirements;

    public WeaponRecipe(ItemStack[] items, Weapon weapon){
        this.weapon = weapon;
        this.requirements = items;
    }
}
