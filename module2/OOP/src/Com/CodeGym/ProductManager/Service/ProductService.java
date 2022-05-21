package Com.CodeGym.ProductManager.Service;

import Com.CodeGym.ProductManager.Repository.ProductRepo;
import Com.CodeGym.ProductManager.model.HangChinhHang;

import java.util.ArrayList;
import java.util.List;

public interface ProductService {
    ProductRepo productRepo = new ProductRepo.ProductRepoIml();
    public void AddNew(HangChinhHang hangChinhHang);

    public int getid();


    public class ProductServiceIlm implements ProductService{
        List<HangChinhHang> hangChinhHangs = new ArrayList<>();

        @Override
        public void AddNew(HangChinhHang hangChinhHang) {

            productRepo.AddNew(hangChinhHang);
        }

        @Override
        public int getid() {
           return productRepo.getID();
        }
    }
}
