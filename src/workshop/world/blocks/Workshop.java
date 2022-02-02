package workshop.world.blocks;

import arc.scene.ui.layout.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.payloads.*;
import workshop.world.blocks.*;

public class Workshop extends PayloadBlock{
    public Block output;

    public Workshop(String name){
        super(name);

        size = 3;
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
            this.payload = new BuildPayload(output, this.team);
            ((CompactPayload) this.payload).build.setUnit(UnitTypes.dagger);
            ((CompactPayload) this.payload).build.weapons.add(UnitTypes.scepter.weapons.get(0));
            moveOutPayload();
        }
    }
}
