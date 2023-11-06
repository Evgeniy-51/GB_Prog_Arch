package fabrics;

import interfaces.IGameItem;
import products.Gold;
import products.Silver;

public class SilverGenerator extends ItemGenerator {
    @Override
    public IGameItem createItem() {
        return new Silver();
    }
}
