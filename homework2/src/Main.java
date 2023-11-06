import fabrics.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GemGenerator());
        generators.add(new GoldGenerator());

        generators.add(new SilverGenerator());
        generators.add(new RingGenerator());
        generators.add(new CupGenerator());
        generators.add(new CoinGenerator());
        generators.add(new MedalGenerator());

        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            int listIndex = rnd.nextInt(generators.size());
//            *
            Integer[] rnd_list = new Integer[]{0, 1, 1, 1};
            listIndex = (listIndex > 1) ? listIndex : rnd_list[rnd.nextInt(rnd_list.length)];

            generators.get(listIndex).openReward();
        }

    }
}