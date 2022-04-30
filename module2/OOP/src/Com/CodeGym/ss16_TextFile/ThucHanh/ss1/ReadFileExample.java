package Com.CodeGym.ss16_TextFile.ThucHanh.ss1;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String FilePath) {
        try {

            File file = new File(FilePath);

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line="";
            int sum = 0;
            while ((line = bufferedReader.readLine())!= null ){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("tổng" +sum);
        }catch (Exception e ){
            e.printStackTrace();
            System.out.println("File không tồn tại");
        }
    }
}
