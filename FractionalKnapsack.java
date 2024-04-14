package Armaan;
import java.util.*;

class Item {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class FractionalKnapsack {
    public static double getMaxValue(int[] weights, int[] values, int capacity) {
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < weights.length; i++) {
            itemList.add(new Item(weights[i], values[i]));
        }
        itemList.sort((item1, item2) -> Double.compare((double)item2.value / item2.weight, (double)item1.value / item1.weight));

        double maxValue = 0;

        for (Item item : itemList) {
            if (capacity >= item.weight) {
                // If the whole item can be taken
                maxValue += item.value;
                capacity -= item.weight;
            } else {
                
                double fraction = (double) capacity / item.weight;
                maxValue += item.value * fraction;
                break;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        double maxValue = getMaxValue(weights, values, capacity);
        System.out.println("Maximum value that can be obtained = " + maxValue);
    }
}
