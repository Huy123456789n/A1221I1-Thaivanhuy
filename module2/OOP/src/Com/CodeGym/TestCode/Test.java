package Com.CodeGym.TestCode;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {

                public static void main(String[] args) {
                    String str = "Hello world";
                    char temp = 0;
                    char ch[]=str.toCharArray();
                    for (int j =ch.length-1;j>=0;j--){
                        System.out.print(ch[j]);
                    }
//                    int [] array = {1,2,3,4,5,6,7,8};
//                    int temp1 =0;
//                 for (int i =array.length-1;i>=0;i--){
//                     System.out.println(array[i]);
//                 }
                }
}