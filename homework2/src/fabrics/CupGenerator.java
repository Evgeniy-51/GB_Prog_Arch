package fabrics;

import interfaces.IGameItem;
import products.Cup;

public class CupGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem(){
        return new Cup();
    }
}
