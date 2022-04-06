package Com.CodeGym.Abstract_Interface.ThucHanh.TH_ss1;

public class Chicken extends Animal implements Edible{
    @Override
    public String MakeSound() {
        return "Chicken : Chuck - chuck!";
    }

    @Override
    public String HowToEat() {
        return "Could Be fried";
    }
}
