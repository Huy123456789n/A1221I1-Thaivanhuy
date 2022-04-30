package Com.CodeGym.FuramaResort.Utils;

import Com.CodeGym.FuramaResort.Model.Employee;

import java.io.*;

public class EmployeeFile {
    public static void WriterFile(Employee employee) {
        try {
            FileWriter fileWriter = new FileWriter("OOP/src/Com/CodeGym/FuramaResort/Data/Employee.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(getInformationEmployee(employee));
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static String getInformationEmployee(Employee employee) {
        return "Mã Nhân Viên :" + employee.getEmployeeCode() +"\n"
                +"Tên Nhân Viên :" + employee.getName() +"\n"
                + "Ngày Sinh : " +employee.getDateOfBirth() +"\n"
                + "Giới Tính : " + employee.getGender() + "\n"
                + "CMND : " + employee.getCMND() + "\n"
                + "SDT :"  + employee.getPhoneNumber() + "\n"
                + "Trình Độ Học Vấn:" + employee.getAcademicLevel() + "\n"
                +"Vị trí Nhân Viên:" + employee.getPositionStaff() + "\n"
                +"Lương:" + employee.getSalary();
    }
    public static void ReadFile() {
        try {
            FileReader fileReader = new FileReader("OOP/src/Com/CodeGym/FuramaResort/Data/Employee.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while (true) {
                try {
                    if ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
