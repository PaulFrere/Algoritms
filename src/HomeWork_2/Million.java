package HomeWork_2;

import java.util.ArrayList;
import java.util.Random;

public class Million {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<>(1000000);
        for (int i = 0; i < arr.size(); i++){
            arr.add(random.nextInt());
        }
        long a = System.currentTimeMillis();
//
//        // пузырьковая сортировка
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < arr.size() - 1; i++) {
//                if(arr.get(i) > arr.get(i + 1)){
//                    isSorted = false;
//
//                    buf = arr.get(i);
//                    arr.set(i, arr.get(i + 1));
//                    arr.set(i + 1, buf);
//                }
//            }
//        }

        /*
        //сортировка методом вставки
        for (int i = 1; i < arr.size(); i++) {
            int current = arr.get(i);
            int j = i - 1;
            while(j >= 0 && current < arr.get(j)) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, current);
        }
         */

        //сортировка методом выбора
        for (int i = 0; i < arr.size(); i++) {
            int min = arr.get(i);
            int minId = i;
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(j) < min) {
                    min = arr.get(j);
                    minId = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, min);
            arr.set(minId, temp);
        }

        System.out.println("Продолжительность метода: " + (System.currentTimeMillis() - a) * 0.001 + "секунд");
    }
}
