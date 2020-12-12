package HomeWork_5;

public class Bag {
    static int[] cost = new int[] {1486, 5269, 456, 359, 598, 987, 4786, 157};
    static int[] weight = new int[] {7, 5, 9, 1, 2, 1, 4, 5};
    static int backpackVolume = 30;

    public static void main(String[] args) {

        System.out.println(backpack(cost.length - 1, backpackVolume));}

    private static int backpack(int i, int _backpackVolume) {
        if (i < 0) {
            return 0;
        }
        if (weight[i] > _backpackVolume) {
            return backpack(i-1, _backpackVolume);
        } else {
            return Math.max(backpack(i-1, _backpackVolume), backpack(i-1, _backpackVolume - weight[i]) + cost[i]);
        }
    }
}
