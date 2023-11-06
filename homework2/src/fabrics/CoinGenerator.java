package fabrics;

import interfaces.IGameItem;
import products.Coin;

public class CoinGenerator extends ItemGenerator{
    @Override
    public IGameItem createItem(){
        return new Coin();
    }
}
