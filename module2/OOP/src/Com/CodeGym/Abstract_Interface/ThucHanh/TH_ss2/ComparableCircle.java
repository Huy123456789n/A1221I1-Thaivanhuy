package Com.CodeGym.Abstract_Interface.ThucHanh.TH_ss2;

import Com.CodeGym.Kethua.ThucHanh.TH_ss1.Circle;

public class ComparableCircle extends Circle implements Comparable {
    public ComparableCircle() {
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
