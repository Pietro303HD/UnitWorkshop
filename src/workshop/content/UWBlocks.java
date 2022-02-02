package workshop.content;

import mindustry.ctype.*;
import mindustry.world.*;
import workshop.world.blocks.*;

public class UWBlocks implements ContentList{
    public static Block unitCrate;

    @Override
    public void load() {
        unitCrate = new CompactPayload("unit-crate");
    }
}
