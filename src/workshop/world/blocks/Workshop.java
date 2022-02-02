package workshop.world.blocks;

import mindustry.world.*;
import mindustry.world.blocks.payloads.*;
import mindustry.gen.*;
import arc.scene.ui.layout.*;

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
