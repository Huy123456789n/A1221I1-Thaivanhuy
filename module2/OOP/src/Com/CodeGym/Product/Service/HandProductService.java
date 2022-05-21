package Com.CodeGym.Product.Service;

import Com.CodeGym.Product.Model.Product;
import Com.CodeGym.Product.Until.ReadAndWriterFile;

import java.util.Collections;

public interface HandProductService extends ProductService{

    public class HandProductServiceIlm implements HandProductService{
        ReadAndWriterFile readAndWriterFile = new ReadAndWriterFile();
        @Override
        public void AddProduct(Product product) {
            readAndWriterFile.WriterFile("OOP/src/Com/CodeGym/Product/Data/HandProduct.csv",true, Collections.singletonList(product));
        }

        @Override
        public void Delete(int id) {

        }

        @Override
        public void Search(String name) {

        }

        @Override
        public void DisplayAll() {

        }
    }
}
