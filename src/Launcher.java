import sort.InsertionSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Launcher {

    public static void main(String[] args){

        int times = 10;
        long seed = System.currentTimeMillis();
        Random r = new Random(seed);
        List<Integer> integerList = new ArrayList<>(16);
        int[] ints = new int[times];
        for (int i = 0; i < times; i++) {
            int randomInt = r.nextInt(10);
            integerList.add(randomInt);
            ints[i] = randomInt;
        }
        show(integerList);
        InsertionSort.sort(integerList);
        show(integerList);
        show(ints);
        InsertionSort.sort(ints);
        show(ints);
    }

    private static void show(List<Integer> list){

        for (Integer integer : list) {
            System.out.println(integer + "    ");
        }
        System.out.println();
    }

    private static void show(int[] list){

        for (int i : list) {
            System.out.println(i + "    ");
        }
        System.out.println();
    }
}
