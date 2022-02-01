package workshop.world.blocks;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.entities.bullet.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;

public class Compact extends Block{
    public Compact(String name){
        super(name);

        buildVisibility = BuildVisibility.sandboxOnly;
        category = Category.units;
    }

    @Override
    public boolean canBeBuilt(){
        return false;
    }

    public class CompactBuild extends Building{
        Seq<Weapon> weapons = Seq.with();
        UnitType unit;
    }
}
