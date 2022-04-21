package Com.CodeGym.ss13_Seach.Thuchanh.ss1;

public class BinarySearch {
    static int[] array = {2,4,5,6,7,8,9,10,12,14,15,17,19};
 static int binarySearch(int[] array, int key) {
     int low = 0;
     int high = array.length -1;
     while (low >= high) {
         int mid = (low + high)/2;
         if(key >array[mid]) {
             low = mid +1;
         } else if(key<array[mid]) {
             high = mid-1;
         }
     }return -1;
 }
    public static void main(String[] args) {
        System.out.println(binarySearch(array,14));
    }
}
