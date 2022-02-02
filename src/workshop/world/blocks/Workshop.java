package workshop.world.blocks;

import arc.scene.ui.layout.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.payloads.*;

public class Workshop extends PayloadBlock{
    public Workshop(String name){
        super(name);

        buildVisibility = BuildVisibility.shown;
        category = Category.units;
        configurable = true;
    }

    public class WorkshopBuild extends PayloadBlockBuild{
        @Override
        public void buildConfiguration(Table table){
            table.button(Icon.download, () -> createPayload());
        }

        // temporary method for making CompactPayload
        public void createPayload(){
            this.payload = new BuildPayload();
        }
    }
}
