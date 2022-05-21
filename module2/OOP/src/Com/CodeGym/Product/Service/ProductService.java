package Com.CodeGym.Product.Service;

import Com.CodeGym.Product.Model.Product;

public interface ProductService<T> {
    public void AddProduct(Product product);
    public void Delete(int id);
    public void Search(String name);
    public void DisplayAll();


    public class ProductServiceIlm implements ProductService{

        @Override
        public void AddProduct(Product product) {

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
