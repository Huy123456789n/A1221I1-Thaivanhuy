package Com.CodeGym.Abstract_Interface.ThucHanh.TH_ss1;

public class AbstractTest {
    public static void main(String[] args) {
        Animal[] animal=new Animal[2];
        animal [0] = new Tiger();
        animal [1] = new Chicken();
        for (Animal arr: animal) {
            arr.MakeSound();
            System.out.println(arr.MakeSound());
        }
        Fruit[] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruits: fruit
             ) { fruits.HowToEat();
            System.out.println(fruits.HowToEat());
        }
    }
}
