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

public class Deployer extends PayloadBlock{

    public Deployer(String name){
        super(name);

        size = 3;
        outputsPayload = true;
        rotate = true;
        update = true;
        buildVisibility = BuildVisibility.shown;
        category = Category.units;
    }

    public class DeployerBuild extends PayloadBlockBuild<Payload>{
        Boolean done = false;
        Unit temp;

        @Override
        public void update(){
            super.update();
            if (payload != null && done) moveOutPayload();
            if (payload != null){
                if (payload.build instanceof CompactPayload.CompactPayloadBuild){
                    temp = new UnitPayload(comp.unit.create(team));
                    temp.unit.weapons.add(UnitTypes.scepter.weapons.get(0));
                    payload = temp;
                    done = true;
                }
            }
        }

        /*
        public void buildWeapon(WeaponRecipe weapon){
            if(payload.build instanceof CompactPayload.CompactPayloadBuild comp) {
                comp.weapons.add(weapon.weapon);
            };
        }
        */
    }
}
