package workshop.world.blocks;

import mindustry.world.*;
import mindustry.world.blocks.payloads.*;
import mindustry.gen.*;

public class Workshop extends PayloadBlock{
    public Workshop(String name){
        super(name);

        buildVisibility = BuildVisibility.shown;
        category = Category.units;
        configurable = true;
    }

    public class WorkshopBuild extends PayloadBlockBuild{
    }
}
