package workshop.world.blocks;

import arc.scene.ui.layout.*;
import arc.scene.style.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.payloads.*;
import workshop.world.blocks.*;
import workshop.type.*;

public class Workshop extends PayloadBlock{
    public Block output;
    public WeaponRecipe[] recipes;

    public Workshop(String name){
        super(name);

        size = 5;
        outputsPayload = true;
        rotate = true;
        update = true;
        buildVisibility = BuildVisibility.shown;
        category = Category.units;
        configurable = true;
    }

    public class WorkshopBuild extends PayloadBlockBuild<BuildPayload>{
        public ItemStack[] itemCost = ItemStack.with();
        Boolean done = false;

        @Override
        public void update(){
            super.update();
            if (payload != null && done) moveOutPayload();
        }

        @Override
        public void buildConfiguration(Table table){
            table.button(Icon.download, () -> createPayload());
            table.button(Icon.star, () -> done = true);
            table.row();
            for(WeaponRecipe recipe : recipes){
                table.button(new TextureRegionDrawable(recipe.weapon.region), 32, () -> buildWeapon(recipe));
            }
        }

        // temporary method for making CompactPayload
        public void createPayload(){
            payload = new BuildPayload(output, this.team);
            if(payload.build instanceof CompactPayload.CompactPayloadBuild comp) {
                comp.setUnit(UnitTypes.dagger);
            };
            Log.info(this.payload);
        }

        public void buildWeapon(WeaponRecipe weapon){
            if(payload.build instanceof CompactPayload.CompactPayloadBuild comp) {
                comp.weapons.add(weapon.weapon);
            };
        }
    }
}
