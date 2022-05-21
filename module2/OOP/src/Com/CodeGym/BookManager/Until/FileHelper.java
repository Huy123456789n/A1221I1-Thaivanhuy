package Com.CodeGym.BookManager.Until;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper<T> {
    public void Writer(String path, boolean isAppend, List<T> t){
        try {
            FileWriter fileWriter = new FileWriter(path,isAppend);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (T line:t) {
                bufferedWriter.write(line.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List Read(String path) {
        List<String> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null) {
                if (!line.isEmpty()) {
                    result.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
