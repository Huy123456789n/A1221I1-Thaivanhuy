package Com.CodeGym.BookManager.Service;

import Com.CodeGym.BookManager.Model.BookManager;
import Com.CodeGym.BookManager.Model.Novel;
import Com.CodeGym.BookManager.Model.TextBox;
import Com.CodeGym.BookManager.Until.FileHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BookService {
    List<BookManager> bookManagers = new ArrayList<>();
    private static FileHelper fileHelper = new FileHelper();

    public void AddNew(BookManager bookManager) {
        int lastID;
        if (bookManagers.size() > 0) {
            lastID = bookManagers.get(bookManagers.size() - 1).getId();
            bookManager.setId(lastID + 1);
            bookManagers.add(bookManager);
        }
        fileHelper.Writer("OOP/src/Com/CodeGym/BookManager/Data/BookData.csv", true, Collections.singletonList(bookManager));

    }

    public BookService() {
        bookManagers = MapToBook();
    }

    public void Delete(int Id) {
        for (int i = 0; i < bookManagers.size(); i++) {
            if (bookManagers.get(i).getId() == Id) {
                bookManagers.remove(i);
                fileHelper.Writer("OOP/src/Com/CodeGym/BookManager/Data/BookData.csv", false, bookManagers);
                System.out.println("Delete Success");
            }
        }
    }

    public void Search(String name) {
        for(int i =0;i<bookManagers.size();i++) {
            if (name.equals(bookManagers.get(i).getName())){
                System.out.println(bookManagers.get(i));
            }
        }
    }
    public List<BookManager> findAll() {
        return bookManagers;
    }



    public List MapToBook() {
        List<BookManager> result = new ArrayList<>();
        List<String> line = fileHelper.Read("OOP/src/Com/CodeGym/BookManager/Data/BookData.csv");
        for (String lines : line) {
            String[] temp = lines.split(",");
            int id = Integer.parseInt(temp[0]);
            String name = temp[1];
            String tacGia = temp[2];
            int namSanXuat = Integer.parseInt(temp[3]);
            Double price = Double.parseDouble(temp[4]);
            String moTa = temp[5];
            if (temp[8].equals("Novel")) {
                String country = temp[6];
                String status = temp[7];
                Novel novel = new Novel(id, name, tacGia, namSanXuat, price, moTa, country, status);
                result.add(novel);
            } else {
                String Color = temp[6];
                int quantity = Integer.parseInt(temp[7]);
                TextBox textBox = new TextBox(id, name, tacGia, namSanXuat, price, moTa, Color, quantity);
                result.add(textBox);
            }
    }
        return result;
    }
}
