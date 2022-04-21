package Com.CodeGym.ss14_Sort.ThucHanh.ss1;

public class BubbleSort {
    static int[] arr = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int [] arr) {
        boolean check = true;
        for (int i = 0; i < arr.length && check; i++) {
            check = false;
            for (int j = 0; j < arr.length - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
        }
    }
}

