package Com.CodeGym.ss16_TextFile.ThucHanh.ss2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriterFile {
    public List<Integer> readfile(String filePath){
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }
    public void WriterFile(String linePath,int max) {
        try {
            FileWriter writer = new FileWriter(linePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá Trị lớn nhất" + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
