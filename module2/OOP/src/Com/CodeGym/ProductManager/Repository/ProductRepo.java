package Com.CodeGym.ProductManager.Repository;

import Com.CodeGym.ProductManager.model.HangChinhHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface ProductRepo {
    public void AddNew(HangChinhHang hangChinhHang);
    public void Delete();
    public void DisplayAll();

    public int getID();

    class ProductRepoIml implements ProductRepo{

        @Override
        public void AddNew(HangChinhHang hangChinhHang) {
        try {
                FileWriter fileWriter = new FileWriter("OOP/src/Com/CodeGym/ProductManager/data/data.csv",true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.newLine();
                bufferedWriter.write(hangChinhHang.toString());
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public int getID() {
            List<HangChinhHang> hangChinhHangs = new ArrayList<>();
            try {
                FileReader fileReader = new FileReader("OOP/src/Com/CodeGym/ProductManager/data/data.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] temp = line.split(",");
                    HangChinhHang hangChinhHang = new HangChinhHang(Integer.parseInt(temp[0]),temp[1],Double.parseDouble(temp[2]) ,temp[3],temp[4]);
                    hangChinhHangs.add(hangChinhHang);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return hangChinhHangs.get(hangChinhHangs.size()-1).getIdProduct();
        }

        @Override
        public void Delete() {

        }

        @Override
        public void DisplayAll() {

        }
    }
}
