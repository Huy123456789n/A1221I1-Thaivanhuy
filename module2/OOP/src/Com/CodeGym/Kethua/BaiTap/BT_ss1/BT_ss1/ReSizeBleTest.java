package Com.CodeGym.Kethua.BaiTap.BT_ss1.BT_ss1;

public class ReSizeBleTest {
    public static void main(String[] args) {
        Geometry [] geometries = new Geometry[3];
        geometries[0] = new Circle();
        geometries[1] = new Rectangle();
        geometries[2] = new Square();
        for (Geometry geometrys: geometries
             ) {
            System.out.println(geometrys.resize(10));
        }
    }
}
