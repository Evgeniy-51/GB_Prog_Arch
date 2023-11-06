package fabrics;

import interfaces.IGameItem;
import products.Medal;

public class MedalGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem(){
        return new Medal();
    }
}
