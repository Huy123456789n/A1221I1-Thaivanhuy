package Com.CodeGym.TestCode;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Arrays;

public class Test {


                public static void main(String[] args) {
                        String str = "HELLO WORLD";
                        int vcount = 0, ccount = 0;
                        str = str.toLowerCase();
                        for(int i = 0; i < str.length(); i++)
                        { char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vcount++; } else if((ch >= 'a'&& ch <= 'z')) {
                                ccount++;
                        }
                        }
                        System.out.println("Số nguyên âm: " + vcount);
                        System.out.println("Số phụ âm: " + ccount);
                }


}