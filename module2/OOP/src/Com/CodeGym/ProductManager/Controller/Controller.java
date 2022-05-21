package Com.CodeGym.ProductManager.Controller;

import Com.CodeGym.ProductManager.Service.ProductService;
import Com.CodeGym.ProductManager.model.HangChinhHang;

public class Controller {
    ProductService productService = new ProductService.ProductServiceIlm();
    public void AddNew(HangChinhHang hangChinhHang) {
        productService.AddNew(hangChinhHang);
    }

    public int getid() {
        return productService.getid();
    }
}
