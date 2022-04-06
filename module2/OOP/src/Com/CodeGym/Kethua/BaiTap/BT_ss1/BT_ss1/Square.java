package Com.CodeGym.Kethua.BaiTap.BT_ss1.BT_ss1;

public class Square extends Geometry{
    double area = 10;
    @Override
    public String resize(double percent) {
        return " Square " + area * percent + "%";
    }
}
