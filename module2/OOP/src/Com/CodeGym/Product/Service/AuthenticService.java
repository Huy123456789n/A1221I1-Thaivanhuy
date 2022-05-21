package Com.CodeGym.Product.Service;

import Com.CodeGym.Product.Model.Authentic;
import Com.CodeGym.Product.Model.Product;
import Com.CodeGym.Product.Until.ReadAndWriterFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface AuthenticService extends ProductService {

    public class AuthenticServiceIlm implements AuthenticService {
        static List<Authentic> authentics = new ArrayList<>();
        private static ReadAndWriterFile readAndWriterFile = new ReadAndWriterFile();

        @Override
        public void AddProduct(Product product) {
            result();
            int LastId =0;
            if(authentics.size() > 0) {
                LastId = authentics.get(authentics.size()-1).getId();
                product.setId(LastId +1);
            }
            readAndWriterFile.WriterFile("OOP/src/Com/CodeGym/Product/Data/Authentic.csv", true, Collections.singletonList(product));
        }
        @Override
        public void Delete(int id) {
            result();
            for (int i = 0; i < authentics.size(); i++) {
                Authentic authentic = authentics.get(i);
                if (id == authentic.getId()) {
                    authentics.remove(authentic);
                    readAndWriterFile.WriterFile("OOP/src/Com/CodeGym/Product/Data/Authentic.csv", false, authentics);
                }
                System.out.println("Tên Sản phẩm không tồn tại");
            }
        }
        @Override
        public void Search(String name) {
            result();
        for (int i=0;i<authentics.size();i++) {
            Product product = authentics.get(i);
            if (name.equals(product.getName())){
                System.out.println(product);
            }
        }
        }

        @Override
        public void DisplayAll() {
            result();
            for (Authentic p : authentics) {
                System.out.println(p);
            }
        }
        public List result() {
            List<String> Result = readAndWriterFile.ReadFile("OOP/src/Com/CodeGym/Product/Data/Authentic.csv");
            for (String line : Result) {
                String[] temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                String name = temp[1];
                Double price = Double.parseDouble(temp[2]);
                String producer = temp[3];
                String time = temp[4];
                Authentic authentic = new Authentic(id, name, price, producer, time);
                authentics.add(authentic);
            }
            return authentics;
        }
    }
}
