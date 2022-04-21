package Com.CodeGym.ss14_Sort.ThucHanh.ss1;

import static Com.CodeGym.ss14_Sort.ThucHanh.ss1.BubbleSort.arr;

public class Main {
    public static void main(String[] args) {

        BubbleSort.bubbleSort(arr);
        for (int i =0; i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
