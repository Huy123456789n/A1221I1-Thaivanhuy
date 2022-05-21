package Com.CodeGym.Product.Until;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriterFile<T> {

    public void WriterFile(String part,boolean check, List<T> product)  {
        try {
            FileWriter fileWriter = new FileWriter(part,check);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (T product1: product)
            {bufferedWriter.write(product1.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<String> ReadFile(String part) {
        List products = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(part);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    products.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
