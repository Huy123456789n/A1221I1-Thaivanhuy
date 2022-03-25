package ThucHanh;
import java.util.Scanner;

public class TH_timgiatrilonnhat {
    public static void main(String[] args) {
        int size;
        int array[];
        System.out.println("nhập size Array");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        if (size>20) {
            System.out.println("size quá giới hạn");
        } else {
            array =new int[size];
            for (int i =0;i<array.length;i++) {
                System.out.println("nhập element " + (i+1) +":");
                array[i] = scanner.nextInt();
            }
            System.out.println("element array :");
            for (int j =0;j<array.length;j++) {
                System.out.println(array[j]);
            }
            int max = array[0];
            int index =1;
            for (int i=0;i<array.length;i++) {
                if (array[i]>max) {
                    max = array[i];
                    index = i +1;
                }
            }
            System.out.println("số max" +max +"\n Index :" + index);
            }


        }

    }
