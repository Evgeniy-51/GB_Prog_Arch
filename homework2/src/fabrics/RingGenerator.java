package fabrics;

import interfaces.IGameItem;
import products.Ring;

public class RingGenerator extends ItemGenerator{
    public IGameItem createItem(){
        return new Ring();
    }
}
