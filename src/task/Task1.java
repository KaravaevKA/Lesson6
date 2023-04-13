package task;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Task1 {
    public static Integer[] fillArray(Integer[] array){
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(25);
        }
        return array;
    }

    public static void printArr(Integer[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static Set<Integer> fillSetInteger(Integer[] arr){
        return Arrays.stream(arr).collect(Collectors.toSet());
    }
}
