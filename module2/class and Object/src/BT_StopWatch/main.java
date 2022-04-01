package BT_StopWatch;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        float start= 0.0f;
        float stop=0.0f;
        StopWatch stopWatch =new StopWatch(start,stop);
        for (int i=0; i<100;i++) {
            start = stopWatch.start();
            System.out.println("Hello World");
        }
        stop = stopWatch.stop();
        float total = stop - start;
        System.out.println("Time :" + total);
    }

}
