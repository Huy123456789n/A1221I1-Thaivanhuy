package Com.CodeGym.Kethua.BaiTap.BT_ss1.BT_ss1;

public class Rectangle extends Geometry{
    double area = 10;
    @Override
    public String resize(double percent) {
        return " Rectangle " + area* percent + "%";
    }
}
