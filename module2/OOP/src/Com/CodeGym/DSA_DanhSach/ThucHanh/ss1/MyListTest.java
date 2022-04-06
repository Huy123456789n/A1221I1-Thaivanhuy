package Com.CodeGym.DSA_DanhSach.ThucHanh.ss1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger = new MyList<Integer>();
        ListInteger.add(1);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(4);
        ListInteger.add(3);

        System.out.println("Element 4 " + ListInteger.get(4));
        System.out.println("Element 3 " + ListInteger.get(3));
        System.out.println("Element 1 " + ListInteger.get(1));

        ListInteger.get(-1);
        System.out.println("Element -1 " + ListInteger.get(-1));
    }
}
