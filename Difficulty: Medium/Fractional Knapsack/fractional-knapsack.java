class Solution {
    static class Item {
        int value, weight;
        double ratio;
        Item(int v, int w) {
            value = v;
            weight = w;
            ratio = (double) v / w;
        }
    }

    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) items[i] = new Item(values[i], weights[i]);

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double maxValue = 0.0;
        for (Item item : items) {
            if (W == 0) break;
            if (item.weight <= W) {
                maxValue += item.value;
                W -= item.weight;
            } else {
                maxValue += item.ratio * W;
                W = 0;
            }
        }
        return maxValue;
    }
}
