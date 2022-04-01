package Baitap;

import java.util.Scanner;

public class tongduongcheocuamatranvuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập hàng ngang");
        int row = scanner.nextInt();
        System.out.println("Nhập hàng dọc");
        int column = scanner.nextInt();
        int[][] array = new int[row][column];
        if (row == column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.println("Enter element Array" + "[" + i + "][" + j + "]");
                    array[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println("\n");
            }
            for (int i=0;i<array.length;i++) {
                int total =0;
                for (int j=0;j<array[i].length;j++) {
                    if(i==j){
                    total +=array[i][j];
                    }
                }
                System.out.println(total);
            }


        } else {
            System.out.println("Row = Column");
        }
    }
}
