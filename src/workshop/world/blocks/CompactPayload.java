package workshop.world.blocks;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import arc.struct.*;
import mindustry.entities.bullet.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;

public class CompactPayload extends Block{
    public CompactPayload(String name){
        super(name);

        buildVisibility = BuildVisibility.sandboxOnly;
        category = Category.units;
    }

    public class CompactPayloadBuild extends Building{
        Seq<Weapon> weapons = Seq.with();
        UnitType unit;

        public UnitType getUnit() {
            return unit;
        }

        public Seq<Weapon> getWeapons() {
            return weapons;
        }

        public void setUnit(UnitType unit) {
            this.unit = unit;
        }
    }
}
