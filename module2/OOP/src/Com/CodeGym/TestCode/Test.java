package Com.CodeGym.TestCode;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Arrays;

public class Test {

                public static void main(String[] args) {
                        int [] array = {3,4,2,6,4,2,8};
                    int temp = array[0];
                    for (int i = 1;i< array.length;i++) {
                        if (temp == array[i]){
                            System.out.println("số bị trùng" + array[i] + "temp " + temp);
                        } else {
                            temp = array[i+1];
                        }
                    }
                }
}