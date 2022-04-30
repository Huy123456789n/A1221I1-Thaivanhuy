package Com.CodeGym.ss14_Sort.BaiTap.ss1;

public class InsertionSort {
   static int[] arr = {6,2,9,12,1,5,9,13};
    public static void Sort(int[] arr) {
        int temp = 0;
        int j = 1;
        for (int i=1;i<arr.length;i++) {
            temp = arr[i];
            j= i -1;
        }
        while (j>=0 && temp > arr[j]) {
            arr[j +1] = arr[j];
            j = j-1;
        }
        arr[j+1] = temp;

    }

    public static void main(String[] args) {
        Sort(arr);
        for (int arr1: arr
             ) {
            System.out.print(arr1 + " ");

        }


    }
}
