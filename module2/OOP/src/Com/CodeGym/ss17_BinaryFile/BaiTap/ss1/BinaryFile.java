package Com.CodeGym.ss17_BinaryFile.BaiTap.ss1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryFile {
    public void WriteFile(List<Product> products) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("OOP/src/Com/CodeGym/ss17_BinaryFile/BaiTap/ss1/Data.txt",true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Product> readFile( ) {
        List<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream("OOP/src/Com/CodeGym/ss17_BinaryFile/BaiTap/ss1/Data.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             products = (List<Product>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
