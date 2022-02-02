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

public class TestBlock extends PayloadBlock{
    public TestBlock(String name){
        super(name);

        size = 5;
        outputsPayload = true;
        rotate = true;
        update = true;
        buildVisibility = BuildVisibility.shown;
        category = Category.units;
        configurable = true;
    }

    public class TestBuild extends PayloadBlockBuild<BuildPayload>{

        @Override
        public void buildConfiguration(Table table){
            table.button(Icon.download, () -> {
                payload = new BuildPayload(Vars.content.blocks.router, team);
            });           
        }

    }
}
