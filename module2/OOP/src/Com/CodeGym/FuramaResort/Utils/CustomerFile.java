package Com.CodeGym.FuramaResort.Utils;

import Com.CodeGym.FuramaResort.Libs.Libs;
import Com.CodeGym.FuramaResort.Model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerFile {
    static List<Customer> customers = new ArrayList<>();
    static Libs libs = new Libs();
    public static void WriterFile(Customer customer) {
        try {
            FileWriter fileWriter = new FileWriter("OOP/src/Com/CodeGym/FuramaResort/Data/Customer.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(getInformation(customer));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String getInformation(Customer customer) {
        return "Mã Khách Hàng :" + customer.getCustomerCode() +"\n"
                +"Tên Khách Hàng :" + customer.getName() +"\n"
                + "Ngày Sinh : " +customer.getDateOfBirth() +"\n"
                + "Giới Tính : " + customer.getGender() + "\n"
                + "CMND : " + customer.getCMND() + "\n"
                + "SDT :"  + customer.getPhoneNumber() + "\n"
                + "Loại Khách Hàng:" + customer.getCustomerType();
    }
    public void ReadFile() {
        try {
            FileReader fileReader = new FileReader("OOP/src/Com/CodeGym/FuramaResort/Data/Customer.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            Customer customer;
            customers = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
