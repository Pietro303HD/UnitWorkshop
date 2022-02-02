package workshop.content;

import mindustry.ctype.*;
import workshop.world.blocks.*;

public class UWBlocks extends ContentList{
    public static Block unitCrate;

    @Override
    public void load() {
        unitCrate = new CompactPayload("unit-crate");
    }
}
