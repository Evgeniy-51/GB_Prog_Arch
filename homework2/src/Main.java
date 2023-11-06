import fabrics.*;

import java.util.ArrayList;
import java.util.Arrays;
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

//        *
        List<Integer> index_list = new ArrayList<>(Arrays.asList(0, 1, 1, 1));
        for (int i = 2; i < 7; i++) {
            for (int j = 0; j < 10; j++) {
                index_list.add(i);
            }
        }

        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            int listIndex = index_list.get(rnd.nextInt(index_list.size()));
            generators.get(listIndex).openReward();
        }

    }
}