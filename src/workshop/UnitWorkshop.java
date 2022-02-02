package workshop;

import arc.util.*;
import mindustry.mod.*;
import mindustry.ctype.*;
import workshop.content.*;

public class UnitWorkshop extends Mod{
    private final ContentList[] content = {
        new UWBlocks()
    };

    public UnitWorkshop(){
        Log.info("Constructor has been called.");
    }

    @Override
    public void loadContent(){
        for(ContentList list : content){
            list.load();
        }
    }

}
