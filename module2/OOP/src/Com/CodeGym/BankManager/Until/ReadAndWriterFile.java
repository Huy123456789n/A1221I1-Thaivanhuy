package Com.CodeGym.BankManager.Until;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriterFile<T> {
    public void WriterFile(String part, boolean check, List<T> t) {
        try {
            FileWriter fileWriter = new FileWriter(part, check);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (T lists : t) {
                bufferedWriter.write(lists.toString());
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> ReadFile(String part) {
        List<String> ListFile = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(part);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    ListFile.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ListFile;
    }
}
