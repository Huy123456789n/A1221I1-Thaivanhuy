package ThucHanh;
import java.util.Scanner;

public class TH_timgiatrinhonhattrongmang {
    public static void main(String[] args) {
        int[] array = {2, 34, 121, 1, 4, 5};
        int index;
        index = minArray(array);
        System.out.println("giá trị nhỏ nhất trong mảng là :" + array[index]);
    }
        public static int minArray (int[] array){
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[index]) {
                    index = i;
                }
            }
            return index;
        }
}
