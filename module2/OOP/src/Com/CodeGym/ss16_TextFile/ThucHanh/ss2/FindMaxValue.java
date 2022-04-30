package Com.CodeGym.ss16_TextFile.ThucHanh.ss2;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> number) {
        int max = number.get(0);
        for (int i =0;i< number.size();i++) {
            if(max < number.get(i)) {
                max = number.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriterFile readAndWriterFile = new ReadAndWriterFile();
        List<Integer> number = readAndWriterFile.readfile("OOP/src/Com/CodeGym/ss16_TextFile/ThucHanh/ss2/numbers.txt");
        int maxvalue = findMax(number);
        readAndWriterFile.WriterFile("OOP/src/Com/CodeGym/ss16_TextFile/ThucHanh/ss2/numbers.txt",maxvalue);
    }
}
